package in.ddw.carinfo.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextviewMontserratSemiBold extends TextView {

    public TextviewMontserratSemiBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextviewMontserratSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextviewMontserratSemiBold(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "montserratsemibold.ttf");
        setTypeface(tf ,Typeface.NORMAL);

    }
}