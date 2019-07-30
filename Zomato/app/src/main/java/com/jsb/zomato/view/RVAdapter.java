package com.jsb.zomato.view;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jsb.zomato.R;
import com.jsb.zomato.model.Zomato;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.RVviewHolder>{

    private Activity mContext;
    private Zomato mData;

    public RVAdapter(Activity context, Zomato data) {
        mContext = context;
        mData = data;
    }

    @NonNull
    @Override
    public RVviewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item, viewGroup, false);
        return new RVAdapter.RVviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVviewHolder rVviewHolder, int i) {
        rVviewHolder.id.setText(String.valueOf(mData.getEstablishments().get(i).getEstablishment().getId()));
        rVviewHolder.name.setText(mData.getEstablishments().get(i).getEstablishment().getName());
    }

    @Override
    public int getItemCount() {
        return mData.getEstablishments().size();
    }

    class RVviewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView id;

        public RVviewHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.idx);
            name = itemView.findViewById(R.id.name);

        }
    }
}
