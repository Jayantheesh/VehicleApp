package com.jsb.snagflims2.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jsb.snagflims2.R;
import com.jsb.snagflims2.model.SnagFlims;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVViewHolder>{

    private Context mContext;
    private SnagFlims mData;

    public RVAdapter(Context context, SnagFlims data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public RVViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.items, viewGroup, false);
        return new RVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVViewHolder rvViewHolder, int i) {
        rvViewHolder.id.setText(mData.getFeaturedShows().get(i).getTrayName());
        //rvViewHolder.title.setText(mData.getFeaturedShows().get(i).getViewType());

        rvViewHolder.poster.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.HORIZONTAL, false));
        rvViewHolder.poster.setAdapter(new ChildRvAdapter(mContext, mData.getFeaturedShows().get(i).getTrayItems()));
    }

    @Override
    public int getItemCount() {
        return mData.getFeaturedShows().size();
    }

    class RVViewHolder extends RecyclerView.ViewHolder {

        TextView id;
        TextView title;
        RecyclerView poster;


        public RVViewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id);
            title = itemView.findViewById(R.id.title);
            poster = itemView.findViewById(R.id.child);
        }
    }
}
