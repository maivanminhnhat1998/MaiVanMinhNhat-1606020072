package com.example.demogiuaky;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtName,edtPass;
    Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onInit();
        onSetData();


    }

    private void onSetData() {
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtTaiKhoang  = edtName.getText().toString();
                String txtMatKhau = edtPass.getText().toString();
                if (txtTaiKhoang.equals("1606020072")&&txtMatKhau.equals("0869602147")){
                    Toast.makeText(MainActivity.this,"Đăng nhập thành công",Toast.LENGTH_LONG).show();
                    Intent inten = new Intent(MainActivity.this,ContactActivity.class);
                    startActivity(inten);
                }else {
                    Toast.makeText(MainActivity.this,"Dăng nhập thất bại",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void onInit() {
        edtName =(EditText)findViewById(R.id.edtName);
        edtPass = (EditText)findViewById(R.id.edtPass);
        btnSubmit = (Button)findViewById(R.id.btnSubmit);
    }
}
