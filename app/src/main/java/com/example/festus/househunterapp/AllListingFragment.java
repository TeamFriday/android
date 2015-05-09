package com.example.festus.househunterapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 /** {@link AllListingFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link AllListingFragment#newInstance} factory method to*/
 /** create an instance of this fragment.
 */
public class AllListingFragment extends Fragment {
     private RecyclerView rv;
     private ArrayList<Properties> properties;
     public AllListingFragment(){

     }
     @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
         // Inflate the layout for this fragment
         View rootView = inflater.inflate(R.layout.fragment_all_listing, container, false);
         rv = (RecyclerView) rootView.findViewById(R.id.rv);
         rv.setHasFixedSize(true);
         LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
         rv.setLayoutManager(layoutManager);
         initializeData();
         initializeAdapter();
         return rootView;
 }

     private void initializeAdapter() {
         RVAdapter adapter;
         adapter = new RVAdapter(properties);
         rv.setAdapter(adapter);
     }


     private void initializeData() {
         properties = new ArrayList<>();
         properties.add(new com.example.festus.househunterapp.Properties("Tyson properties", "2 bedrooms", R.drawable.img1));
         properties.add(new com.example.festus.househunterapp.Properties("kirichwa heights", "5 bedrooms", R.drawable.img2));
         properties.add(new com.example.festus.househunterapp.Properties("moringa heihts", "4 bedrooms apartments", R.drawable.img3));
         properties.add(new com.example.festus.househunterapp.Properties("lare properties", "bedsitters", R.drawable.img4));
         properties.add(new com.example.festus.househunterapp.Properties("wa mathu investments","3 bedrooms", R.drawable.img5));



     }

    }

   /* // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }

    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (ListingDetailFragment.OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    *//**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     *//*
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
*/