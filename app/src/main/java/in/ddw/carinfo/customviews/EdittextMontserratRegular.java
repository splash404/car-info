package in.ddw.carinfo.customviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;

public class EdittextMontserratRegular extends EditText {

    public EdittextMontserratRegular(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public EdittextMontserratRegular(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EdittextMontserratRegular(Context context) {
        super(context);
        init();
    }

    public void init() {
        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "montserratregular.ttf");
        setTypeface(tf, Typeface.NORMAL);

    }
}