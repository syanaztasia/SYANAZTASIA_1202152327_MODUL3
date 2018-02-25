package com.example.syanaz.syanaztasia_1202152327_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenu extends AppCompatActivity {

    private Button btnPlus, btnMin;
    private ImageView progress, lblImg;
    private TextView lblTitle, lblDesc, lblStats;
    private int level =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
        //membuat detail menu, dan inisiasi

        btnPlus = findViewById(R.id.plus);
        btnMin = findViewById(R.id.minus);
        progress = findViewById(R.id.imgIsi);

        lblTitle = findViewById(R.id.title);
        lblDesc = findViewById(R.id.desk);
        lblImg = findViewById(R.id.merk);
        lblStats = findViewById(R.id.lblStatus);

        Intent in = getIntent();
        String title=in.getStringExtra("etitle");
        String description=in.getStringExtra("edesc");
        if(description.length()<1){description="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin ut tincidunt dui. Etiam et tincidunt dolor. Phasellus eu rhoncus sem. Suspendisse laoreet dolor eu nisi dictum congue id ut ipsum. Etiam sagittis sodales urna. Sed condimentum arcu at pretium laoreet. Nam venenatis leo sit amet sodales malesuada. Morbi quis convallis lorem, quis malesuada elit. Integer suscipit mauris et ex finibus, id aliquam nisi maximus. Quisque lacinia suscipit ipsum, in posuere elit eleifend vel. Vestibulum vehicula, est ac interdum tristique, elit odio volutpat ex, eu eleifend erat dolor a mauris.\nInterdum et malesuada fames ac ante ipsum primis in faucibus. Nunc sagittis sagittis orci, a mollis justo ultrices id. Vestibulum a neque eget magna ultricies posuere eget ut sem. Nunc egestas vestibulum metus. Praesent et mi quis dolor pellentesque mattis quis eu turpis. Nunc convallis quis elit vitae ornare. Sed venenatis sed lorem eget posuere. Nam lobortis diam dui, et sollicitudin velit faucibus quis. Donec sit amet neque non diam aliquam imperdiet.\n";}
        int imgRes = in.getIntExtra("eimg",0);

        setTitle(title);
        lblTitle.setText(title);
        lblDesc.setText(description);
        lblImg.setImageResource(imgRes);
//ketika button di klik maka akan dilanjutkan kedalam metod yg ditentukan
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambahIsi();
            }
        });

        btnMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kurangIsi();
            }
        });
    }

//metod tambah isi ketika button plus di klik maka batrai akan naik hingga mencapai full lalu memunculkan full
    public void tambahIsi(){
        status();
        if(level <6){
        progress.setImageLevel(++level);
    }else{
             Context context = getApplicationContext();
             Toast toast = Toast.makeText(context, "Air sudah full", Toast.LENGTH_SHORT);
             toast.show();
        }

        }

    public void kurangIsi(){
        status();
        if(level==0){Toast.makeText(this,"Air Kosong",Toast.LENGTH_SHORT).show();return;}
        progress.setImageLevel(--level);
    }

    public void status(){
        lblStats.setText(""+level+"L");
    }
}
