package in.ddw.carinfo.pages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import in.ddw.carinfo.R;

public class LoginActivity extends AppCompatActivity {
    EditText ed_mbno;
    TextView tv_sendotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

//        ed_mbno = findViewById(R.id.ed_mbno);
//        tv_sendotp = findViewById(R.id.tv_sendotp);

//        tv_sendotp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                onButtonClick();
//            }
//        });

    }

//    public void onButtonClick()
//    {
//        String mobileno = ed_mbno.getText().toString();
//
//        if(mobileno.equalsIgnoreCase(""))
//        {
//            ed_mbno.setError("Please Enter Mobile No");
//            ed_mbno.requestFocus();
//        }
//        else
//        {
//            //call api
//        }
//    }
}