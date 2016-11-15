package com.rohan.user.myfragmentcommunication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class OtherFragment extends Fragment {
TextView txt;

    private static final String MY_KEY = "MY_KEY";

    public OtherFragment() {
        // Required empty public constructor
    }
    public static OtherFragment newInstance(String param1){
        Bundle args=new Bundle();
        args.putString(MY_KEY,param1);
        OtherFragment otherFragment =new OtherFragment();
        otherFragment.setArguments(args);
     return otherFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_other, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txt = (TextView) view.findViewById(R.id.text_o_f);
        txt.setText(getArguments().getString(MY_KEY));
    }

    public void receiveInfo(String info){
        txt.setText(info);
    }
}
