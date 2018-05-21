package com.chirs.designpattern.templatemethod;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/21.
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepareRecipe();

        PrintUtil.print("=============================");

        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        coffeeWithHook.prepareRecipe();
    }
}
