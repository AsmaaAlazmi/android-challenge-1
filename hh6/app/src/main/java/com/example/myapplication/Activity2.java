package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
 boolean xturn = true;
 TextView turn ;
 int[] Xarray = new int[9];
    int[] Oarray = new int[9];
 @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate (savedInstanceState);
     setContentView (R.layout.activity_2);

     final Button zero = findViewById (R.id.button0);
     final Button one = findViewById (R.id.button1);
     final Button two = findViewById (R.id.button2);
     final Button three = findViewById (R.id.button3);
     final Button four = findViewById (R.id.button4);
     final Button five = findViewById (R.id.button5);
     final Button six = findViewById (R.id.button6);
     final Button seven = findViewById (R.id.button7);
     final Button eight = findViewById (R.id.button8);
     final Button reset = findViewById (R.id.button9);

     reset.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             zero.setText ("");
             one.setText ("");
             two.setText ("");
             three.setText ("");
             four.setText ("");
             five.setText ("");
             six.setText ("");
             seven.setText ("");
             eight.setText ("");

         }

     });


     zero.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[0] = 511;
                 checkXwin ();
                 zero.setText ("X");
             } else {
                 Oarray[0] = 511;
                 checkOwin ();
                 zero.setText ("O");
             }
         }
     });
     one.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[1] = 511;
                 checkXwin ();
                 one.setText ("X");
             } else {
                 Oarray[1] = 511;
                 checkOwin ();
                 one.setText ("O");
             }
         }
     });
     two.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[2] = 511;
                 checkXwin ();
                 two.setText ("X");
             } else {
                 Oarray[2] = 511;
                 checkOwin ();
                 two.setText ("O");
             }
         }
     });
     three.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[3] = 511;
                 checkXwin ();
                 three.setText ("X");
             } else {
                 Oarray[3] = 511;
                 checkOwin ();
                 three.setText ("O");
             }
         }
     });
     four.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[4] = 511;
                 checkXwin ();
                 four.setText ("X");
             } else {
                 Oarray[4] = 511;
                 checkOwin ();
                 four.setText ("O");
             }
         }
     });
     five.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[5] = 511;
                 checkXwin ();
                 five.setText ("X");
             } else {
                 Oarray[5] = 511;
                 checkOwin ();
                 five.setText ("O");
             }
         }
     });
     six.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[6] = 511;
                 checkXwin ();
                 six.setText ("X");
             } else {
                 Oarray[6] = 511;
                 checkOwin ();
                 six.setText ("O");
             }
         }
     });
     seven.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[7] = 511;
                 checkXwin ();
                 seven.setText ("X");
             } else {
                 Oarray[7] = 511;
                 checkOwin ();
                 seven.setText ("O");
             }
         }
     });
     eight.setOnClickListener (new View.OnClickListener () {
         @Override
         public void onClick(View v) {
             if (xturn) {
                 Xarray[8] = 511;
                 checkXwin ();
                 eight.setText ("X");
             } else {
                 Oarray[8] = 511;
                 checkOwin ();
                 eight.setText ("O");
             }
         }
     });
 }
    public void checkXwin() {
        xturn = false;
        turn.setText ("Player 'O's turn");
        if (Xarray[0] == 511 && Xarray[1] == 511 && Xarray[2] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        } else if (Xarray[3] == 511 && Xarray[4] == 511 && Xarray[5] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        }
       else if(Xarray[6] == 511 && Xarray[7] == 511 && Xarray[8] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        }
        else if(Xarray[0] == 511 && Xarray[3] == 511 && Xarray[6] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        }
       else if (Xarray[1] == 511 && Xarray[4] == 511 && Xarray[7] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        }
        else if (Xarray[2] == 511 && Xarray[5] == 511 && Xarray[8] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        }
        else if (Xarray[0] == 511 && Xarray[4] == 511 && Xarray[8] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        }
        else if (Xarray[2] == 511 && Xarray[4] == 511 && Xarray[6] == 511) {
            Toast.makeText (Activity2.this, "X won", Toast.LENGTH_SHORT).show();
        }
    }
    public void checkOwin() {
        xturn = true;
        turn.setText ("Player 'X's turn");
        if (Oarray[0] == 511 && Oarray[1] == 511 && Oarray[2] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        } else if (Oarray[3] == 511 && Oarray[4] == 511 && Oarray[5] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        }
        else if(Oarray[6] == 511 && Oarray[7] == 511 && Oarray[8] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        }
        else if(Oarray[0] == 511 && Oarray[3] == 511 && Oarray[6] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        }
        else if (Oarray[1] == 511 && Oarray[4] == 511 && Oarray[7] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        }
        else if (Oarray[2] == 511 && Oarray[5] == 511 && Oarray[8] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        }
        else if (Oarray[0] == 511 && Oarray[4] == 511 && Oarray[8] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        }
        else if (Oarray[2] == 511 && Oarray[4] == 511 && Oarray[6] == 511) {
            Toast.makeText (Activity2.this, "O won", Toast.LENGTH_SHORT).show();
        }


    }



















    }
