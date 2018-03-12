package com.example.winsome.tourguide;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumFragment extends Fragment {
    public MuseumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        String title[] = getActivity().getResources().getStringArray(R.array.title_museum);
        String location[] = getActivity().getResources().getStringArray(R.array.location_museum);
        String description[] = getActivity().getResources().getStringArray(R.array.description_museum);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(title[0], location[0],R.drawable.british_museum, description[0]));
        attractions.add(new Attraction(title[1], location[1],R.drawable.va_museum, description[1]));
        attractions.add(new Attraction(title[2], location[2],R.drawable.science_museum, description[2]));
        attractions.add(new Attraction(title[3], location[3],R.drawable.ft_museum, description[3]));
        attractions.add(new Attraction(title[4], location[4],R.drawable.tate_museum, description[4]));
        attractions.add(new Attraction(title[5], location[5],R.drawable.nationalgallery_museum, description[5]));
        attractions.add(new Attraction(title[6], location[6],R.drawable.design_museum, description[6]));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorMuseum);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
