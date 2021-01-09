package com.example.animalswithfragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalViewAdapter extends RecyclerView.Adapter<AnimalViewAdapter.AnimelViewHolder> {

    private AnimalClickListener animalClickListener;
    private ArrayList<Animal> animalList;

    public void setAnimalClickListener(AnimalClickListener animalClickListener) {
        this.animalClickListener = animalClickListener;
    }

    public AnimalViewAdapter(ArrayList<Animal> animalList) {
        this.animalList = animalList;
    }

    @NonNull
    @Override
    public AnimelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_single_item, parent,false);
        return new AnimelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimelViewHolder holder, int position) {
        holder.title.setText(animalList.get(position).title);
        holder.imageID.setImageResource(animalList.get(position).imageID);
    }

    @Override
    public int getItemCount() {
        return animalList.size();
    }

    public class AnimelViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView imageID;

        public AnimelViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_id);
            imageID = itemView.findViewById(R.id.image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    animalClickListener.onClick(getAdapterPosition());
                }
            });
        }
    }
}
