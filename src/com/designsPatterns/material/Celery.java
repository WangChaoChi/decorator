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

/**
 * @author wcc
 *	香菜包装器
 */
public class Celery extends Decorator{
	 
    public Celery() {
    }
    public Celery(Ingredient ingredient){
        this.ingredient=ingredient;
    }
    @Override
    public double getPrice() {
        return ingredient.getPrice()+3.0;
    }
 
    @Override
    public String getDescription() {
        return ingredient.getDescription()+" 香菜";
    }
     
}