package edu.umbc.ebiquity.mithril.ui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import edu.umbc.ebiquity.mithril.R;
import edu.umbc.ebiquity.mithril.data.model.rules.context.contextpieces.SemanticActivity;
import edu.umbc.ebiquity.mithril.ui.fragments.instancecreationactivityfragments.SemanticActivityFragment.OnListFragmentInteractionListener;

/**
 * {@link RecyclerView.Adapter} that can display a {@link SemanticActivity} and makes a call to the
 * specified {@link OnListFragmentInteractionListener}.
 * TODO: Replace the implementation with code for your data type.
 */
public class SemanticActivityRecyclerViewAdapter extends RecyclerView.Adapter<SemanticActivityRecyclerViewAdapter.ViewHolder> {

    private final List<SemanticActivity> semanticActivities;
    private final OnListFragmentInteractionListener mListener;

    public SemanticActivityRecyclerViewAdapter(List<SemanticActivity> items, OnListFragmentInteractionListener listener) {
        semanticActivities = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_semantic_activity, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = semanticActivities.get(position);
        holder.mIdView.setText(semanticActivities.get(position).getInferredActivity());
        holder.mContentView.setText(semanticActivities.get(position).getInferredActivity());

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
        return semanticActivities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public SemanticActivity mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}