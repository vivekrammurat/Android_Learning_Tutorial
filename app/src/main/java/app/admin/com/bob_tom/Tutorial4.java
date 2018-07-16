package app.admin.com.bob_tom;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Tutorial4 extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private Button b1,b2,b3,rating_btn;
    private RadioGroup Gunit;
    private RadioButton rb1,rb2,rb3;
    private CheckBox cb1,cb2,cb3;
    private ToggleButton tb1,tb2,tb3;
    private RatingBar ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture4);


        b1=findViewById(R.id.b1_l4);
        b2=findViewById(R.id.b2_l4);
        b3=findViewById(R.id.b3_l4);
        rating_btn = findViewById(R.id.rating_btn);

        Gunit = findViewById(R.id.rg_l4);
        rb1 = findViewById(R.id.rb1_l4);
        rb2 = findViewById(R.id.rb2_l4);
        rb3 = findViewById(R.id.rb3_l4);

        cb1 = findViewById(R.id.checkBox1);
        cb2 = findViewById(R.id.checkBox2);
        cb3 = findViewById(R.id.checkBox3);

        tb1= findViewById(R.id.toggleButton1);
        tb2=findViewById(R.id.toggleButton2);
        tb3 = findViewById(R.id.toggleButton3);




        b1.setOnClickListener(new Toastrest(b1.getText(),this));
        b2.setOnClickListener(new Toastrest(b2.getText(),this));


        Gunit.setOnCheckedChangeListener(this);//radio group

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        rating_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float ratingvalue = ratingBar.getRating() ;
                Toast.makeText(getApplicationContext(),"Your feedback is"+ratingvalue,Toast.LENGTH_SHORT).show();

            }
        });



    }

    //this method is called by checkbox in Layout
    public void selectedItem(View view){
        boolean checked = ((CheckBox) view).isChecked();
        if(checked) {
            switch (view.getId()) {
                case R.id.checkBox1:
                    Toast.makeText(this, cb1.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.checkBox2:
                    Toast.makeText(this, cb2.getText(), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.checkBox3:
                    Toast.makeText(this, cb3.getText(), Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }

    //this is ToggalButton called method
    public  void changeVibrateState(View view){
        boolean checked = ((ToggleButton) view).isChecked();
        if(checked){
            switch (view.getId()){
                case R.id.toggleButton1:
                    Toast.makeText(this, tb1.getText(),Toast.LENGTH_SHORT).show();
                    break;
                case R.id.toggleButton2:
                    Toast.makeText(this, tb2.getText(),Toast.LENGTH_SHORT).show();
                    break;
                case R.id.toggleButton3:
                    Toast.makeText(this, tb3.getText(),Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
    //this is implementeted method of radio group
    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.rb1_l4:
                Toast.makeText(getApplicationContext(),rb1.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb2_l4:
                Toast.makeText(this,rb2.getText(),Toast.LENGTH_SHORT).show();
                break;
            case R.id.rb3_l4:
                Toast.makeText(this,rb3.getText(),Toast.LENGTH_SHORT).show();
        }
    }

    private class Toastrest implements View.OnClickListener {
        CharSequence name;
        Tutorial4 mclass;
        public Toastrest(CharSequence name, Tutorial4 mclass) {
            this.name = name;
            this.mclass=mclass;
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(),name,Toast.LENGTH_SHORT).show();

        }
    }
}
