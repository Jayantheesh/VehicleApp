package com.jsb.harvardartmuseumsperson.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jsb.harvardartmuseumsperson.R;
import com.jsb.harvardartmuseumsperson.model.Person;
import com.squareup.picasso.Picasso;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVHolder>{

    private Person mData;
    private Activity mContext;


    public RVAdapter(Person data, Activity context) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public RVHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, viewGroup, false);
        return new RVAdapter.RVHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVHolder rvHolder, int i) {
        rvHolder.date.setText(mData.getRecords().get(i).getDisplaydate());
        rvHolder.name.setText(mData.getRecords().get(i).getDisplayname());
        String url = mData.getRecords().get(i).getUrl();
        Log.e("Jay", url);
        Picasso.get().load(url).into(rvHolder.image);
    }

    @Override
    public int getItemCount() {
        return mData.getRecords().size();
    }

    class RVHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView date;
        ImageView image;

        public RVHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.displayName);
            date = itemView.findViewById(R.id.displaydate);
            image = itemView.findViewById(R.id.image);
        }
    }
}
