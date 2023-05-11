package com.scaler.springboot1.task;

import java.util.Date;

public class Task {

    Integer id;
    String name;
    Date dueDate;
    Boolean completed;

    public Task (Integer id, String name, Date dueDate, Boolean completed){
        this.id = id;
        this.name = name;
        this.dueDate = dueDate;
        this.completed = completed;
    }

    // getters & setters for id
    public Integer getId (){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // getters & setters for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    // getters & setters for duedate
    public Date getDueDateDate (){
        return dueDate;
    }
    public void setDueDate(Date dueDate){
        this.dueDate = dueDate;
    }

    // getters & setters for completed
    public Boolean getCompleted (){
        return completed;
    }
    public void setCompleted(Boolean completed){
        this.completed = completed;
    }

}
