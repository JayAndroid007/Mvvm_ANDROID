package com.mvvm_example.sample.customViews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by AndroidDev on 27-02-2017.
 */

@SuppressLint("AppCompatCustomView")
public class TextViewBold extends TextView {
    public TextViewBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/Poppins-Bold.ttf"));
    }
}

