package in.ddw.carinfo.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextviewMontserratLight extends TextView {

    public TextviewMontserratLight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextviewMontserratLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextviewMontserratLight(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "montserratlight.ttf");
        setTypeface(tf ,Typeface.NORMAL);

    }
}