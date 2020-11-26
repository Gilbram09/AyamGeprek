package com.example.ayamgeprek;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    TextView txtJumlah, txtHarga, txtGetNama;
    EditText edtNama;
    CheckBox chk_Tomat, chk_Setan;
    int Jumlah, total, harga = 10, Tomat, Setan;
    String nama, statusTomat = "Tidak", statusSetan = "Tidak";
    boolean iscbx_tomat, isCbx_Setan;

    @Override
    protected void onCreate(Bundle savedInstanceStace) {
        super.onCreate(savedInstanceStace);
        setContentView(R.layout.activity_main2);
        txtJumlah = (TextView) findViewById(R.id.txt_jumlah);
        txtHarga = (TextView) findViewById(R.id.txt_price);
        edtNama = (EditText) findViewById(R.id.txt_nama);
        txtGetNama = (TextView) findViewById(R.id.txt_getNama);
        chk_Setan = (CheckBox) findViewById(R.id.chx_Setan);
        chk_Tomat = (CheckBox) findViewById(R.id.chx_tomat);


    }

    public void sambal() {
        if (chk_Tomat.isChecked()) {
            statusTomat = "Sambal Tomat";
            Tomat = 1;
        } else {
            iscbx_tomat = false;
            statusTomat = "";
            Tomat = 0;
        }

        if (chk_Setan.isChecked()) {
            statusSetan = "Sambal Setan";
            Setan = 1;
        } else {
            isCbx_Setan = false;
            statusSetan = "";
            Setan = 0;
        }


    }

    public void tambah(View view) {
        Jumlah = Jumlah + 1;
        txtJumlah.setText("" + Jumlah);

    }

    public void Kurang(View view) {
        Jumlah = Jumlah + 1;
        txtJumlah.setText("" + Jumlah);
    }

    public void order(View view) {
        display(harga);
    }

    public void display(int harga) {


        sambal();
        total = Jumlah * harga;
        if (isCbx_Setan) {
            total += (Jumlah * Setan);
        }
        if (iscbx_tomat) {
            total += (Jumlah * Tomat);
        }
        Log.i("Harga :", "" + total);
        nama = edtNama.getText().toString();
        txtGetNama.setText("Nama :" + nama +
                "\n" + statusSetan +
                "\n" + statusTomat +
                "\nTerimakasih");
        txtHarga.setText("Harga : Rp." + total + ".000");
    }


    @Override
    public void onClick(View view) {


    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}



