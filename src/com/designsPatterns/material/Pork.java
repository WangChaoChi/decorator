/**
 * 
 */
/**
 * @author wcc
 *
 */
package com.designsPatterns.material;

import com.designsPatterns.Decorator;
import com.designsPatterns.Ingredient;

/**猪肉包装器
 * @author wcc
 * 具体的猪肉成分，同时也是一个具体的装饰器，因此它继承了Decorator类。
 * 猪肉装饰器装饰可以所有的其他对象，因此通过构造器传入一个Ingredient的实例，
 * 程序中调用了父类的构造方法，主要父类实现了这样的逻辑关系。同样因为方法是具体的成分，
 * 所以getDescription得到了实现，不过由于它是具有装饰功能的成分，
 * 因此它的描述包含了被装饰成分的描述和自身的描述。
 * 价格也是一样的。价格放回的格式被装饰成分与猪肉成分的种价格哦！
------------------------------------------------
 * 从类中面两个方法中我们可以看出，猪肉装饰器的功能得到了增强，
 * 它不仅仅有自己的描述和价格，还包含被装饰成分的描述和价格。
 * 主要是因为被装饰成分是它的成员变量，因此可以任意调用它们的方法，
 * 同时可以增加自己的额外的共同，这样就增强了原来成分的功能。
 */
public class Pork extends Decorator{
	 
    public Pork() {
    }
    public Pork(Ingredient ingredient){
        this.ingredient=ingredient;
    }
    @Override
    public double getPrice() {
        return ingredient.getPrice()+2;
    }
 
    @Override
    public String getDescription() {
        return ingredient.getDescription()+" 牛肉";
    }
}