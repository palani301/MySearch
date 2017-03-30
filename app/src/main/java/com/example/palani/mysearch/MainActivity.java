package com.example.palani.mysearch;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.myweb);
        button=(Button)findViewById(R.id.button);

    }
    public void searchwebpage(View view) {
        try {
            String s=editText.getText().toString();
            Intent intent=new Intent(Intent.ACTION_WEB_SEARCH);
            intent.putExtra(SearchManager.QUERY,s);
            startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
