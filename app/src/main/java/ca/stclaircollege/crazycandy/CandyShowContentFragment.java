package ca.stclaircollege.crazycandy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CandyShowContentFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CandyShowContentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CandyShowContentFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private String mParam3;

    private OnFragmentInteractionListener mListener;

    public CandyShowContentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param2 Parameter 2.
     * @param param1 Parameter 1.
     * @return A new instance of fragment CandyShowContentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CandyShowContentFragment newInstance(String param1, String param2, String param3) {
        CandyShowContentFragment fragment = new CandyShowContentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        args.putString(ARG_PARAM3, param3);
        //args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            mParam3 = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_candy_show_content, container, false);

        if(mParam1 != null){
            ((TextView) view.findViewById(R.id.name)).setText(mParam1);
        }
        if(mParam2 != null){
            ((TextView) view.findViewById(R.id.price)).setText(mParam2);
        }
        if(mParam3 != null){
            ((TextView) view.findViewById(R.id.description)).setText(mParam3);
        }
//        Button calendarButton = (Button) view.findViewById(R.id.calendarButton);
//        calendarButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Calendar startTime = Calendar.getInstance();
//                startTime.setTimeInMillis(mParam4);
//                Calendar endTime = Calendar.getInstance();
//                endTime.setTimeInMillis(mParam4 + 1000*60*30);
//
//                Log.i("APPSCREAM", String.valueOf(mParam4));
//                Log.i("APPSCREAM", String.valueOf(startTime.getTimeInMillis()));
//                Intent intent = new Intent(Intent.ACTION_EDIT);
//                intent.setType("vnd.android.cursor.item/event");
//                intent.putExtra("beginTime", startTime.getTimeInMillis());
//                //intent.putExtra("allDay", true);
//                intent.putExtra("rrule", "FREQ=YEARLY");
//                intent.putExtra("endTime", endTime.getTimeInMillis());
//                intent.putExtra("title", "Watch " + mParam1);
//                startActivity(intent);
//
//            }
//        });
//        Button shareButton = (Button) view.findViewById(R.id.shareButton);
//        shareButton.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent intent = new Intent(Intent.ACTION_SENDTO);
//                intent.setData(Uri.parse("smsto:"));
//                intent.putExtra("sms_body", "Hey, check this out: " + mParam3);
//                if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
//                    startActivity(intent);
//                } else {
//                    Snackbar snackbar = Snackbar.make(getActivity().findViewById(android.R.id.content), "No installed software to complete the task.", Snackbar.LENGTH_SHORT);
//                    snackbar.show();
//                }
//
//            }
//        });
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
}
