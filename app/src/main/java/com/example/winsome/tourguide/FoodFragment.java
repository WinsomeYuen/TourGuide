package com.example.winsome.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodFragment extends Fragment {
    public FoodFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        String title[] = getActivity().getResources().getStringArray(R.array.title_food);
        String location[] = getActivity().getResources().getStringArray(R.array.location_food);
        String description[] = getActivity().getResources().getStringArray(R.array.description_food);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(title[0], location[0],R.drawable.masala_food, description[0]));
        attractions.add(new Attraction(title[1], location[1],R.drawable.hook_food, description[1]));
        attractions.add(new Attraction(title[2], location[2],R.drawable.inamo_food, description[2]));
        attractions.add(new Attraction(title[3], location[3],R.drawable.sketch_food, description[3]));
        attractions.add(new Attraction(title[4], location[4],R.drawable.bao_food, description[4]));
        attractions.add(new Attraction(title[5], location[5],R.drawable.miki_food, description[5]));
        attractions.add(new Attraction(title[6], location[6],R.drawable.burgerlobster_food, description[6]));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorFood);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
