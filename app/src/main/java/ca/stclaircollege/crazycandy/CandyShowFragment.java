package ca.stclaircollege.crazycandy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CandyShowFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CandyShowFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CandyShowFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private SectionPagerAdapter mSectionsPagerAdapter;
    //private OnFragmentInteractionListener mListener;
    private ViewPager mViewPager;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public CandyShowFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CandyShowFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CandyShowFragment newInstance(String param1, String param2) {
        CandyShowFragment fragment = new CandyShowFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_candy_show, container, false);
        mSectionsPagerAdapter = new SectionPagerAdapter(getChildFragmentManager());
        mViewPager = (ViewPager)  view.findViewById(R.id.episodecontent);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
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
        void onFragmentInteraction(Uri uri);
    }
    public class SectionPagerAdapter extends FragmentPagerAdapter {
        public SectionPagerAdapter(FragmentManager fm){
            super(fm);
        }
        public Fragment getItem(int position)
        {
            Candy candy = new Candy();
            candy.setCandyName("OOPS");
            candy.setCandyPrice("OOPS");
            candy.setCandyDescription("OOPS");

            switch(position){
                case 0:
                    candy.setCandyName("Generic Candy Name 1");
                    candy.setCandyPrice("$10.50 CAD");
                    candy.setCandyDescription("A really generic candy that is sold at a competitive price");
                    break;
                case 1:
                    candy.setCandyName("Generic Candy Name 1");
                    candy.setCandyPrice("$1.50 CAD");
                    candy.setCandyDescription("A really generic candy that is sold at a competitive price");
                    break;
                case 2:
                    candy.setCandyName("Generic Candy Name 1");
                    candy.setCandyPrice("$3.99 CAD");
                    candy.setCandyDescription("A really generic candy that is sold at a competitive price");
                    break;
                case 3:
                    candy.setCandyName("Generic Candy Name 1");
                    candy.setCandyPrice("$6.35 CAD");
                    candy.setCandyDescription("A really generic candy that is sold at a competitive price");
                    break;
                case 4:
                    candy.setCandyName("Generic Candy Name 1");
                    candy.setCandyPrice("$0.10 CAD");
                    candy.setCandyDescription("A really generic candy that is sold at a competitive price");
                    break;
                default:
                    break;
            }
            return CandyShowContentFragment.newInstance(candy.getCandyName(), candy.getCandyPrice(), candy.getCandyDescription());

//            switch(position){
//                case 0:
//                case 1: return CandyShowContentFragment.newInstance(episode);
//                case 2: return CandyShowContentFragment.newInstance(episode);
//                case 3: return CandyShowContentFragment.newInstance(episode);
//                default: return CandyShowContentFragment.newInstance(episode);
//            }
        }
        public int getCount(){
            return 5;
        }
    }
}
