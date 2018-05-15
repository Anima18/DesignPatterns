package com.chirs.designpattern.simplefactory;

/**
 * Created by Admin on 2018/5/9.
 */
public class SimpleFactory {
    public static Product create(String productType) {
        if("A".equals(productType)) {
            return new ProductA();
        }else if ("B".equals(productType)) {
            return new ProductB();
        }else {
            throw new IllegalArgumentException("商品类型不正确");
        }
    }
}
