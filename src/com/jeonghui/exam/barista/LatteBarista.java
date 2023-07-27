package com.jeonghui.exam.barista;

import com.jeonghui.exam.machine.Machine;
import com.jeonghui.exam.material.DrinkMaterial;
import com.jeonghui.exam.product.Product;

public class LatteBarista implements Barista {
	
	private Machine machine;
	private DrinkMaterial material;
	
	@Override
	public void setMachine(Machine machine) {
		this.machine = machine;
	}
	
	@Override
	public void setDrinkMaterial(DrinkMaterial material) {
		this.material = material;
	}
	
	@Override
	public void makeDrink() {
		System.out.println("라떼를 제조를 시작합니다.");
		machine.setMaterial(material);
		
		Product product = machine.makeDrink();
		product.serveProduct();
	}
}
