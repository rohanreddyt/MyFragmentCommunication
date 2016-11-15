package com.rohan.user.myfragmentcommunication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements BlankFragment.MyCallback {
    private static final String BLANK ="blank fragment" ;
    private static final String OTHER = "other fragment";
    BlankFragment blankFragment;
    OtherFragment otherFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blankFragment = new BlankFragment();
        otherFragment = OtherFragment.newInstance("Demo");
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.frame1,blankFragment,BLANK)
                .add(R.id.frame2,otherFragment,OTHER)
                .commit();
    }

    @Override
    public void passInfo(String info) {
        otherFragment.receiveInfo(info);
    }
}
