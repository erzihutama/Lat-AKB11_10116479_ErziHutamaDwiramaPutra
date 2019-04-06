package dev.erzi.if11;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
    Nama    : Erzi Hutama Dwirama Putra
    Kelas   : AKB-11/IF-11
    Nim     : 10116479
    Tanggal : 4 april 2018 13:20

 */


public class login extends AppCompatActivity {
    TextView text , text2 , text3 , text4;
    Button daftar;
    EditText inputText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inputText = (EditText) findViewById(R.id.kode);
        daftar = (Button)findViewById(R.id.btnmasuk);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputText.getText().toString().length()==0){
                    //jika form Email belum di isi / masih kosong
                    inputText.setError("Masukan Kode!");
                }else {
                    //jika form sudah terisi semua
                    Intent intent = new Intent(login.this, dataActivity.class);
                    startActivity(intent);
                }
            }
        });




        text=(TextView)findViewById(R.id.text1);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"Font/nunito_bold.ttf");
        text.setTypeface(customfont);
        text4=(TextView)findViewById(R.id.text4);
        text4.setTypeface(customfont);


    }
}
