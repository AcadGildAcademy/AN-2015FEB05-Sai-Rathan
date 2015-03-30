package com.example.user.todo;

/**
 * Created by user on 25/3/2015.
 */
public class Item
{
   private String title;
   private String description;
   private String duedate;
   private int id;
  public Item(String title, String description,String duedate,int id)
  {

           super();
           this.title = title;
           this.description = description;
           this.duedate=duedate;
           this.id=id;

    }
    public String getTitle(){return this.title;}
    public void setTitle(String title){this.title=title;}
    public String getDescription(){return this.description;}
    public void setDescription(String description) {this.description = description;}
    public String getDuedate (){return this.duedate;}
    public void setDuedate(String duedate){this.duedate = duedate;}
    public int getId(){return this.id;}
    public void setId(int id){this.id=id;}
}
