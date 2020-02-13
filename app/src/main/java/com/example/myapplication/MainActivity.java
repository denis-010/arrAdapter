package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    ArrayAdapter<String> adapter;
    String[] forbes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        forbes = getResources().getStringArray(R.array.forbes);
        adapter = new ArrayAdapter<>(this,R.layout.simplelistview,forbes);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        String element = forbes[position];
        Toast.makeText(this,element,Toast.LENGTH_LONG).show();
        forbes[0] = "Tim Cook";
        adapter.notifyDataSetInvalidated();
    }
}
