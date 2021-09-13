package com.check_currency.app;

public class RandomNum {
    int num = 1;
    public RandomNum(int n){
        this.num = n;
    }
    public int getRandom(){
        return (int) (Math.random() * (num - 1) + 1);
    }
}
