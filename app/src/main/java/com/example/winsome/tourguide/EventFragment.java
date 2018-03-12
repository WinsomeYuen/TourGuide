package com.example.winsome.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EventFragment extends Fragment{
    public EventFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        String title[] = getActivity().getResources().getStringArray(R.array.title_event);
        String location[] = getActivity().getResources().getStringArray(R.array.location_event);
        String description[] = getActivity().getResources().getStringArray(R.array.description_event);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(title[0], location[0],R.drawable.globe_event, description[0]));
        attractions.add(new Attraction(title[1], location[1],R.drawable.silentdisco_event, description[1]));
        attractions.add(new Attraction(title[2], location[2],R.drawable.mcm_event, description[2]));
        attractions.add(new Attraction(title[3], location[3],R.drawable.garden_event, description[3]));
        attractions.add(new Attraction(title[4], location[4],R.drawable.salvageyard_event, description[4]));
        attractions.add(new Attraction(title[5], location[5],R.drawable.rooftop_event, description[5]));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorEvent);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
