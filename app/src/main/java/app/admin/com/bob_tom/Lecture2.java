package app.admin.com.bob_tom;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Lecture2 extends AppCompatActivity {

    private int[] bgColor_list = {Color.BLACK,Color.BLUE,Color.CYAN,Color.DKGRAY,
            Color.GRAY,Color.GREEN,Color.LTGRAY,Color.MAGENTA,Color.RED,Color.WHITE,Color.YELLOW
    };//all standard color

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture2);

        mTextView =findViewById(R.id.lec2_tv);
    }

    public void randomizedColor(View button){
        Random rGenerator = new Random();
        int index = rGenerator.nextInt(bgColor_list.length);
        mTextView.setBackgroundColor(bgColor_list[index]);
        button.setBackgroundColor(bgColor_list[index]);

    }
}
