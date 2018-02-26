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
 *	 青菜的包装器。
 */
public class GreenGrocery extends Decorator{
	 
    public GreenGrocery() {
    }
    public GreenGrocery(Ingredient ingredient){
        this.ingredient=ingredient;
    }
    @Override
    public double getPrice() {
        return ingredient.getPrice()+3.0;
    }
 
    @Override
    public String getDescription() {
        return ingredient.getDescription()+" 青菜";
    }
     
}