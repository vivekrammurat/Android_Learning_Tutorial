package app.admin.com.bob_tom;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Tutorial3ex1 extends AppCompatActivity{
    private TextView tvSetColorME;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String btn1 ="Hiii on Clicked to Me";
        String btn2 = "Bye Bye On Click to Me";
        String tvMsg = "Thank you Very Much ";//red
        LinearLayout mLinearLayout = new LinearLayout(this);
        mLinearLayout.setOrientation(LinearLayout.VERTICAL);

        tvSetColorME = new TextView(this);
        tvSetColorME.setTextSize(40);
        tvSetColorME.setText(tvMsg);
        mLinearLayout.addView(tvSetColorME);

        Button button1 = new Button(this);
        Button button2 = new Button(this);
        //Button button3 = new Button(this);

        button1.setText(btn1);
        button2.setText(btn2);

        button1.setOnClickListener(new SetTextTo(Color.RED,btn1,this));
        button2.setOnClickListener(new SetTextTo(Color.YELLOW,btn2,this));

        mLinearLayout.addView(button1);
        mLinearLayout.addView(button2);

        setContentView(mLinearLayout);
    }

    private class SetTextTo implements View.OnClickListener {
        private int index;
        private String name;
        private Tutorial3ex1 mclass;
        public SetTextTo(int index, String name, Tutorial3ex1 mclass) {
            this.index = index;
            this.name = name;
            this.mclass = mclass;
        }

        @Override
        public void onClick(View v) {
            setTextTo_mColor(index,name);
        }
    }

    private void setTextTo_mColor(int index, String name) {
        tvSetColorME.setBackgroundColor(index);
        tvSetColorME.setText(name);
        Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();

    }
}
