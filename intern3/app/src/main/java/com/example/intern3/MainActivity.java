package com.example.intern3;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    String list,f_b;
    View listOfNgos,facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        facebook=findViewById(R.id.fb);
        facebook.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        f_b= facebook.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));

                        startActivity(intent);
                    }
                });
        View twitter = findViewById(R.id.tr);
        twitter.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String t_r = twitter.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://twitter.com"));

                        startActivity(intent);
                    }
                });
        View linked_in = findViewById(R.id.in);
        linked_in.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = linked_in.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com"));

                        startActivity(intent);
                    }
                });
        View download = findViewById(R.id.download);
        download.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = download.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://kliteclub.com/product/gradient-pleated-dress/?attribute_size=L&utm_source=Google+Shopping&utm_medium=cpc&utm_campaign=new+lizzza&gclid=Cj0KCQjwtvqVBhCVARIsAFUxcRs4HFgb4ES2nGKJ12f67pnGyxKCyRNOPbp5mbBPaoUpq8RC-oxEKf4aAmRWEALw_wcB"));

                        startActivity(intent);
                    }
                });

        View rm1 = findViewById(R.id.rm1);
        rm1.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm1.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://kliteclub.com/product/lilad-shirt-dress/?attribute_size=L&utm_source=Google+Shopping&utm_medium=cpc&utm_campaign=new+lizzza&gclid=Cj0KCQjwtvqVBhCVARIsAFUxcRuc_XHzr6wh46pplzHwiJ8JIkf-xhcE7Dy-MfnB_f3pZCrkvI8LC5oaApifEALw_wcB"));

                        startActivity(intent);
                    }
                });
        View rm2 = findViewById(R.id.rm2);
        rm2.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm2.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/beelee-typs-women-gown-grey-dress/p/itmfhdzastszzqhh?pid=DREFHCYSGWCVQZQY&cmpid=product.share.pp&_refId=PP.86c4e60b-501a-4e66-9729-6ac27c764932.DREFHCYSGWCVQZQY&_appId=WA"));

                        startActivity(intent);
                    }
                });
        View rm3 = findViewById(R.id.rm3);
        rm3.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm3.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.ubuy.co.in/product/4ZFG74KZ8-chinese-style-women-39-s-slim-fit-stand-collar-buckle-improved-cheongsam-ao-dai-charen-service-dress-autumn-new?srsltid=AQP2TePxLmx6mb76NyoQY4tpzmpkIMei6NoTgmp5kLYQ6-UccmFuI9jTS8w"));

                        startActivity(intent);
                    }
                });
        View rm4 = findViewById(R.id.rm4);
        rm4.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm4.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/daevish-women-maxi-blue-dress/p/itmea2ccc567d5af?pid=DREG8ZFGDESAYT6M&cmpid=product.share.pp&_refId=PP.500a7fb1-fe02-4416-8dab-64492ed5d82f.DREG8ZFGDESAYT6M&_appId=WA"));

                        startActivity(intent);
                    }
                });
        View rm5 = findViewById(R.id.rm5);
        rm5.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm5.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/sat-shree-fab-flared-a-line-gown/p/itmf8bd76748d656?pid=GWNG4MJST2JTMYZX&cmpid=product.share.pp&_refId=PP.42d7dd3d-9e76-429c-bf26-3625a775b14f.GWNG4MJST2JTMYZX&_appId=WA"));

                        startActivity(intent);
                    }
                });
        View rm6 = findViewById(R.id.rm6);
        rm6.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm6.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.nykaafashion.com/lavanya-the-label-pink-silk-long-dress-with-dupatta-set-of-2/p/4729987"));

                        startActivity(intent);
                    }
                });

        View rm7 = findViewById(R.id.rm7);
        rm7.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm7.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/Shasmi-Womens-Ballon-Tops-Blouses/dp/B09VNVLRHW/ref=sr_1_53?pf_rd_i=1953602031&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_p=a7d5599d-6c6d-41f7-94a1-12c1154020e5&pf_rd_r=3YA6MRA72BQ9GZ8NT8PB&pf_rd_s=merchandised-search-9&pf_rd_t=30901&qid=1656699467&refinements=p_36%3A-59999&rnid=4595083031&s=apparel&sr=1-53"));

                        startActivity(intent);
                    }
                });

        View rm8 = findViewById(R.id.rm8);
        rm8.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm8.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.amazon.in/dp/B07XD872LQ/ref=cm_sw_r_apa_i_BVK4DXZ3NRFHA53CQDX6_0?_encoding=UTF8&psc=1"));

                        startActivity(intent);
                    }
                });

        View rm9= findViewById(R.id.rm9);
        rm9.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        String l_n = rm9.toString();
                        Intent intent=new Intent (Intent.ACTION_VIEW, Uri.parse("https://www.flipkart.com/sustain-collection-women-kurta-pant-set/p/itmffff1cf12cca3?pid=ETHFZP9EJ78DFTXY&cmpid=product.share.pp&_refId=PP.10c9dd8d-22e0-4e9f-a42f-fc726367d925.ETHFZP9EJ78DFTXY&_appId=WA"));

                        startActivity(intent);
                    }
                });




        View c6 = findViewById(R.id.call);

        c6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:6361372914"));
                        startActivity(intent);
                    }
                });
        listOfNgos=findViewById(R.id.list);
        listOfNgos.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        list= listOfNgos.toString();
                        Intent intent=new Intent (MainActivity.this,list.class);

                        startActivity(intent);
                    }
                });
    }
}