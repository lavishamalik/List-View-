package com.example.leaninlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.listView);
        String []colors={"red","blue","green","yellow","pink","purple","a","b","d","d","sa","sd","sss","dds"};
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,R.layout.itemview,R.id.textView,colors);
        listView.setAdapter(adapter);
    }
}
