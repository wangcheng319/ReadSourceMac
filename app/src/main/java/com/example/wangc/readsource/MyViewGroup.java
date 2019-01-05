package com.example.wangc.readsource;

import android.content.Context;
import android.os.Environment;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyViewGroup extends ViewGroup {



    public MyViewGroup(Context context) {
        super(context);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        for (int i = 0; i < getChildCount(); i++) {
            View view = getChildAt(i);

        }
    }
}
