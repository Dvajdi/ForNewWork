package com.example.twice.fornewwork;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URL;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText et_URL;
    Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        findAllViews();
        btn_show.setOnClickListener(this);
    }

    private void findAllViews() {
        btn_show=(Button)findViewById(R.id.btn_show);
        et_URL = (EditText)findViewById(R.id.et_URL);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_show){
            String str =et_URL.getText().toString();
            Intent intent = new Intent(this,html_activity.class);
            intent.putExtra("URL",str);
            startActivity(intent);
        }
    }
}
