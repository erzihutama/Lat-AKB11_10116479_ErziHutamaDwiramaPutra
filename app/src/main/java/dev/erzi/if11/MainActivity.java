package dev.erzi.if11;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    di buat hari Rabu jam 12:00 wib
//    Erzi Hutama Dwirama Putra
//    10116479
//    AKB-11

    TextView teks, teks2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teks=(TextView)findViewById(R.id.text1);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"Font/rubik_regular.ttf");
        teks.setTypeface(customfont);

    }

    public void mulai(View view) {
        Intent intent = new Intent(MainActivity.this, login.class);
        startActivity(intent);
    }



}
