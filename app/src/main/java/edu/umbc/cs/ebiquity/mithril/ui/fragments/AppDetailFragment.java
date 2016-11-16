package edu.umbc.cs.ebiquity.mithril.ui.fragments;

import android.app.Fragment;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.umbc.cs.ebiquity.mithril.MithrilApplication;
import edu.umbc.cs.ebiquity.mithril.R;
import edu.umbc.cs.ebiquity.mithril.data.dbhelpers.MithrilDBHelper;
import edu.umbc.cs.ebiquity.mithril.data.model.PermData;
import edu.umbc.cs.ebiquity.mithril.ui.adapters.AppDetailRecyclerViewAdapter;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class AppDetailFragment extends Fragment {
    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    private MithrilDBHelper mithrilDBHelper;
    private SQLiteDatabase mithrilDB;
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;
    private View view;

    /**
     * An array of app permissions
     */
    private List<PermData> appPerms = new ArrayList<>();
    private String mAppName;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AppDetailFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static AppDetailFragment newInstance(int columnCount) {
        AppDetailFragment fragment = new AppDetailFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
            mAppName = getArguments().getString(MithrilApplication.getAppPkgNameTag());
        }
        Log.d(MithrilApplication.getDebugTag(), mAppName);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_app_detail_list, container, false);
        initData();
        iniViews();
        return view;
    }

    private void iniViews() {
        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            recyclerView.setAdapter(new AppDetailRecyclerViewAdapter(appPerms, mListener));
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
        }
    }

    private void initData() {
        mithrilDBHelper = new MithrilDBHelper(view.getContext());
        mithrilDB = mithrilDBHelper.getWritableDatabase();

        appPerms = mithrilDBHelper.getAppPermissions(mithrilDB, mAppName);
        Collections.sort(appPerms);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(PermData item);
    }
}
