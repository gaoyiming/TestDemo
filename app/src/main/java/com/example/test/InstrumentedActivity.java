package com.example.test;

import android.util.Log;

import com.example.testdemo.MainActivity;

/**
 * @ProjectName: TestDemo
 * @Desc:
 * @Author: gao yi ming
 * @Date: 2023/4/10
 */
public class InstrumentedActivity extends MainActivity {
    public static String TAG = "IntrumentedActivity";
    private FinishListener mListener;
    public void setFinishListener(FinishListener listener) {
        mListener = listener;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG + ".InstrumentedActivity", "onDestroy()");
        super.finish();
        if (mListener != null) {
            mListener.onActivityFinished();
        }
    }
}