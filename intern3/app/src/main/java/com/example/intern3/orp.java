package com.example.intern3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class orp extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orp);

        View rm1 = findViewById(R.id.rmk1);
        rm1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm1.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://dl.flipkart.com/s/tnA!2tNNNN"));

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
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com/Sarees/KALINI/KALINI-Pink--Mustard-Yellow-Ethnic-Motifs-Woven-Design-Half--Half-Kanjeevaram-Saree/14879588/buy"));
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
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.ajio.com/ethnic-junction-georgatte-floral-print-saree-with-blouse-piece/p/463576664_purple#gmf"));
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
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/decent-choice-solid-bollywood-satin-saree/p/itm717381be4d7a3?pid=SARGCJBJZ5BJGAGB&cmpid=product.share.pp&_refId=PP.b9aa466a-dcc8-4b16-acf6-fef9706d2aa2.SARGCJBJZ5BJGAGB&_appId=WA"));
                        startActivity(intent);
                    }
                });
    }
}