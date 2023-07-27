package com.jeonghui.exam.material;

public class LatteMaterial implements DrinkMaterial {
	
	private String milk = "우유";
	private String ice = "얼음";
	private String coffeeShot = "커피샷";
	
	private LatteMaterial() {};
	public static LatteMaterial latteMaterial;
	public static LatteMaterial getInstance() {
		if (latteMaterial == null) latteMaterial = new LatteMaterial();
		return latteMaterial;
	}
	
	@Override
	public String getAddMaterial() {
		return milk;
	}
	
	@Override
    public String getIce() {
        return ice;
    }

    @Override
    public String getCoffeeShot() {
        return coffeeShot;
    }

}
