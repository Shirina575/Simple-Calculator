package com.example.viserion.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    
EditText num1, num2;
    
Button plus, minus, multi, div;
    
TextView output;

   
 @Override
    protected void onCreate(Bundle savedInstanceState) {
       
 super.onCreate(savedInstanceState);
       
 setContentView(R.layout.activity_main);

       
 num1 = (EditText) findViewById(R.id.Input1);
     
   num2 = (EditText) findViewById(R.id.Input2);
       
 plus = (Button) findViewById(R.id.Plus);
       
 minus = (Button) findViewById(R.id.Minus);
       
 multi = (Button) findViewById(R.id.Multiplication);
       
 div = (Button) findViewById(R.id.Division);
        
output = (TextView) findViewById(R.id.Output);

       
 plus.setOnClickListener(new View.OnClickListener() {
          
  @Override
            
public void onClick(View view) {

               
 StringBuilder stringBuilder = new StringBuilder();

             
   double firstNumber = Double.parseDouble(num1.getText().toString());
              
  double secondNumber = Double.parseDouble(num2.getText().toString());
               
 double result = firstNumber + secondNumber;
               
 stringBuilder.append(result);
               
 openResultActivity();
               
 output.setText(stringBuilder.toString());

            }
        });
       
 minus.setOnClickListener(new View.OnClickListener() {
           
 @Override
            public void onClick(View view) {

             
   StringBuilder stringBuilder = new StringBuilder();

              
  double firstNumber = Double.parseDouble(num1.getText().toString());
              
  double secondNumber = Double.parseDouble(num2.getText().toString());
                
double result = firstNumber - secondNumber;
               
 stringBuilder.append(result);
              
  openResultActivity();
               
 output.setText(stringBuilder.toString());

            }
        });
        
multi.setOnClickListener(new View.OnClickListener() {
           
 @Override
            public void onClick(View view) {

                
StringBuilder stringBuilder = new StringBuilder();

                
double firstNumber = Double.parseDouble(num1.getText().toString());
            
    double secondNumber = Double.parseDouble(num2.getText().toString());
            
    double result = firstNumber * secondNumber;
              
  stringBuilder.append(result);
              
  openResultActivity();
               
 output.setText(stringBuilder.toString());

            }
        });
      
  div.setOnClickListener(new View.OnClickListener() {
          
  @Override
            public void onClick(View view) {

               
 StringBuilder stringBuilder = new StringBuilder();

                //To convert string value to double 
      
          double firstNumber = Double.parseDouble(num1.getText().toString());
               
 double secondNumber = Double.parseDouble(num2.getText().toString());
             
   double result = firstNumber / secondNumber;
                
stringBuilder.append(result);
               
 openResultActivity();
               
 output.setText(stringBuilder.toString());

            }

        });

    }
   
 public void openResultActivity(){
      
  Intent intent = new Intent(this, ResultActivity.class);
        
startActivity(intent);

    }
}
