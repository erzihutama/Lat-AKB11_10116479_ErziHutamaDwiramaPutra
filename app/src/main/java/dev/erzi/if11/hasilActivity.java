package dev.erzi.if11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
/*
    Nama    : Erzi Hutama Dwirama Putra
    Kelas   : AKB-11/IF-11
    Nim     : 10116479
    Tanggal : 6 april 2018 14:20

 */

public class hasilActivity extends AppCompatActivity {
    private String nama;
    private String umur;
    private String KEY_NAME = "NAMA";
    private String KEY_UMUR = "UMUR";
    TextView txtHello,txtumur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txtHello = (TextView) findViewById(R.id.txthasil);
        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        umur = extras.getString(KEY_UMUR);
        txtHello.setText("Beres! Sekarang "+nama+" udah bisa mengecek penggunaan hp mu tiap hari " +
                "buat bantu "+nama+" ngatur waktu !! dan umur kamu "+umur+ " tahun");


    }

    public void selesai(View view) {

        finishAffinity(); // Close all activites
        System.exit(0);  // closing files, releasing resources
    }
}
