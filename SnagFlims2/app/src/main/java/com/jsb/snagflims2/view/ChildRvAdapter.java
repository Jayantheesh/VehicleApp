package com.jsb.snagflims2.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsb.snagflims2.R;
import com.jsb.snagflims2.model.TrayItem;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ChildRvAdapter extends RecyclerView.Adapter<ChildRvAdapter.ChildRVViewHolder>{

    private Context mContext;
    private List<TrayItem> mData;


    public ChildRvAdapter(Context context, List<TrayItem> data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public ChildRVViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.child_item, viewGroup, false);
        return new ChildRVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildRVViewHolder childRVViewHolder, int i) {
        childRVViewHolder.idx.setText(mData.get(i).getId());
        childRVViewHolder.titles.setText(mData.get(i).getTitle());
        String url = mData.get(i).getBannerImage();
        System.out.println("Url=" + url);
        Picasso.get().load(url).into(childRVViewHolder.image);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class ChildRVViewHolder extends RecyclerView.ViewHolder {


        TextView idx;
        TextView titles;
        ImageView image;

        public ChildRVViewHolder(@NonNull View itemView) {
            super(itemView);
            idx = itemView.findViewById(R.id.idx);
            titles = itemView.findViewById(R.id.tiltles);
            image = itemView.findViewById(R.id.image);
        }
    }
}
