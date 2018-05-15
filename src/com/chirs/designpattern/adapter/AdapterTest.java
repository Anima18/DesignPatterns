package com.chirs.designpattern.adapter;

/**
 * Created by Admin on 2018/5/15.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();

        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        Duck adapter = new TurkeyAdapter(turkey);
        adapter.quack();
        adapter.fly();

    }
}
