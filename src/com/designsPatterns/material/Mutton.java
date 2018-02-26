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
 *	羊肉的包装器
 */
public class Mutton extends Decorator{
	 
    public Mutton() {
    }
    public Mutton(Ingredient ingredient){
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