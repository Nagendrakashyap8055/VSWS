package com.example.intern3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class edu extends AppCompatActivity {
Button c1,c2,c3,c4,c5,c6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edu);

        View rm1 = findViewById(R.id.rmk1);
        rm1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm1.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com/kurtas/shae-by-sassafras/shae-by-sassafras-women-blue--mustard-yellow-printed-off-shoulder-anarkali-kurta/11349844/buy"));

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
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com/kurta-sets/nayo/nayo-women-red-floral-printed-kurta-with-trouser--dupatta/14709966/buy"));

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
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com/kurta-sets/kalini/kalini-women-coral-floral-printed-empire-gotta-patti-pure-cotton-kurta-with-trousers--with-dupatta/16505378/buy"));

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
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.myntra.com/kurta-sets/ahalyaa/ahalyaa-women-beige-floral-printed-regular-gotta-patti-kurta-with-palazzos--with-dupatta/14951330/buy"));

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
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse(""));

                        startActivity(intent);
                    }
                });
    }
}