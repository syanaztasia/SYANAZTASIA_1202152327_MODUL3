package com.example.syanaz.syanaztasia_1202152327_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView User, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User = (TextView)findViewById(R.id.username);
        Pass = (TextView)findViewById(R.id.password);
    }

    public void cekLogin(){
        //inisiasi id user dan pass
        String strUser,strPass;
        strUser = User.getText().toString();
        strPass = Pass.getText().toString();

        // membuat perintah conditional, pass dan username sudah ditetapkan. jika salah memasukkan diantara keduanya maka muncul toast dibawah ini
        if(!(strUser.equals("EAD") && strPass.equals("MOBILE"))){
            Toast.makeText(this,"Username atau Password Salah",Toast.LENGTH_SHORT).show();
            return;
            //jika pass dan username sesuai maka muncul toast spt dibawah ini dan akan di lanjutkan ke daftar minuman
        }else{
            Toast.makeText(this,"Sign In ",Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this,DaftarMinuman.class));
        }
    }
    public void login(View v){
        cekLogin();
    }
}

