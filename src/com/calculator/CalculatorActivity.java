package com.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	int x = 0;
    int y = 0;
    int numx = 0;
    int numy = 0;
    int symbol = 0;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bPlus,bAdd,bMul,bChu,bEqual,bClear;
	TextView tv;
	boolean flag;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        tv = (TextView)findViewById(R.id.textView1);
        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b0 = (Button)findViewById(R.id.button10);
        bPlus = (Button)findViewById(R.id.button13);
        bAdd = (Button)findViewById(R.id.button12);
        bMul = (Button)findViewById(R.id.button11);
        bChu = (Button)findViewById(R.id.button14);
        bEqual = (Button)findViewById(R.id.button15);
        bClear= (Button)findViewById(R.id.button16);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bAdd.setOnClickListener(this);
        bMul.setOnClickListener(this);
        bChu.setOnClickListener(this);
        bEqual.setOnClickListener(this);
        bClear.setOnClickListener(this);
        
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//this.
		if(v==b1){
			if(flag==false){
				x = (int) (x*10+Integer.parseInt(b1.getText().toString()));
		tv.setText(x+"");
			}else{
				y = (int) (y*10+Integer.parseInt(b1.getText().toString()));
				tv.setText(y+"");
			}
		}else if(v==b2){
			if(flag==false){
				x = (int) (x*10+Integer.parseInt(b2.getText().toString()));
		tv.setText(x+"");
			}else{
				y = (int) (y*10+Integer.parseInt(b2.getText().toString()));
				tv.setText(y+"");
			}
			}else if(v==b3){
				if(flag==false){
					x = (int) (x*10+Integer.parseInt(b3.getText().toString()));
			tv.setText(x+"");
				}else{
					y = (int) (y*10+Integer.parseInt(b3.getText().toString()));
					tv.setText(y+"");
				}
				}else if(v==b4){
					if(flag==false){
						x = (int) (x*10+Integer.parseInt(b4.getText().toString()));
				tv.setText(x+"");
					}else{
						y = (int) (y*10+Integer.parseInt(b4.getText().toString()));
						tv.setText(y+"");
					}
				}else if(v==b5){
					if(flag==false){
						x = (int) (x*10+Integer.parseInt(b5.getText().toString()));
				tv.setText(x+"");
					}else{
						y = (int) (y*10+Integer.parseInt(b5.getText().toString()));
						tv.setText(y+"");
					}
				}else if(v==b6){
					if(flag==false){
						x = (int) (x*10+Integer.parseInt(b6.getText().toString()));
				tv.setText(x+"");
					}else{
						y = (int) (y*10+Integer.parseInt(b6.getText().toString()));
						tv.setText(y+"");
					}
				}else if(v==b7){
					if(flag==false){
						x = (int) (x*10+Integer.parseInt(b7.getText().toString()));
				tv.setText(x+"");
					}else{
						y = (int) (y*10+Integer.parseInt(b7.getText().toString()));
						tv.setText(y+"");
					}
				}else if(v==b8){
					if(flag==false){
						x = (int) (x*10+Integer.parseInt(b8.getText().toString()));
				tv.setText(x+"");
					}else{
						y = (int) (y*10+Integer.parseInt(b8.getText().toString()));
						tv.setText(y+"");
					}
				}else if(v==b9){
					if(flag==false){
						x = (int) (x*10+Integer.parseInt(b9.getText().toString()));
				tv.setText(x+"");
					}else{
						y = (int) (y*10+Integer.parseInt(b9.getText().toString()));
						tv.setText(y+"");
					}
				}else if(v==b0){
					if(flag==false){
						x = (int) (x*10+Integer.parseInt(b0.getText().toString()));
				tv.setText(x+"");
					}else{
						if(symbol==4){
							return ;
						}
						y = (int) (y*10+Integer.parseInt(b0.getText().toString()));
						tv.setText(y+"");
					}
				}else if(v==bClear){
					flag = false;
					x= 0;
					y = 0;
					numx = 0;
					numy = 0;
					symbol = 0;
					tv.setText("0");
				}else if(v==bPlus){
					flag = true;
					symbol = 1;
					tv.setText(bPlus.getText());
				}else if(v==bAdd){
					flag = true;
					symbol = 2;
					tv.setText(bAdd.getText());
				}else if(v==bMul){
					flag = true;
					symbol = 3;
					tv.setText(bMul.getText());
				}else if(v==bChu){
					symbol = 4;
					flag = true;
					tv.setText(bChu.getText());
				}else if(v==bEqual){
					flag = true;
					int result = 0;
					switch (symbol)
					{
					case 1:
						result = x-y;
						break;
					case 2:
						result = x+y;
						break;
					case 3:
						result = x*y;
						break;
					case 4:
						result = x/y;
						break;
					}
					
					tv.setText(result+"");
					flag = false;
					x= 0;
					y = 0;
					numx = 0;
					numy = 0;
					symbol = 0;
				}
	}
}