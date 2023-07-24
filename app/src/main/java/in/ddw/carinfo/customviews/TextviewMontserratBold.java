package in.ddw.carinfo.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class TextviewMontserratBold extends TextView {

    public TextviewMontserratBold(Context context) {
        super(context);
        init();
    }

    public TextviewMontserratBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextviewMontserratBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "montserratbold.ttf");
        setTypeface(tf, Typeface.NORMAL);

    }


}
