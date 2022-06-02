package sg.edu.rp.c346.id21024120.demosimplelistviewexamtips;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> aa;
    String items[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lv); //UI

        items = new String[5];      //data
        items[0] = "Don't just read the code, code it as much as possible during each practical session";
        items[1] = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        items[2] = "Prepare your template source code for each topic";
        items[3] = "Create a few empty Android projects to speed up your coding during the exam";
        items[4] = "Ensure that your Android Studio is up and running before the exam";

        aa = new ArrayAdapter<>(MainActivity.this, //where
                android.R.layout.simple_list_item_1, //how
                items); //what

        lv.setAdapter(aa);

    }
}
