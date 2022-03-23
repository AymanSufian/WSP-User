package com.example.my_uni_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class sn extends AppCompatActivity {

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sn);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.wise)));
        getSupportActionBar().setTitle("Information Security");


        TextView textView= (TextView) findViewById(R.id.snn);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        gridView = findViewById(R.id.listviewse);
        ArrayList<doc> arrayList = new ArrayList<>();
        arrayList.add(new doc(R.drawable.jafar, "جعفر \"محمد علي\" عبابنة", "أستاذ مشارك"));
        arrayList.add(new doc(R.drawable.omarmomani1, "عمر المومني", "أستاذ مشارك"));
        arrayList.add(new doc(R.drawable.adeb, "أديب منصور فلاح السعايدة", "أستاذ مساعد"));
        arrayList.add(new doc(R.drawable.bklezi, "محمود خالد بكليزي", "أستاذ مشارك"));
        arrayList.add(new doc(R.drawable.ahmadfraihat, "احمد الفريحات", "أستاذ مساعد"));
        arrayList.add(new doc(R.drawable.sami, "د.سامي الصمادي", "أستاذ مساعد"));
        arrayList.add(new doc(R.drawable.shalbi, "د.محمد الشلبي", "أستاذ مساعد"));
        arrayList.add(new doc(R.drawable.firas, "د.فراس الزعبي", "أستاذ مساعد"));
        DocAdapter docAdapter =new DocAdapter(this,R.layout.list_view_cs,arrayList);
        gridView.setAdapter(docAdapter);



    }
}
