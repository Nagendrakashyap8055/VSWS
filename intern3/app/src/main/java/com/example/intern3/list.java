package com.example.intern3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

public class list extends AppCompatActivity {
    View ngo_edu,ngo_env,ngo_med,ngo_orp,ngo_blo;
    String edu,env,med,orp,blo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ngo_edu=findViewById(R.id.edu);
        ngo_env=findViewById(R.id.env);
        ngo_med=findViewById(R.id.med);
        ngo_orp=findViewById(R.id.orp);

        ngo_blo=findViewById(R.id.blo);
        ngo_edu.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        edu= ngo_edu.toString();
                        Intent intent=new Intent (list.this,edu.class);

                        startActivity(intent);
                    }
                });

        ngo_env.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        env= ngo_env.toString();
                        Intent intent=new Intent (list.this,env.class);

                        startActivity(intent);
                    }
                });
        ngo_med.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        med= ngo_med.toString();
                        Intent intent=new Intent (list.this,med.class);

                        startActivity(intent);
                    }
                });
        ngo_orp.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        orp= ngo_orp.toString();
                        Intent intent=new Intent (list.this,orp.class);
                        startActivity(intent);

                    }
                });
        ngo_blo.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        blo= ngo_blo.toString();
                        Intent intent=new Intent (list.this,blo.class);

                        startActivity(intent);
                    }
                });




    }
}