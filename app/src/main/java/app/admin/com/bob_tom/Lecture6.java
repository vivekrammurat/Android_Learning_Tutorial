package app.admin.com.bob_tom;

import android.app.ListActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Lecture6 extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private ListView lv;
    private String list_of_food[] = {
       "Vada Pav","Samosa","Pav Bhaji" ,"Chinees ","Itely sambher","Cold Drink","Missal Pav","Pani puri"
       ,"Chaat" , "Sweets","Anda Pav"
    } ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lecture6);

        lv = findViewById(R.id.list_hai);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list_of_food);
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),"You Click On "+((TextView)view).getText()+" "+position++,Toast.LENGTH_SHORT).show();

    }
}
