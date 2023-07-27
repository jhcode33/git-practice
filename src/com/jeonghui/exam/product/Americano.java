package com.jeonghui.exam.product;

import com.jeonghui.exam.material.DrinkMaterial;

public class Americano implements Product {
	
	private DrinkMaterial material;
	
	public void setMaterial(DrinkMaterial material) {
		this.material = material;
	}
	@Override
	public void serveProduct() {
		System.out.println(
				material.getIce() + "과 " +
				material.getCoffeeShot() + "과 " +
				material.getAddMaterial() + "을 추가한 "
			    + "아메리카노가 완성되었습니다.");
	}
}
