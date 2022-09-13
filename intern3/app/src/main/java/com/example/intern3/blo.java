package com.example.intern3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class blo extends AppCompatActivity {
    Button c1,c2,c3,c4,c5,c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blo);

        View rm1 = findViewById(R.id.rmk1);
        rm1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm1.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/shoestail-women-pink-flats/p/itm73792757ab0db?pid=SNDGAFH3FYEV9P8J&cmpid=product.share.pp&_refId=PP.35725040-fdb5-41af-823a-409462aa4a8f.SNDGAFH3FYEV9P8J&_appId=WA"));

                        startActivity(intent);
                    }
                });
        View rm2 = findViewById(R.id.rmk2);
        rm2.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm2.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/dp/B09996R338/ref=cm_sw_r_apa_i_dl_YW2VDK4A901TMPZX2V67_0?_encoding=UTF8&psc=1"));

                        startActivity(intent);
                    }
                });
        View rm3 = findViewById(R.id.rmk3);
        rm3.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm3.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/dp/B09996R338/ref=cm_sw_r_apa_i_dl_YW2VDK4A901TMPZX2V67_0?_encoding=UTF8&psc=1"));

                        startActivity(intent);
                    }
                });
        View rm4 = findViewById(R.id.rmk4);
        rm4.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm4.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/dp/B08ZN381CF/ref=cm_sw_r_apa_i_HTM88A3P2SQF4J26K2AB_0"));

                        startActivity(intent);
                    }
                });
        View rm5 = findViewById(R.id.rmk5);
        rm5.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm5.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/dp/B08WB2JZSV/ref=cm_sw_r_apa_i_5NW7K50W2RW40SG527NV_0"));

                        startActivity(intent);
                    }
                });
    }
}