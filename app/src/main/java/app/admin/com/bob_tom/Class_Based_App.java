package app.admin.com.bob_tom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Class_Based_App extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String button_txt1 = "Push_Me";
        final String button_txt2 = "Click_me";
        String show_label_text = "This is a Test";
        Button btn1,btn2;



        LinearLayout mainLinearLayout  = new LinearLayout(this);
        mainLinearLayout.setOrientation(LinearLayout.VERTICAL);

        //Button btn1 = new Button(this);
        btn1 = new Button(this);
        btn1.setText(button_txt1);
        mainLinearLayout.addView(btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),button_txt1,Toast.LENGTH_SHORT).show();
            }
        });

       // Button btn2 = new Button(this);
        btn2 = new Button(this);
        btn2.setText(button_txt2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),button_txt2,Toast.LENGTH_SHORT).show();
            }
        });
        mainLinearLayout.addView(btn2);

        TextView label = new TextView(this);
        label.setText(show_label_text);
        mainLinearLayout.addView(label);

        setContentView(mainLinearLayout);

    }

}


