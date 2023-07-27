package com.jeonghui.exam.machine;

import com.jeonghui.exam.material.DrinkMaterial;
import com.jeonghui.exam.product.Product;

public interface Machine {
	public Product makeDrink();
	public void setMaterial(DrinkMaterial material);
}
