package com.example.user.todo;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyAdapter a = new MyAdapter(this, generateData());
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(a);
        //"+" button in the MAIN_UI should call generateData()
     }

    private ArrayList<Item> generateData()
    {


    } 

}

    }
}

