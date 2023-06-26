package com.bbostt.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner_1, spinner_2, spinner_3, spinner_4, spinner_5, spinner_6;
    // private Spinner spinner_i;

    // private ArrayAdapter<CharSequence> adapterspinner_i;

    // ArrayAdapterler ile spinnerların içini dolduruyoruz
    private ArrayAdapter<CharSequence> adapterspinner_1, adapterspinner_2, adapterspinner_3;
    private ArrayAdapter<CharSequence> adapterspinner_4, adapterspinner_5, adapterspinner_6;
    // integer tutacaksa ArrayAdapter <Integer> yazarız
    private TextView txtSoru_1, txtSoru_2, txtToplamPuan, txtSonuc;
    private TextView txtSoru_3, txtSoru_4, txtSoru_5, txtSoru_6;

    private Button btnGoster;
    private int puan1, puan2, puan3, puan4,puan5, puan6;

    private void init(){
        spinner_1 = findViewById(R.id.main_activity_spinner_1); // xml e bağlıyoruz
        spinner_2 = findViewById(R.id.main_activity_spinner_2);
        spinner_3 = findViewById(R.id.main_activity_spinner_3);
        spinner_4 = findViewById(R.id.main_activity_spinner_4);
        spinner_5 = findViewById(R.id.main_activity_spinner_5);
        spinner_6 = findViewById(R.id.main_activity_spinner_6);

        btnGoster = findViewById(R.id.btn_goster);

        txtSoru_1 = findViewById(R.id.main_activity_txtSoru_1);
        txtSoru_2 = findViewById(R.id.main_activity_txtSoru_2);
        txtSoru_3 = findViewById(R.id.main_activity_txtSoru_3);
        txtSoru_4 = findViewById(R.id.main_activity_txtSoru_4);
        txtSoru_5 = findViewById(R.id.main_activity_txtSoru_5);
        txtSoru_6 = findViewById(R.id.main_activity_txtSoru_6);
        txtToplamPuan = findViewById(R.id.txtView_puan);
        txtSonuc = findViewById(R.id.txtView_sonuc);

        // adapterları doldurmak için :
        // res klasörü < values < strings.xmli aç
        // doldurdum


        adapterspinner_1 = ArrayAdapter.createFromResource(this, R.array.Cevap1List, android.R.layout.simple_spinner_item);
        adapterspinner_1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_1.setAdapter(adapterspinner_1); // spinnera, adapteri bağlama

        adapterspinner_2 = ArrayAdapter.createFromResource(this, R.array.Cevap2List, android.R.layout.simple_spinner_item);
        adapterspinner_2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_2.setAdapter(adapterspinner_2);

        adapterspinner_3 = ArrayAdapter.createFromResource(this, R.array.Cevap3List, android.R.layout.simple_spinner_item);
        adapterspinner_3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_3.setAdapter(adapterspinner_3); // spinnera, adapteri bağlama

        adapterspinner_4 = ArrayAdapter.createFromResource(this, R.array.Cevap4List, android.R.layout.simple_spinner_item);
        adapterspinner_4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_4.setAdapter(adapterspinner_4);

        adapterspinner_5 = ArrayAdapter.createFromResource(this, R.array.Cevap5List, android.R.layout.simple_spinner_item);
        adapterspinner_5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_5.setAdapter(adapterspinner_5); // spinnera, adapteri bağlama

        adapterspinner_6 = ArrayAdapter.createFromResource(this, R.array.Cevap6List, android.R.layout.simple_spinner_item);
        adapterspinner_6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_6.setAdapter(adapterspinner_6);

    }

    private void calculate(){
        // seçileni yazma

        spinner_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){ // 0. index seçili ise
                    puan1 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 1){ // 1. index seçili ise
                    puan1 = 3;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 2){ // 2. index seçili ise
                    puan1 = 2;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 3){ // 3. index seçili ise
                    puan1 = 1;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 4){ // 4. index seçili ise
                    puan1 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtToplamPuan.setText("Değer seçilmedi");

            }
        });

        spinner_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){ // Cevap - ise
                    puan2 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 1){ // Cevap Evet ise
                    puan2 = 1;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 2){ // Cevap Hayır ise
                    puan2 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtToplamPuan.setText("Değer seçilmedi");

            }
        });

        spinner_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){ // 0. Cevap - ise
                    puan3 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 1){ // 1. index seçili ise
                    puan3 = 1;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 2) { // 2. index seçili ise
                    puan3 = 0;
                    txtToplamPuan.setText("Toplam puan : " + (puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtToplamPuan.setText("Değer seçilmedi");

            }
        });

        spinner_4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){ // 0. index seçili ise , // 0. Cevap - ise
                    puan4 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 1){ // 1. index seçili ise, // 31 ve daha fazla için
                    puan4 = 3;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 2){ // 2. index seçili ise , // 21-30 adet
                    puan4 = 2;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 3){ // 3. index seçili ise , // 11-20 adet
                    puan4 = 1;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 4){ // 4. index seçili ise , // 10 ve daha az
                    puan4 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtToplamPuan.setText("Değer seçilmedi");

            }
        });

        spinner_5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){ // Cevap - ise
                    puan5 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 1){ // Cevap Evet ise
                    puan5 = 1;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 2){ // Cevap Hayır ise
                    puan5 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtToplamPuan.setText("Değer seçilmedi");

            }
        });
        spinner_6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){ // Cevap - ise
                    puan6 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 1){ // Cevap Evet ise
                    puan6 = 1;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }
                else if(position == 2){ // Cevap Hayır ise
                    puan6 = 0;
                    txtToplamPuan.setText("Toplam puan : " +(puan1 + puan2 + puan3 + puan4 + puan5 + puan6));
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                txtToplamPuan.setText("Değer seçilmedi");

            }
        });


    }

    public void bagimlilikGoster(View v){

        sonuc();
    }

    private void sonuc(){
        if((puan1 + puan2 + puan3 + puan4 + puan5 + puan6) == 1 || (puan1 + puan2 + puan3 + puan4 + puan5 + puan6) == 2 ){
            txtSonuc.setText("Çok hafif bağımlılık");
        }
        else if((puan1 + puan2 + puan3 + puan4 + puan5 + puan6) == 3 || (puan1 + puan2 + puan3 + puan4 + puan5 + puan6) == 4){
            txtSonuc.setText("Hafif bağımlılık");

        }
        else if((puan1 + puan2 + puan3 + puan4 + puan5 + puan6) == 5){
            txtSonuc.setText("Orta Derecede bağımlılık");

        }
        else if((puan1 + puan2 + puan3 + puan4 + puan5 + puan6) == 6 || (puan1 + puan2 + puan3 + puan4 + puan5 + puan6) == 7){
            txtSonuc.setText("İleri derecede bağımlılık");

        }
        else if((puan1 + puan2 + puan3 + puan4 + puan5 + puan6) > 7 && (puan1 + puan2 + puan3 + puan4 + puan5 + puan6) <= 10){
            txtSonuc.setText("Çok ileri derecede bağımlılık");

        }
        else{
            txtSonuc.setText("");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        calculate();
        sonuc();


    }

}