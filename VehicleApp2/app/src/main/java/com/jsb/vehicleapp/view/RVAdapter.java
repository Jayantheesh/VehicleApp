package com.jsb.vehicleapp.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jsb.vehicleapp.R;
import com.jsb.vehicleapp.model.Vehicle;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.ViewHolder>{

    private Activity mContext;
    private Vehicle mData;

    public RVAdapter(Activity activity, Vehicle data) {
        mContext = activity;
        mData = data;
    }

    @NonNull
    @Override
    public RVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, viewGroup, false);
        return new RVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.ViewHolder viewHolder, int i) {
        viewHolder.makeId.setText(String.valueOf(mData.getResults().get(i).getMakeID()));
        viewHolder.makeName.setText(mData.getResults().get(i).getMakeName());
    }

    @Override
    public int getItemCount() {
        return mData.getResults().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView makeId;
        TextView makeName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            makeId = itemView.findViewById(R.id.make);
            makeName = itemView.findViewById(R.id.model);
        }

    }
}
