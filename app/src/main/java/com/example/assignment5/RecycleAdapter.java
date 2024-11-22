package com.example.assignment5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.RViewHolder> {
    Context context;
    String[] SName, subtitle;
    int[] images;

    public RecycleAdapter(Context context, String[] SName, String[] subtitle, int[] images) {
        this.context = context;
        this.SName = SName;
        this.subtitle = subtitle;
        this.images = images;
    }

    @NonNull
    @Override
    public RViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout, parent, false);
        return new RViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RViewHolder holder, int i) {

        holder.SName.setText(SName[i]);
        holder.subtitle.setText(subtitle[i]);
        holder.imageView.setImageResource(images[i]);

    }

    @Override
    public int getItemCount() {
        return SName.length;
    }

    class RViewHolder extends RecyclerView.ViewHolder{

        TextView SName, subtitle;
        ImageView imageView;
        public RViewHolder(View itemView){
            super(itemView);

            SName = itemView.findViewById(R.id.snameid);
            subtitle = itemView.findViewById(R.id.subtitleid);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
