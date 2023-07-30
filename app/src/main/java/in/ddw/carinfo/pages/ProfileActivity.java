package in.ddw.carinfo.pages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import in.ddw.carinfo.R;
import in.ddw.carinfo.customviews.TextviewMontserratSemiBold;

public class ProfileActivity extends AppCompatActivity {
   TextviewMontserratSemiBold tv_editdetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        tv_editdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileActivity.this,EditProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}