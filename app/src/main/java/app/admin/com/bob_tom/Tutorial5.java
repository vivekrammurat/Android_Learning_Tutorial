package app.admin.com.bob_tom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Tutorial5 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner mSpinner;
    private ImageView iv1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture5);

         mSpinner = findViewById(R.id.spinner1);
         iv1 = findViewById(R.id.imageViewl5);

        mSpinner.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 1:
                Toast.makeText(getApplicationContext(),"Hiii i am  "+position,Toast.LENGTH_SHORT).show();
                iv1.setImageResource(R.drawable.chacha);
                iv1.setVisibility(View.VISIBLE);
                break;
            case 2:
                Toast.makeText(getApplicationContext(),"Hiii i am "+position,Toast.LENGTH_SHORT).show();
                iv1.setVisibility(View.INVISIBLE);
                break;
            case 3:
                Toast.makeText(getApplicationContext(),"Hiii i am "+position,Toast.LENGTH_SHORT).show();
                iv1.setImageResource(R.drawable.ic_launcher_background);
                iv1.setVisibility(View.VISIBLE);
                break;
            case 4:
                Toast.makeText(getApplicationContext(),"Hiii i am "+position,Toast.LENGTH_SHORT).show();
                iv1.setVisibility(View.INVISIBLE);
                break;
            case 5:
                Toast.makeText(getApplicationContext(),"Hiii i am "+position,Toast.LENGTH_SHORT).show();
                iv1.setVisibility(View.VISIBLE);

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
