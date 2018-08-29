package com.mvvm_example.sample.customViews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by AndroidDev on 27-02-2017.
 */

public class EditTextExtraBold extends EditText {
    public EditTextExtraBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setTypeface(Typeface.createFromAsset(context.getAssets(),"fonts/WorkSans-ExtraBold.ttf"));
    }
}
