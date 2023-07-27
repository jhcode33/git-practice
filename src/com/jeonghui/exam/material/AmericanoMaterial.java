package com.jeonghui.exam.material;

public class AmericanoMaterial implements DrinkMaterial {
	
	private String water = "물";
	private String ice = "얼음";
	private String coffeeShot = "커피샷";
	
	private AmericanoMaterial() {};
	public static AmericanoMaterial americanoMaterial;
	public static AmericanoMaterial getInstance() {
		if (americanoMaterial == null) americanoMaterial = new AmericanoMaterial();
		return americanoMaterial;
	}
	
	@Override
	public String getAddMaterial() {
		return water;
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
