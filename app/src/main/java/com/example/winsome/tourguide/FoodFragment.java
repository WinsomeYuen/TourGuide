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

        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction("Masala Zone", "Soho, Camden, Cov Garden",R.mipmap.masala_food,"Delicious genuine Indian food, newly renovated exciting interiors and great staff."));
        attractions.add(new Attraction("Hook", "Camden",R.mipmap.hook_food,"Fabulous fish and chips in Camden, flawlessly fried and with superior condiments. Only fish that is sustainably caught gets hooked by Hook."));
        attractions.add(new Attraction("Inamo", "Soho, Camden, Cov Garden",R.mipmap.inamo_food,"They’ve got some very cool interactive tabletops and you place your order on an iPad. And the food? Well, that’s much more traditional – a sumptuous selection of pan-Asian classics such as salt and pepper squid, beef tataki and Korean chicken wings alongside delicious sushi including red dragon roll, salmon sashimi and crispy vegetable tempura maki"));
        attractions.add(new Attraction("Sketch", "Mayfair",R.mipmap.sketch_food,"Quirky, 18th-century townhouse tea room that transforms into a cocktail lounge every evening."));
        attractions.add(new Attraction("Bao", "Fitzrovia, Soho",R.mipmap.bao_food," Serves BAOs, steamed buns, and a range of Taiwanese Dishes."));
        attractions.add(new Attraction("Miki's Paradise", "Highbury",R.mipmap.miki_food,"A little shop offering smoothies, juices, crepes, coffee and food to the people of London. Also renowned across London for some of the best freakshakes in the city, made fresh every day."));
        attractions.add(new Attraction("Burger & Lobster", "Soho",R.mipmap.burgerlobster_food,"To make a great burger you have to start with great beef. Our Angus beef is 'Best in Class' from Nebraska. Our beef, which is three parts of the bull blended, is full of flavour.The Journey of our lobsters starts in Nova Scotia, where the waters are deep and the lobsters are flavourful."));
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.colorFood);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
