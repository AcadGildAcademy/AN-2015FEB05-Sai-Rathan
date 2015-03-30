package com.example.user.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 25/3/2015.
 */
public class MyAdapter extends ArrayAdapter<Item>
{
    public final Context context;

    public final ArrayList<Item> itemsArrayList;

    public MyAdapter(Context context,ArrayList<Item> itemsArrayList)
    {
        super(context,R.layout.row,itemsArrayList);
        this.context=context;
        this.itemsArrayList=itemsArrayList;
    }
    @Override
   public View getView(int position,View convertView, ViewGroup parent)
   {

       LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
       View rowview=inflater.inflate(R.layout.row,parent,false);
       TextView t1=(TextView)rowview.findViewById(R.id.textView);
       TextView t2=(TextView)rowview.findViewById(R.id.textView2);
       TextView t3=(TextView)rowview.findViewById(R.id.textView3);
       TextView t4=(TextView)rowview.findViewById(R.id.textView4);

       return rowview;

   }

}
