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

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Shakespeare Plays", "Shakespeare's Globe",R.mipmap.globe_event,"Each season (spring to early autumn) includes several Shakespeare classics, performed by a company of established and upcoming actors, while works of other writers are also programmed."));
        attractions.add(new Attraction("Silent Disco", "The Shard",R.mipmap.silentdisco_event,"Pick your channel and choose your side as three DJs battle it out over separate wireless channels, playing the best in pop, rock and party classics, while you dance the night away at 1,000ft."));
        attractions.add(new Attraction("MCM Comic Con", "Excel",R.mipmap.mcm_event,"The MCM London Comic Con is a speculative fiction fan convention held in the London Borough of Newham twice yearly, usually on the last weekend in May and October."));
        attractions.add(new Attraction("Garden of Light", "Paternoster Square, St Pauls",R.mipmap.garden_event,"Paternoster Square is turning yellow again as 4,000 illuminated daffodils pop-up in the space to mark the Great Daffodil Appeal 2018. Each handcrafted flower will represent the people the terminal illness charity will support throughout the month of March. "));
        attractions.add(new Attraction("Peckham Salvage Yard", "Copeland Gallery, Peckham",R.mipmap.salvageyard_event,"Get your busy hands on vintage threads, twee ceramics, atomic era electricals and antique luggage at this south London fair from the good people behind Hackney Flea Market."));
        attractions.add(new Attraction("Rooftop Astronomy", "Culpeper, Whitechapel",R.mipmap.rooftop_event,"Controversial astrologist Nicholas Culpeper gave lovely Spitalfields gastropub The Culpeper its name, and these rooftop stargazing sessions are in his honour."));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorEvent);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
