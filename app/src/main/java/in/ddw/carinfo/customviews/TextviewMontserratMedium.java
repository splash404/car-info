package in.ddw.carinfo.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

public class TextviewMontserratMedium extends TextView {

    public TextviewMontserratMedium(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextviewMontserratMedium(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextviewMontserratMedium(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "montserratmeduim.ttf");
        setTypeface(tf, Typeface.NORMAL);

    }
}