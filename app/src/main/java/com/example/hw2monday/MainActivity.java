package com.example.hw2monday;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   // public TextView textView;
    public BoardController controller = new BoardController();  //could be the problem
    private  Button[][] buttonsArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsArray = new Button[4][4];

       // textView = ;

        //create the buttons, assign to a findViewById
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
        Button b3 = (Button) findViewById(R.id.b3);
        Button b4 = (Button) findViewById(R.id.b4);
        Button b5 = (Button) findViewById(R.id.b5);
        Button b6 = (Button) findViewById(R.id.b6);
        Button b7 = (Button) findViewById(R.id.b7);
        Button b8 = (Button) findViewById(R.id.b8);
        Button b9 = (Button) findViewById(R.id.b9);
        Button b10 = (Button) findViewById(R.id.b10);
        Button b11 = (Button) findViewById(R.id.b11);
        Button b12 = (Button) findViewById(R.id.b12);
        Button b13 = (Button) findViewById(R.id.b13);
        Button b14 = (Button) findViewById(R.id.b14);
        Button b15 = (Button) findViewById(R.id.b15);
        Button bEmpty = (Button) findViewById(R.id.bEmpty);


        //couldn't instanitate array with for loops, had to do it manually
        buttonsArray[0][0] = b1;
        buttonsArray[0][1] = b2;
        buttonsArray[0][2] = b3;
        buttonsArray[0][3] = b4;
        buttonsArray[1][0] = b5;
        buttonsArray[1][1] = b6;
        buttonsArray[1][2] = b7;
        buttonsArray[1][3] = b8;
        buttonsArray[2][0] = b9;
        buttonsArray[2][1] = b10;
        buttonsArray[2][2] = b11;
        buttonsArray[2][3] = b12;
        buttonsArray[3][0] = b13;
        buttonsArray[3][1] = b14;
        buttonsArray[3][2] = b15;
        buttonsArray[3][3] = bEmpty;


       updateButtons();


        //setOnClickListeners for all buttons
        //COULD BE the problem (the param)
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        bEmpty.setOnClickListener(this);

    }

    public void updateButtons(){
        //sets the text on each button to what is in on randomBoard
        for (int c = 0; c < 4 ; c++){
            for (int r = 0; r < 4; r++){
                if (controller.randomBoard[r][c] == 16){
                    buttonsArray[r][c].setText(" ");
                }
                else {
                    buttonsArray[r][c].setText("" + controller.randomBoard[r][c]);
                }
            }
        }

        //check if win

    }

    @Override
    public void onClick(View view) {
        //do the switch statement to see if i can see the text of the textView
        //(do buttons later)
        switch(view.getId()) {
            case R.id.b1:
               // textView.setText(R.string._1);
                //controller.move(controller.randomBoard, 0,0);
                //updateBoard()
                //if (controller.checkAbove(0,0, controller.randomBoard)) {
                //   buttonsArray[0][0].setText(controller.randomBoard[0][0]);
                // }

                break;
            case R.id.b2:
               // textView.setText(R.string._2);
                break;
            case R.id.b3:
              //  textView.setText(R.string._3);
                break;
            case R.id.b15:
                //stpe 1: find the r c for b15
                //step 2: call move(r,c)
                controller.move(3,2);

                //step 3: update buttons
                updateButtons();
                break;
            case R.id.bEmpty:
              //  textView.setText(R.string.empty);
                break;
            case R.id.resetButton:
               // updateBoard(controller, buttonsArray);
                break;
        }
        }
    }