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

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Kensington Palace", "Kensington",R.mipmap.palace_activities,"Spend a few hours hanging out at the fashionable W8 residence of royals from William III to William and Kate."));
        attractions.add(new Attraction("London Dungeon", "Southbank",R.mipmap.dungeon_activities,"Tales of murder, torture and other foul deeds are brought to life on a tour of London’s horrible past in scary but seriously funny style."));
        attractions.add(new Attraction("London Zoo", "Regent Park",R.mipmap.zoo_activities,"Zone 1 is where the wild things are, at our world-leading zoo in the park."));
        attractions.add(new Attraction("Warner Bros. Studio", "Abbots Langley",R.mipmap.warnerbros_activities,"Visit the studios where all eight Harry Potter movies were made, walk down Diagon Alley, drink butterbeer and step into Hogwarts."));
        attractions.add(new Attraction("SEA LIFE Aquarium", "South Bank",R.mipmap.aquarium_activities,"Walk through, over and under colourful aquatic worlds from the tropical to the Arctic at one of London’s busiest attractions."));
        attractions.add(new Attraction("London Eye", "South Bank",R.mipmap.londoneye_activities,"A sightseeing icon that’s as beautiful to look at as it is to look out from."));
        attractions.add(new Attraction("Buckingham Palace", "St James Park",R.mipmap.palace_activities,"A chance to see world famous art, glimpse regal opulence and get inside HRH’s HQ."));
        attractions.add(new Attraction("Westminster Abbey", "Westminster",R.mipmap.abbey_activities,"Gothic grandeur at its most splendid. See where 16 royal weddings, a lot of funerals and every coronation since 1066 have taken place."));
        attractions.add(new Attraction("Kew Gardens", "Kew",R.mipmap.kew_activities,"Exotic flowers, wild meadows and a walk among the treetops in leafy west London."));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorActivities);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
