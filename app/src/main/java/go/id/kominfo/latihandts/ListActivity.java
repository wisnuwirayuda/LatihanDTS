package go.id.kominfo.latihandts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.collection.SimpleArrayMap;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, new String[]{"Indonesia",
        "China", "Japan", "Korea Selatan", "India", "Korea Selatan", "Brunei Darussalam", "Arab Saudi", "Brazil", "Argentina", "Spain", "Germany", "Australia", "Bangladesh", "Denmark", "Filipina", "Honduras"});
        listView.setAdapter(adapter);
    }
}