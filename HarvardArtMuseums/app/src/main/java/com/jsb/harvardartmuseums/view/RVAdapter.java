package com.jsb.harvardartmuseums.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsb.harvardartmuseums.R;
import com.jsb.harvardartmuseums.model.HarvardArtMuseums;
import com.squareup.picasso.Picasso;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVHolder>{

    private HarvardArtMuseums mData;
    private Activity mContext;

    public RVAdapter(HarvardArtMuseums data, Activity context) {
        mData = data;
        mContext = context;
    }

    @NonNull
    @Override
    public RVHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.layout, viewGroup, false);
        return new RVHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVHolder rvHolder, int i) {
        rvHolder.date.setText(mData.getRecords().get(i).getDate());
        rvHolder.copyright.setText(mData.getRecords().get(i).getCopyright());
        String url = mData.getRecords().get(i).getBaseimageurl();
        Log.e("Jay", url);
        Picasso.get().load(url).into(rvHolder.image);
    }

    @Override
    public int getItemCount() {
        return mData.getRecords().size();
    }

    public class RVHolder extends RecyclerView.ViewHolder {

        TextView date;
        ImageView image;
        TextView copyright;

        public RVHolder(@NonNull View itemView) {
            super(itemView);
            date = itemView.findViewById(R.id.date);
            copyright = itemView.findViewById(R.id.copyright);
            image = itemView.findViewById(R.id.image);

        }
    }
}
