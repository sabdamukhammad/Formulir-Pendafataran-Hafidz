package com.sabda.hafidzquran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText nik;
    EditText nama;
    EditText nokk;
    EditText alamat;
    Button btn;
    TextView hasil;
    Spinner spinnerPilihan;
    String[] pilihanKelas = {"Kelas Pagi", "Kelas Sore"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nik = findViewById(R.id.nik);
        nama = findViewById(R.id.nama);
        nokk = findViewById(R.id.nokk);
        alamat = findViewById(R.id.alamat);
        btn = findViewById(R.id.btn);
        hasil = findViewById(R.id.hasil);
        spinnerPilihan = findViewById(R.id.spinnerPilihan);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (spinnerPilihan.getSelectedItem(). toString().equals(pilihanKelas[0])){
                    String hasill = "Akhawat, Dan Sudah Bisa Membaca Al Quran";
                    hasil.setText(hasill.toString());
                } else if (spinnerPilihan.getSelectedItem().toString().equals(pilihanKelas[1])){
                    String hasill = "Ikhawan, Dan Sudah Bisa Membaca Al Quran";
                    hasil.setText(hasill.toString());
                }
            }
        });

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, pilihanKelas);
        spinnerPilihan.setAdapter(adapter);
    }
}
