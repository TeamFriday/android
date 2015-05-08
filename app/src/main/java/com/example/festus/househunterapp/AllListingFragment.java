package com.example.festus.househunterapp;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
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
     private ArrayList<com.example.festus.househunterapp.Properties> properties;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.fragment_all_listing);
         rv = (RecyclerView) rootView.findViewById(R.id.rv);

         LinearLayoutManager llm = new LinearLayoutManager(this);
         rv.setLayoutManager(llm);


         initializeData();
         initializeAdapter();
     }

     private void initializeAdapter() {
         recylerview.RVAdapter adapter;
         adapter = new RVAdapter(properties);
         rv.setAdapter(adapter);
     }


     private void initializeData() {
         properties = new ArrayList<>();
         properties.add(new com.example.festus.househunterapp.Properties("Tyson properties", "2 bedrooms", R.drawable.img1));
         properties.add(new com.example.festus.househunterapp.Properties("kirichwa heights", "5 bedrooms", R.drawable.img2));
         properties.add(new com.example.festus.househunterapp.Properties("Cinderella", "A story is told of a fare lady ...", R.drawable.img3));
         properties.add(new com.example.festus.househunterapp.Properties("The tortoise", "This story is about ...", R.drawable.img4));
         properties.add(new com.example.festus.househunterapp.Properties("The three sisters", "IN the village of Kinga there ..", R.drawable.img5));



     }
     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         // Handle action bar item clicks here. The action bar will
         // automatically handle clicks on the Home/Up button, so long
         // as you specify a parent activity in AndroidManifest.xml.
         int id = item.getItemId();

         //noinspection SimplifiableIfStatement
         if (id == R.id.action_settings) {
             return true;
         }

         return super.onOptionsItemSelected(item);
     }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AllListingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AllListingFragment newInstance(String param1, String param2) {
        AllListingFragment fragment = new AllListingFragmentBuilder().createAllListingFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public AllListingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {

            rv =(RecyclerView)
            LinearLayoutManager llm = new LinearLayoutManager(this);
            rv.setLayoutManager(llm);


            initializeData();
            initializeAdapter();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_listing, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
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

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
