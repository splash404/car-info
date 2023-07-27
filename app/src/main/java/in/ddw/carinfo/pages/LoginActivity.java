package in.ddw.carinfo.pages;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import in.ddw.carinfo.R;

public class LoginActivity extends AppCompatActivity {
    EditText ed_mbno;
    Button btn_sendotp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

<<<<<<< HEAD
        ed_mbno = findViewById(R.id.ed_mbno);
        btn_sendotp = findViewById(R.id.btn_sendotp);

        btn_sendotp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick();
            }
        });

    }

    public void onButtonClick()
    {
        String mobileno = ed_mbno.getText().toString();

        if(mobileno.equalsIgnoreCase(""))
        {
            ed_mbno.setError("Please Enter Mobile No");
            ed_mbno.requestFocus();
        }
//        else
//        {
//            //call api
//
//        }

        Intent i = new Intent(LoginActivity.this,OTPActivity.class);
        startActivity(i);
    }
=======
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
>>>>>>> b296d563055f6195b87ae246b69bbee5179902d0
}