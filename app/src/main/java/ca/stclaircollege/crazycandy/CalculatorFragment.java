package ca.stclaircollege.crazycandy;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CalculatorFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CalculatorFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalculatorFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    //Buttons + Text
    private TextView txtCalc = null;
    private Button fiveCent = null;
    private Button tenCent = null;
    private Button twentyFiveCent = null;
    private Button dollar = null;
    private Button reset = null;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    //Doubles for calculating
    private double total;
    private double tax = 1.13;

    private OnFragmentInteractionListener mListener;

    public CalculatorFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CalculatorFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CalculatorFragment newInstance(String param1, String param2) {
        CalculatorFragment fragment = new CalculatorFragment();
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
        // Seperate the View
        View view =  inflater.inflate(R.layout.fragment_calculator, container, false);

        //Create Buttons
        txtCalc = (TextView) view.findViewById(R.id.txtCalc);
        fiveCent = (Button) view.findViewById(R.id.fiveCent);
        tenCent = (Button) view.findViewById(R.id.tenCent);
        twentyFiveCent = (Button) view.findViewById(R.id.twentyFiveCent);
        dollar = (Button) view.findViewById(R.id.dollar);
        reset = (Button) view.findViewById(R.id.reset);

        //Button Handlers
        fiveCent.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total = (total + .05) * tax;
                String s = String.format("%.2f", total);
                txtCalc.setText(s);
            }

        });
        tenCent.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total = (total + .10) * tax;
                String s = String.format("%.2f", total);
                txtCalc.setText(s);
            }

        });
        twentyFiveCent.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total = (total + .25) * tax;
                String s = String.format("%.2f", total);
                txtCalc.setText(s);
            }

        });
        dollar.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total = (total + 1.00) * tax;
                String s = String.format("%.2f", total);
                txtCalc.setText(s);
            }

        });
        reset.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                total = 0.00;
                String s = String.format("%.2f", total);
                txtCalc.setText(s);
            }

        });
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
}
