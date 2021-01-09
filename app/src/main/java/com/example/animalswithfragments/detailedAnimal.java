package com.example.animalswithfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class detailedAnimal extends Fragment {

    private TextView title;
    private ImageView imageID;
    private TextView longDescription;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detailed_animal, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        title = view.findViewById(R.id.detailed_title_id);
        imageID = view.findViewById(R.id.detailed_image_id);
        longDescription = view.findViewById(R.id.detailed_long_description_id);

        getParentFragmentManager().setFragmentResultListener("animalKey", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle bundle) {
                String titleMethod = bundle.getString("titleKey");
                String longDescriptionMethod = bundle.getString("longDescriptionKey");
                int imageIDMethod = bundle. getInt("imageIDKey");
                title.setText(titleMethod);
                imageID.setImageResource(imageIDMethod);
                longDescription.setText(longDescriptionMethod);
            }
        });

    }



}