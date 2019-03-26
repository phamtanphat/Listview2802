package khoapham.ptp.phamtanphat.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCoban;
    ArrayList<String> mangmonhoc = new ArrayList<>();
    ArrayAdapter banve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCoban = findViewById(R.id.listview);
        mangmonhoc.add("Toan");
        mangmonhoc.add("Ly");
        mangmonhoc.add("Hoa");

        banve = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangmonhoc);
        lvCoban.setAdapter(banve);

//        lvCoban.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                mangmonhoc.remove(position);
//                banve.notifyDataSetChanged();
//            }
//        });
        lvCoban.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                mangmonhoc.add(0,"anh van");
                banve.notifyDataSetChanged();
                return true;
            }
        });

    }
}
