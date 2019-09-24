package com.example.ad37_tdhai_b4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    Adapter adapter;
    List<Singleview> singleview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.listview);

        singleview=new ArrayList<>();

        singleview.add(new Singleview("0989999998","8/1/2019",false));
        singleview.add(new Singleview("0989999997","7/1/2019",false));
        singleview.add(new Singleview("0989999996","6/1/2019",true));
        singleview.add(new Singleview("0989999995","5/1/2019",true));
        singleview.add(new Singleview("0989999994","4/1/2019",false));
        singleview.add(new Singleview("0989999993","3/1/2019",true));
        singleview.add(new Singleview("0989999992","2/1/2019",false));
        singleview.add(new Singleview("0989999991","1/1/2019",false));

        adapter=new Adapter(singleview);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), "Phone:" + singleview.get(i).getPhone()+"\nDate:"+singleview.get(i).getDate(), Toast.LENGTH_LONG).show();
                startActivity(new Intent(getBaseContext(),Detail.class));
            }
        });
    }
}
