package com.telefire.assignment.example.models;


public class Sum {

    private int id;
    private long sum;

    public Sum() { }

    public Sum(long s) {
        sum = s;
    }

    public long getSum() {
        return sum;
    }

    public int getId() {
        return id;
    }

    public void setSum(long sum) {
        this.sum = sum;
    }

    public void setId(int id) {
        this.id = id;
    }
}
