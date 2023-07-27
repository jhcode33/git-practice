package com.jeonghui.exam.machine;

import com.jeonghui.exam.material.DrinkMaterial;
import com.jeonghui.exam.product.Latte;
import com.jeonghui.exam.product.Product;

public class LatteMachine implements Machine{
	
	private DrinkMaterial material;

	public void setMaterial(DrinkMaterial material) {
		this.material = material;
	}
	
	private LatteMachine() {};
	public static LatteMachine latteMachine;
	public static LatteMachine getInstance() {
		if (latteMachine == null) latteMachine = new LatteMachine();
		return latteMachine;
	}

	@Override
	public Product makeDrink() {
		System.out.println(material.getIce() + "을 추가합니다.");
		System.out.println(material.getAddMaterial() + "을 추가합니다.");
		System.out.println(material.getCoffeeShot() + "을 추가합니다.");
		
		Latte latte = new Latte();
		latte.setMaterial(material);
		return latte;
	}
}
