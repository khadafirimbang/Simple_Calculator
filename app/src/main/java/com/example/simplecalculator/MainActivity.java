package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine, remainder, clear, del, div, mul, sub, add, equal, dot, root;
    TextView tvTop, tvBottom;
    double firstNum, secondNum, result;
    char op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTop = findViewById(R.id.tvTop);
        tvBottom = findViewById(R.id.tvBottom);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        remainder = findViewById(R.id.remainder);
        clear = findViewById(R.id.clear);
        del = findViewById(R.id.del);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);
        sub = findViewById(R.id.sub);
        add = findViewById(R.id.add);
        equal = findViewById(R.id.equal);
        dot = findViewById(R.id.dot);
        root = findViewById(R.id.root);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvBottom.getText().length() > 0) {
                    firstNum = Double.parseDouble(tvBottom.getText().toString());
                    op = '+';
                    tvTop.setText(String.valueOf(firstNum) + op);
                    tvBottom.setText("");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvBottom.getText().length() > 0) {
                    firstNum = Double.parseDouble(tvBottom.getText().toString());
                    op = '-';
                    tvTop.setText(String.valueOf(firstNum) + op);
                    tvBottom.setText("");
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvBottom.getText().length() > 0) {
                    firstNum = Double.parseDouble(tvBottom.getText().toString());
                    op = '*';
                    tvTop.setText(String.valueOf(firstNum) + 'x');
                    tvBottom.setText("");
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvBottom.length() > 0) {
                    firstNum = Double.parseDouble(tvBottom.getText().toString());
                    op = '/';
                    tvTop.setText(String.valueOf(firstNum) + '÷');
                    tvBottom.setText("");
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(tvBottom.getText().length() > 0) {
                    secondNum = Double.parseDouble(tvBottom.getText().toString());

                    switch (op) {
                        case '+':
                            result = firstNum + secondNum;
                            break;
                        case '-':
                            result = firstNum - secondNum;
                            break;
                        case '*':
                            result = firstNum * secondNum;
                            op = 'x';
                            break;
                        case '/':
                            result = firstNum / secondNum;
                            op = '÷';
                            break;
                        case '%':
                            result = firstNum % secondNum;
                            op = '%';
                            break;
                    }

                        tvTop.setText(Double.toString(firstNum)+op+Double.toString(secondNum));
                        tvBottom.setText(Double.toString(result));

                }


            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText("");
                tvTop.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = tvBottom.getText().toString();
                if(tvBottom.length() > 0)
                {
                    String removeLastChar = input.substring(0, input.length()-1);
                    tvBottom.setText(removeLastChar);
                }
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvBottom.getText().length() > 0) {
                    double root = Math.sqrt(Double.parseDouble(tvBottom.getText().toString()));
                    tvTop.setText("√" + tvBottom.getText().toString());
                    tvBottom.setText(Double.toString(root));
                }
            }
        });

        remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tvBottom.length() > 0) {
                    firstNum = Double.parseDouble(tvBottom.getText().toString());
                    op = '%';
                    tvTop.setText(String.valueOf(firstNum) + '%');
                    tvBottom.setText("");
                }
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!tvBottom.getText().toString().contains(".")) {
                    tvBottom.setText(tvBottom.getText().toString()+'.');
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+0);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+3);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+4);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+5);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+6);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+7);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+8);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBottom.setText(tvBottom.getText().toString()+9);
            }
        });


    }

}