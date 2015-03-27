package com.example.user.todo;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater i=getMenuInflater();
        i.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
       switch(item.getItemId())
       {
           case R.id.Note: generateData();
               break;
           case R.id.Complete:setContentView(R.layout.custom_dialog);
             break;
           default:
               return super.onOptionsItemSelected(item);
    }
        return super.onOptionsItemSelected(item);
}

    private ArrayList<Item> generateData() {
        //this function will return ArrayList<Item> type object,An induvidual ToDo task//
//pressing + button in the actionbar will lead you here. Have the take the component's values in the customdialog and copy them to
//the database HERE
        return;
    }

}


