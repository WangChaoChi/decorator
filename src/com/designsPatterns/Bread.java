/**
 * 
 */
/**
 * @author wcc
 *
 */
package com.designsPatterns;

/**
 * @author wcc
 *面包类，因为它是一个具体的成分，因此实现父类的所有的抽象方法。描述可以通过构造器传入，
 *也可以通过set方法传入。同样价格也是一样的，我就很简单地返回了。
 */
public class Bread extends Ingredient{
    private String descripotion;
     
    public Bread() {
    }
     
    Bread(String description){
        this.descripotion=description;
    }
     
    @Override
    public double getPrice() {
        return 1.5;
    }
 
    @Override
    public String getDescription() {
        return descripotion;
    }
} 