package com.example.tester;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class LunchCredit9 extends Fragment {


    public LunchCredit9() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lunch_credit9, container, false);

        TextView textView = view.findViewById(R.id.hyperlink);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return (view);
    }

}
