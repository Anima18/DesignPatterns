package com.chirs.designpattern.simplefactory;

import com.chirs.designpattern.utils.PrintUtil;

/**
 * Created by Admin on 2018/5/9.
 */
public class ProductA implements Product {
    @Override
    public void show() {
        PrintUtil.print("this is  ProductA");
    }
}
