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
 * {@link ShowFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ShowFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ShowFragment extends Fragment {
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

    public ShowFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ShowFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ShowFragment newInstance(String param1, String param2) {
        ShowFragment fragment = new ShowFragment();
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
        View view = inflater.inflate(R.layout.fragment_candy, container, false);
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
     * <p>
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
            Episode episode = new Episode();
            episode.title = "OOPS";
            episode.code = "OOPS";
            episode.description = "OOPS";
            episode.beginTime = Calendar.getInstance();

            switch(position){
                case 0:
                    episode.title = "It Came From Next Door";
                    episode.code = "S1E1";
                    episode.description = "Jenny makes her first contact with the outside world, meeting Brad and Tuck Carbuckle for the first time. While Brad immediately accepts Jenny as a new friend, Tuck does not quite see her as anything other than a \"evil robot cyborg\".";
                    //episode.airdate = Calendar.getInstance().add();
                    episode.beginTime.set(2003, 3, 19, 7, 30);
                    break;
                case 1:
                    episode.title = "Pest Control";
                    episode.code = "S1E2";
                    episode.description = "Having vowed revenge on her for all the injustices placed upon them, Dr. Wakeman's lab rats, led by Vladimir, plan to destroy her by taking control of Jenny's body.";
                    episode.beginTime.set(2003, 3, 20, 7, 30);
                    break;
                case 2:
                    episode.title = "Raggedy Android";
                    episode.code = "S1E3";
                    episode.description = "Jenny wants to go to the town fair, but Dr. Wakeman fears that Jenny will spook the townspeople with her presence. When Jenny gets a hold of a prototype \"exo-skin\" for her to wear, she sees her chance to mingle with the fairgoers; unfortunately, its mangled appearance only scares them. Meanwhile, Tuck attempts to conquer his fear of Ferris wheels.";
                    episode.beginTime.set(2003, 3, 21, 7, 30);
                    break;
                case 3:
                    episode.title = "Class Action";
                    episode.code = "S1E4";
                    episode.description = "On her first day of high school, Jenny seeks to make some new friends, and she thinks she can find some in Brit and Tiff Crust. Unfortunately, the Crust cousins do not share the same feelings and plan to humiliate her.";
                    episode.beginTime.set(2003, 3, 22, 7, 30);
                    break;
                case 4:
                    episode.title = "Attack of The 5½ Ft. Geek";
                    episode.code = "S1E5";
                    episode.description = "When Jenny saves local school geek Sheldon from a gang of bullies, he quickly becomes smitten with her and does not want to leave her alone.";
                    episode.beginTime.set(2003, 3, 23, 7, 30);
                    break;
                default:
                    break;
            }
            return CandyFragment.newInstance(episode.title, episode.code, episode.description, episode.beginTime.getTimeInMillis());

//            switch(position){
//                case 0:
//                case 1: return EpisodeContentFragment.newInstance(episode);
//                case 2: return EpisodeContentFragment.newInstance(episode);
//                case 3: return EpisodeContentFragment.newInstance(episode);
//                default: return EpisodeContentFragment.newInstance(episode);
//            }
        }
        public int getCount(){
            return 5;
        }
    }

    public class Episode {
        public String title;
        public String code;
        public String description;
        public Calendar beginTime = Calendar.getInstance();

    }
}
