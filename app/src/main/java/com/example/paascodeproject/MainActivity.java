package com.example.paascodeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4;
    private Button button1,button2,button3,button4,button5,
                    button6,button7,button8,button9,button0,
                    buttonok,buttondel;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=findViewById(R.id.buut0);
         button1=findViewById(R.id.buut1);
         button2=findViewById(R.id.buut2);
         button3=findViewById(R.id.buut3);
         button4=findViewById(R.id.buut4);
         button5=findViewById(R.id.buut5);
         button6=findViewById(R.id.buut6);
         button7=findViewById(R.id.buut7);
         button8=findViewById(R.id.buut8);
         button9=findViewById(R.id.buut9);
         buttonok=findViewById(R.id.buutok);
         buttondel=findViewById(R.id.buutdel);

         textView1=findViewById(R.id.tv1);
         textView2=findViewById(R.id.tv2);
         textView3=findViewById(R.id.tv3);
         textView4=findViewById(R.id.tv4);



         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                     String a=textView1.getText().toString();
                   String b=textView2.getText().toString();
                   String c=textView3.getText().toString();
                   String d=textView4.getText().toString();

                 if (a.isEmpty())
                 {
                     textView1.setText("1");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("1");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("1");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("1");
                     }

                 }

             }
         });
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("2");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("2");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("2");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("2");
                     }
                 }

             }
         });
         button3.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("3");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("3");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("3");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("3");
                     }
                 }

             }
         });
         button4.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("4");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("4");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("4");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("4");
                     }
                 }

             }
         });
         button5.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("5");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("5");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("5");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("5");
                     }
                 }

             }
         });
         button6.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("6");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("6");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("6");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("6");
                     }
                 }

             }
         });
         button7.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("7");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("7");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("7");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("7");
                     }
                 }

             }
         });
         button8.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("8");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("8");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("8");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("8");
                     }
                 }

             }
         });
         button9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("9");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("9");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("9");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("9");
                     }
                 }

             }
         });
         button0.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (a.isEmpty())
                 {
                     textView1.setText("0");
                 }
                 else if (b.isEmpty())
                 {
                     textView2.setText("0");
                 }
                 else if (c.isEmpty())
                 {
                     textView3.setText("0");
                 }
                 else {
                     if (d.isEmpty())
                     {
                         textView4.setText("0");
                     }
                 }

             }
         });

         buttondel.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 String a=textView1.getText().toString();
                 String b=textView2.getText().toString();
                 String c=textView3.getText().toString();
                 String d=textView4.getText().toString();
                 if (!d.isEmpty())
                 {
                     textView4.setText("");
                 }
                 else if (!c.isEmpty())
                 {
                     textView3.setText("");
                 }
                 else if (!b.isEmpty())
                 {
                     textView2.setText("");
                 }
                 else {
                     textView1.setText("");
                 }

             }
         });
     }
}
