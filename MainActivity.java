package com.example.ecomz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;

public class MainActivity extends AppCompatActivity {
    TextView shop,search,cart,profile,biriyani,chinese,snack,burger,north,sandw,label,tview;
    Button b1,b2,b3,b4,b5,b6;
    ImageButton m1,m2,m3,m4,m5,m6;
    ImageView searimg,shopimg,proimg,cartimg,imbiriyani,imchinese,imsnack,imburger,imnorth,imsandw;
     CardView cardView;
     SearchView searchbox;
     AppBarLayout appBarLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        searchbox=findViewById(R.id.sview);
        setContentView(R.layout.activity_main);
        shop = findViewById(R.id.textView65);
        search = findViewById(R.id.textView3);
        cart = findViewById(R.id.textView4);
        tview = findViewById(R.id.textView);
        label = findViewById(R.id.label);
        appBarLayout = findViewById(R.id.appBarLayout);
        profile = findViewById(R.id.textView5);
        cardView = findViewById(R.id.cview);
        searimg = findViewById(R.id.imageView5);
        shopimg = findViewById(R.id.imageView6);
        cartimg = findViewById(R.id.imageView4);
        proimg = findViewById(R.id.imageView3);
        biriyani = findViewById(R.id.textView9);
        chinese = findViewById(R.id.textView8);
        snack = findViewById(R.id.textView7);
       burger = findViewById(R.id.textView10);
        north = findViewById(R.id.textView11);
        sandw = findViewById(R.id.textView14);
        imbiriyani = findViewById(R.id.imageView11);
       imchinese = findViewById(R.id.imageView22);
        imsnack = findViewById(R.id.imageView);
        imburger = findViewById(R.id.imageView313);
        imnorth = findViewById(R.id.imageView121);
        imsandw = findViewById(R.id.imageView33);
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button1);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        m1 = findViewById(R.id.imageButton21);
        m2 = findViewById(R.id.imageButton2);
        m3 = findViewById(R.id.imageButton23);
        m4 = findViewById(R.id.imageButton24);
        m5 = findViewById(R.id.imageButton25);
        m6 = findViewById(R.id.imageButton26);

    }
}