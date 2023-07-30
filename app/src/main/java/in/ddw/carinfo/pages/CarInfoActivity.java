package in.ddw.carinfo.pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import in.ddw.carinfo.R;

public class CarInfoActivity extends AppCompatActivity {

    ImageView iv_arrow1, iv_arrow2, iv_arrow3, iv_arrow4;
    LinearLayout ll_content, ll_content2, ll_content3, ll_content4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_info);

        findId();
        onClick();
    }

    private void onClick() {

        iv_arrow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleVisibility(view);
            }
        });

        iv_arrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                toggleVisibility2(view2);
            }
        });

        iv_arrow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                toggleVisibility3(view3);
            }
        });

        iv_arrow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                toggleVisibility4(view4);
            }
        });

    }

    private void toggleVisibility4(View view4) {
        if (ll_content4.getVisibility() == View.VISIBLE) {
            view4.animate().rotation(0f).start();
            ll_content4.setVisibility(View.GONE);
        } else {
            view4.animate().rotation(180f).start();
            ll_content4.setVisibility(View.VISIBLE);
        }
    }

    private void toggleVisibility3(View view3) {

        if (ll_content3.getVisibility() == View.VISIBLE) {
            view3.animate().rotation(0f).start();
            ll_content3.setVisibility(View.GONE);
        } else {
            view3.animate().rotation(180f).start();
            ll_content3.setVisibility(View.VISIBLE);
        }

    }

    private void toggleVisibility2(View view2) {

        if (ll_content2.getVisibility() == View.VISIBLE) {
            view2.animate().rotation(0f).start();
            ll_content2.setVisibility(View.GONE);
        } else {
            view2.animate().rotation(180f).start();
            ll_content2.setVisibility(View.VISIBLE);
        }

    }

    private void toggleVisibility(View view) {
        if (ll_content.getVisibility() == View.VISIBLE) {
            view.animate().rotation(0f).start();
            ll_content.setVisibility(View.GONE);
        } else {
            view.animate().rotation(180f).start();
            ll_content.setVisibility(View.VISIBLE);
        }
    }

    private void findId() {
        ll_content = findViewById(R.id.ll_content);
        ll_content2 = findViewById(R.id.ll_content2);
        ll_content3 = findViewById(R.id.ll_content3);
        ll_content4 = findViewById(R.id.ll_content4);

        iv_arrow1 = findViewById(R.id.iv_arrow1);
        iv_arrow2 = findViewById(R.id.iv_arrow2);
        iv_arrow3 = findViewById(R.id.iv_arrow3);
        iv_arrow4 = findViewById(R.id.iv_arrow4);
    }
}