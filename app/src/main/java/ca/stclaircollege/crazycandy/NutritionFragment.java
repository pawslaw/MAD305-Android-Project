package ca.stclaircollege.crazycandy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NutritionFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NutritionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NutritionFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public NutritionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NutritionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NutritionFragment newInstance(String param1, String param2) {
        NutritionFragment fragment = new NutritionFragment();
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

    TextView CaloriesTetView;
    TextView SugarTextView;
    ListView list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nutrition, container, false);

        CaloriesTetView = (TextView) view.findViewById(R.id.calories);
        SugarTextView = (TextView) view.findViewById(R.id.sugar);
        list = (ListView) view.findViewById(R.id.candyList);

        ArrayList<Nutrition> dataTypeList = new ArrayList<Nutrition>();
        //dataTypeList.add(new Cast("", "", ""));

        dataTypeList.add(new Nutrition("Candy 1", "2 Calories", "3g Sugar"));
        dataTypeList.add(new Nutrition("Candy 2", "1 Calories", "4g Sugar"));
        dataTypeList.add(new Nutrition("Candy 3", "44 Calories", "5g Sugar"));
        dataTypeList.add(new Nutrition("Candy 4", "44 Calories", "5g Sugar"));
        dataTypeList.add(new Nutrition("Candy 5", "44 Calories", "5g Sugar"));
        dataTypeList.add(new Nutrition("Candy 6", "44 Calories", "5g Sugar"));
        dataTypeList.add(new Nutrition("Candy 7", "44 Calories", "5g Sugar"));

        CustomAdapter adapter = new CustomAdapter(getContext(), dataTypeList);
        //ArrayAdapter adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, dataTypeList);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Nutrition item = (Nutrition) list.getItemAtPosition(position);
                CaloriesTetView.setText(item.getCalories());
                SugarTextView.setText(item.getSugar());
            }
        });
        list.setAdapter(adapter);

        return view;
    }

    public class CustomAdapter extends ArrayAdapter<Nutrition> {

        public CustomAdapter(Context context, ArrayList<Nutrition> items) {
            super(context, 0, items);
        }
        public View getView(int position, View convertView, ViewGroup parent) {

            Nutrition item = getItem(position);

            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.nutrition_view, parent, false);
            }
            TextView candyName = (TextView) convertView.findViewById(R.id.CandyName);
            candyName.setText(item.getItemname());


            return convertView;
        }
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
}
