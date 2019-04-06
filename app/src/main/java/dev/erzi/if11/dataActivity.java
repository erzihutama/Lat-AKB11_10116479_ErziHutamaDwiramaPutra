package dev.erzi.if11;
/*
    Nama    : Erzi Hutama Dwirama Putra
    Kelas   : AKB-11/IF-11
    Nim     : 10116479
    Tanggal : 6 april 2018 10:20

 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dataActivity extends AppCompatActivity {

    EditText name;
    EditText umur;
    Button selanjutnya;
    private String KEY_NAME = "NAMA";
    private String KEY_UMUR = "UMUR";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        name = (EditText) findViewById(R.id.etnama);
        umur = (EditText) findViewById(R.id.etumur);
        selanjutnya = (Button) findViewById(R.id.btnselanjutnya);
        selanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String nama = name.getText().toString();
                    String umr = umur.getText().toString();
                    boolean isEmpty = false;
                    if(TextUtils.isEmpty(nama)){
                        isEmpty = true;
                        name.setError("Isi data nama anda");
                    }else if (TextUtils.isEmpty(umr)){
                        isEmpty = true;
                        umur.setError("Isi data Umur anda");
                } else{
                        Intent selanjutnya = new Intent(dataActivity.this, hasilActivity.class);
                        selanjutnya.putExtra(KEY_NAME,nama);
                        selanjutnya.putExtra(KEY_UMUR,umr);
                        startActivity(selanjutnya);

            }

    }
});


   }}
