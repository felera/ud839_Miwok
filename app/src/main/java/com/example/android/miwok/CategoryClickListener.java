package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by francisco on 12/03/2017.
 */

public class CategoryClickListener implements View.OnClickListener {

    private Class mActivityClass;
    private AppCompatActivity mActivity;

    private CategoryClickListener(){
        //private so that invokers are forced to use the other constructor
    }


    public CategoryClickListener(AppCompatActivity activity, Class activityClass){
        mActivity = activity;
        mActivityClass = activityClass;
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(mActivity, mActivityClass);
        mActivity.startActivity(intent);
    }
}
