package com.designsPatterns;

/**
 * @author wcc
 *所有成分的父类，抽象类有一个描述自己的方法和一个得到价格的方法，以及一个打印自身描述和价格的方法（该方法与上面两个方法构成模板方法哦！）
 */
public abstract class Ingredient{
    public abstract double getPrice();
    public abstract String getDescription();
    public void printDescription(){
        System.out.println("名称"+this.getDescription());
        System.out.println("价格"+this.getPrice());
    }
}
