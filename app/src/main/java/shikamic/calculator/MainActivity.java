package shikamic.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener
{
    Button bnine,beight,bseven,bsix,bfive,bfour,bthree,btwo,bone,bzero,bplus,bequals;
    TextView tv;
    String str = "0";
    int result = 0;
    char op = ' ';

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bnine=(Button)findViewById(R.id.b9);
        beight=(Button)findViewById(R.id.b8);
        bseven=(Button)findViewById(R.id.b7);
        bsix=(Button)findViewById(R.id.b6);
        bfive=(Button)findViewById(R.id.b5);
        bfour=(Button)findViewById(R.id.b4);
        bthree=(Button)findViewById(R.id.b3);
        btwo=(Button)findViewById(R.id.b2);
        bone=(Button)findViewById(R.id.b1);
        bzero=(Button)findViewById(R.id.b0);
        bplus=(Button)findViewById(R.id.bpl);
        bequals=(Button)findViewById(R.id.beq);
        tv=(TextView)findViewById(R.id.display);
        bnine.setOnClickListener(this);
        beight.setOnClickListener(this);
        bseven.setOnClickListener(this);
        bsix.setOnClickListener(this);
        bfive.setOnClickListener(this);
        bfour.setOnClickListener(this);
        bthree.setOnClickListener(this);
        btwo.setOnClickListener(this);
        bone.setOnClickListener(this);
        bzero.setOnClickListener(this);
        bplus.setOnClickListener(this);
        bequals.setOnClickListener(this);
        tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.b0:
            case R.id.b1:
            case R.id.b2:
            case R.id.b3:
            case R.id.b4:
            case R.id.b5:
            case R.id.b6:
            case R.id.b7:
            case R.id.b8:
            case R.id.b9:

                String buttonInput = ((Button) v).getText().toString();
                if (str.equals("0"))
                {
                    str= buttonInput;
                }
                else
                {
                    str+=buttonInput;
                }
                tv.setText(str);
                if(op == '=')
                {
                    result=0;
                    op =' ';
                }
                break;
            case R.id.bpl:
                compute();
                op = '+';
                break;
            case R.id.beq:
                compute();
                op = '=';
                break;
        }
    }

    private void compute()
    {
        int buttonInput = Integer.parseInt(str);
        str = "0";

        if (op == ' ')
        {
            result = buttonInput;
        }
        else if (op == '+')
        {
            result += buttonInput;
        }
        else if (op == '='){

        }
        tv.setText(String.valueOf(result));
    }
}