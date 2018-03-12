package com.example.winsome.tourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitiesFragment extends Fragment{
    public ActivitiesFragment(){
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        String title[] = getActivity().getResources().getStringArray(R.array.title_activities);
        String location[] = getActivity().getResources().getStringArray(R.array.location_activities);
        String description[] = getActivity().getResources().getStringArray(R.array.description_activities);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(title[0], location[0],R.drawable.palace_activities, description[0]));
        attractions.add(new Attraction(title[1], location[1],R.drawable.dungeon_activities, description[1]));
        attractions.add(new Attraction(title[2], location[2],R.drawable.zoo_activities, description[2]));
        attractions.add(new Attraction(title[3], location[3],R.drawable.warnerbros_activities, description[3]));
        attractions.add(new Attraction(title[4], location[4],R.drawable.aquarium_activities, description[4]));
        attractions.add(new Attraction(title[5], location[5],R.drawable.londoneye_activities, description[5]));
        attractions.add(new Attraction(title[6], location[6],R.drawable.palace_activities, description[6]));
        attractions.add(new Attraction(title[7], location[7],R.drawable.abbey_activities, description[7]));
        attractions.add(new Attraction(title[8], location[8],R.drawable.kew_activities, description[8]));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorActivities);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
