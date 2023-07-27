package com.jeonghui.exam.barista;

import com.jeonghui.exam.machine.Machine;
import com.jeonghui.exam.material.DrinkMaterial;

public interface Barista {
	public void makeDrink();
	public void setMachine(Machine machine);
	public void setDrinkMaterial(DrinkMaterial material);
}
