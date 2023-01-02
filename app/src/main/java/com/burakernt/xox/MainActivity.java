package com.burakernt.xox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

import com.burakernt.xox.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
//rethink x = 1     o = 0
    static int xclicky = 0;
    static int oclicky = 0;
    public static int g1 = 5465;
    public static int g2 = 565;
    public static int g3 = 65;
    public static int g4 = 86;
    public static int g5 = 45;
    public static int g6 = 868;
    public static int g7 = 7860;
    public static int g8 = 4530;
    public static int g9 = 7867680;

    private static ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

       /* int g2 = 57;
        int g3 = 65;
        int g4 = 86;
        int g5 = 45;
        int g6 = 868;
        int g7 = 7860;
        int g8 = 4530;
        int g9 = 7867680;*/
        /*binding.x1.setVisibility(View.INVISIBLE);
        binding.x2.setVisibility(View.INVISIBLE);
        binding.x3.setVisibility(View.INVISIBLE);
        binding.x4.setVisibility(View.INVISIBLE);
        binding.x5.setVisibility(View.INVISIBLE);
        binding.x6.setVisibility(View.INVISIBLE);
        binding.x7.setVisibility(View.INVISIBLE);
        binding.x8.setVisibility(View.INVISIBLE);
        binding.x9.setVisibility(View.INVISIBLE);*/

        binding.xDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                xclicky++;
                oclicky = 0;
                if(xclicky >= 1){
                    binding.xClicked.setVisibility(View.VISIBLE);
                }
                else{
                    binding.xClicked.setVisibility(View.INVISIBLE);
                }
                if(oclicky >= 1){
                    binding.oClicked.setVisibility(View.VISIBLE);
                }
                else{
                    binding.oClicked.setVisibility(View.INVISIBLE);
                }
            }
        });


        binding.oDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                oclicky++;
                xclicky = 0;
                if(oclicky >= 1){
                    binding.oClicked.setVisibility(View.VISIBLE);
                }
                else{
                    binding.oClicked.setVisibility(View.INVISIBLE);
                }
                if(xclicky >= 1){
                    binding.xClicked.setVisibility(View.VISIBLE);
                }
                else{
                    binding.xClicked.setVisibility(View.INVISIBLE);
                }

            }
        });


        //1
        binding.x1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x1.setImageResource(R.drawable.xxpng);
                    binding.x1.setVisibility(View.VISIBLE);
                    g1 = 0;


                }
                if(oclicky >= 1){
                    binding.x1.setImageResource(R.drawable.opg);
                    binding.x1.setVisibility(View.VISIBLE);
                    g1 = 1;

                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);

                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //2
        binding.x2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x2.setImageResource(R.drawable.xxpng);
                    binding.x2.setVisibility(View.VISIBLE);
                    g2 = 0;

                }
                if(oclicky >= 1){
                    binding.x2.setImageResource(R.drawable.opg);
                    binding.x2.setVisibility(View.VISIBLE);
                    g2 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);

                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //3
        binding.x3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x3.setImageResource(R.drawable.xxpng);
                    binding.x3.setVisibility(View.VISIBLE);
                    g3 = 0;
                }
                else if(oclicky >= 1){
                    binding.x3.setImageResource(R.drawable.opg);
                    binding.x3.setVisibility(View.VISIBLE);
                    g3 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);

                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //4
        binding.x4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x4.setImageResource(R.drawable.xxpng);
                    binding.x4.setVisibility(View.VISIBLE);
                    g4 = 0;
                }
                else if(oclicky >= 1){
                    binding.x4.setImageResource(R.drawable.opg);
                    binding.x4.setVisibility(View.VISIBLE);
                    g4 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
                else if(g2 == g5&& g2==g8){

                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //5
        binding.x5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x5.setImageResource(R.drawable.xxpng);
                    binding.x5.setVisibility(View.VISIBLE);
                    g5 = 0;
                }
                else if(oclicky >= 1){
                    binding.x5.setImageResource(R.drawable.opg);
                    binding.x5.setVisibility(View.VISIBLE);
                    g5 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //6
        binding.x6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x6.setImageResource(R.drawable.xxpng);
                    binding.x6.setVisibility(View.VISIBLE);
                    g6 = 0;
                }
                else if(oclicky >= 1){
                    binding.x6.setImageResource(R.drawable.opg);
                    binding.x6.setVisibility(View.VISIBLE);
                    g6 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //7
        binding.x7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x7.setImageResource(R.drawable.xxpng);
                    binding.x7.setVisibility(View.VISIBLE);
                    g7 = 0;
                }
                else if(oclicky >= 1){
                    binding.x7.setImageResource(R.drawable.opg);
                    binding.x7.setVisibility(View.VISIBLE);
                    g7 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //8
        binding.x8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x8.setImageResource(R.drawable.xxpng);
                    binding.x8.setVisibility(View.VISIBLE);
                    g8 = 0;
                }
                else if(oclicky >= 1){
                    binding.x8.setImageResource(R.drawable.opg);
                    binding.x8.setVisibility(View.VISIBLE);
                    g8 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
            }

        });
        //9
        binding.x9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(xclicky >= 1){
                    binding.x9.setImageResource(R.drawable.xxpng);
                    binding.x9.setVisibility(View.VISIBLE);
                    g9 = 0;
                }
                else if(oclicky >= 1){
                    binding.x9.setImageResource(R.drawable.opg);
                    binding.x9.setVisibility(View.VISIBLE);
                    g9 = 1;
                }
                if(g1 == g2&& g1==g3){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g4 == g5&& g4==g6){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g7 == g8&& g7==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g4&& g1==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g2 == g5&& g2==g8){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g3 == g6&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.black);
                    binding.x2.setImageResource(R.drawable.black);
                    binding.x3.setImageResource(R.drawable.black);
                    binding.x4.setImageResource(R.drawable.black);
                    binding.x5.setImageResource(R.drawable.black);
                    binding.x6.setImageResource(R.drawable.black);
                    binding.x7.setImageResource(R.drawable.black);
                    binding.x8.setImageResource(R.drawable.black);
                    binding.x9.setImageResource(R.drawable.black);
                }
                else if(g1 == g5&& g1==g9){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x1.setImageResource(R.drawable.b9);
                    binding.x2.setImageResource(R.drawable.b9);
                    binding.x3.setImageResource(R.drawable.b9);
                    binding.x4.setImageResource(R.drawable.b9);
                    binding.x5.setImageResource(R.drawable.b9);
                    binding.x6.setImageResource(R.drawable.b9);
                    binding.x7.setImageResource(R.drawable.b9);
                    binding.x8.setImageResource(R.drawable.b9);
                    binding.x9.setImageResource(R.drawable.b9);

                }
                else if(g3 == g5&& g3==g7){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("KAZANDIN!");
                    alertDialog.setMessage("Oyun bitti.");

                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                    binding.x2.setImageResource(R.drawable.b9);
                    binding.x3.setImageResource(R.drawable.b9);
                    binding.x1.setImageResource(R.drawable.b9);
                    binding.x4.setImageResource(R.drawable.b9);
                    binding.x5.setImageResource(R.drawable.b9);
                    binding.x6.setImageResource(R.drawable.b9);
                    binding.x7.setImageResource(R.drawable.b9);
                    binding.x8.setImageResource(R.drawable.b9);
                    binding.x9.setImageResource(R.drawable.b9);
                }
            }
        });



    }



}