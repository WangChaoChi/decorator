/**
 * 
 */
/**
 * @author wcc
 *
 */
package com.designsPatterns;

import com.designsPatterns.material.Celery;
import com.designsPatterns.material.GreenGrocery;
import com.designsPatterns.material.Mutton;
import com.designsPatterns.material.Pork;

public class DecoratorTest {
    public static void main(String[] args) {
        Ingredient ingredient=new Pork(new Celery(new Bread("牛奶面包")));
        ingredient.printDescription();
        
        Ingredient compound = new Mutton(new Celery(new Bread("Master24's Bread")));              

        compound.printDescription();

       

        compound = new Celery(new GreenGrocery(new Bread("Bread with milk")));    

        compound.printDescription();

       

        compound = new Mutton(new Pork(new Bread("Bread with cheese")));

        compound.printDescription();
    }
}