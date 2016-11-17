package edu.umbc.cs.ebiquity.mithril.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.regex.Pattern;

import edu.umbc.cs.ebiquity.mithril.MithrilApplication;
import edu.umbc.cs.ebiquity.mithril.R;
import edu.umbc.cs.ebiquity.mithril.data.model.PermData;
import edu.umbc.cs.ebiquity.mithril.ui.fragments.AppDetailFragment.OnListFragmentInteractionListener;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PermData} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class AppDetailRecyclerViewAdapter extends RecyclerView.Adapter<AppDetailRecyclerViewAdapter.ViewHolder> {

    private final List<PermData> mValues;
    private final OnListFragmentInteractionListener mListener;
    private View view;

    public AppDetailRecyclerViewAdapter(List<PermData> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_app_detail, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        if (mValues.get(position).getPermissionProtectionLevel() == MithrilApplication.getConstPermissionProtectionLevelNormal()) {
            holder.mPermissionProtectionLevel.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.comment_check_outline, view.getContext().getTheme()));
        } else if (mValues.get(position).getPermissionProtectionLevel() == MithrilApplication.getConstPermissionProtectionLevelDangerous()) {
            holder.mPermissionProtectionLevel.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.comment_alert_outline, view.getContext().getTheme()));
        } else if (mValues.get(position).getPermissionProtectionLevel() == MithrilApplication.getConstPermissionProtectionLevelSignature()) {
            holder.mPermissionProtectionLevel.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.comment_processing_outline, view.getContext().getTheme()));
        } else if (mValues.get(position).getPermissionProtectionLevel() == MithrilApplication.getConstPermissionProtectionLevelPrivileged()) {
            holder.mPermissionProtectionLevel.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.comment_remove_outline, view.getContext().getTheme()));
        } else {
            holder.mPermissionProtectionLevel.setImageDrawable(view.getContext().getResources().getDrawable(R.drawable.comment_question_outline, view.getContext().getTheme()));
        }
        holder.mPermissionLabel.setText(mValues.get(position).getPermissionLabel());
//        holder.mPermissionName.setText(mValues.get(position).getPermissionName());
        holder.mPermissionName.setText(mValues.get(position).getPermissionProtectionLevel());

        if (mValues.get(position).getPermissionGroup() != MithrilApplication.getConstNoGroupForPermission()) {
            String[] words = mValues.get(position).getPermissionGroup().split(Pattern.quote("."));
            //In a group, the last word is most important for group identification, so use that I guess!
            holder.mPermissionGroup.setText(words[words.length - 1]);
        } else
            holder.mPermissionGroup.setText(mValues.get(position).getPermissionGroup());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ImageView mPermissionProtectionLevel;
        public final TextView mPermissionLabel;
        public final TextView mPermissionName;
        public final TextView mPermissionGroup;
        public PermData mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;

            mPermissionProtectionLevel = (ImageView) view.findViewById(R.id.perm_protection_lvl);
            mPermissionLabel = (TextView) view.findViewById(R.id.perm_lbl);
            mPermissionName = (TextView) view.findViewById(R.id.perm_name);
            mPermissionGroup = (TextView) view.findViewById(R.id.perm_group);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mPermissionLabel.getText() + "'";
        }
    }
}
