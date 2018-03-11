package com.example.winsome.tourguide;


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

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("British Museum", "Bloomsbury",R.mipmap.british_museum,"A public institution dedicated to human history, art and culture."));
        attractions.add(new Attraction("V&A", "Knightsbridge",R.mipmap.va_museum,"Contains the world's largest museum of decorative arts and design, housing a permanent collection of over 4.5 million objects. "));
        attractions.add(new Attraction("Science Museum", "Knightsbridge",R.mipmap.science_museum,"There are over 15,000 objects on display, including world-famous objects such as the Apollo 10 command capsule and Stephenson’s Rocket."));
        attractions.add(new Attraction("Fashion & Textile", "Bermondsey",R.mipmap.ft_museum,"The only museum in the UK solely dedicated to showcasing developments in contemporary fashion, as well as providing inspiration, support and training for those working in the industry."));
        attractions.add(new Attraction("Tate Modern", "Bankside",R.mipmap.tate_museum,"Tate is an institution that houses the United Kingdom's national collection of British art, and international modern and contemporary art."));
        attractions.add(new Attraction("National Gallery", "Trafalgar Square",R.mipmap.nationalgallery_museum,"You can explore inspiring art by Botticelli, Leonardo da Vinci, Rembrandt, Gainsborough, Turner, Renoir and Van Gogh."));
        attractions.add(new Attraction("Design Museum", "Kensington",R.mipmap.design_museum,"Covers product, industrial, graphic, fashion and architectural design."));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorMuseum);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
