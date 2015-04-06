package com.example.user.todo;

import android.app.AlertDialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity
{
    String title,description,duedate;
    public int count=0;
    Button b1,b2;
    EditText e1,e2;
    CalendarView ca;
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
           case R.id.Note: alert();
               break;
           case R.id.Complete:
           Intent i=new Intent(MainActivity.this,completedActivity.class);
            startActivity(i);
            break;
           default:
               return super.onOptionsItemSelected(item);
    }
        return super.onOptionsItemSelected(item);
}
    void alert()
    {
        Context c=getApplicationContext();
        LayoutInflater li=LayoutInflater.from(c);
        View v=li.inflate(R.layout.custom_dialog,null);
        AlertDialog.Builder b=new AlertDialog.Builder(c);
        b.setView(v);
        b.setCancelable(false).setPositiveButton("Save", new DialogInterface.OnClickListener() {

            @Override

            public void onClick(DialogInterface dialog, int which) {
                b1 = (Button) findViewById(R.id.button);
                b2 = (Button) findViewById(R.id.button2);
                e1 = (EditText) findViewById(R.id.editText);
                e2 = (EditText) findViewById(R.id.editText2);
                ca = (CalendarView) findViewById(R.id.calendarView);
                long due = ca.getDate();
                title = b1.getText().toString();
                description = b2.getText().toString();
                duedate = String.valueOf(due);
                dialog.dismiss();
            }

        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id) {
                dialog.dismiss();
            }

        });

    }


    private ArrayList<Item> generateData()
    {

      // ArrayList<Item> a=new ArrayList<Item>(5);
        //Item i=new Item("a","b","c");
        //a.add(i);
        ArrayList<Item> i1=new ArrayList<Item>();
        Item i2 = new Item(title, description, duedate);
        i1.add(i2);
        DatabaseHandler d=new DatabaseHandler(getApplicationContext());
        long l = d.addToDo(i2);
        if (l != -1) {
            Toast.makeText(getApplicationContext(), "Insert Is Successful", Toast.LENGTH_LONG).show();
            count++;
        }
        else
            Toast.makeText(getApplicationContext(), "Insert Is Unsccessful", Toast.LENGTH_LONG).show();
        return i1;
    }

}


