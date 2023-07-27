package com.jeonghui.exam.cafe;

import com.jeonghui.exam.barista.AmericanoBarista;
import com.jeonghui.exam.barista.Barista;
import com.jeonghui.exam.barista.LatteBarista;
import com.jeonghui.exam.machine.AmericanoMachine;
import com.jeonghui.exam.machine.LatteMachine;
import com.jeonghui.exam.machine.Machine;
import com.jeonghui.exam.material.AmericanoMaterial;
import com.jeonghui.exam.material.DrinkMaterial;
import com.jeonghui.exam.material.LatteMaterial;

public class CafeFactory {
	
	public static Barista orderMenu(String drinkType) {
        Barista barista;

        if ("Americano".equals(drinkType)) {
        	//바리스타, 머신, 재료 생성
            barista = new AmericanoBarista();
            Machine machine = AmericanoMachine.getInstance();
            DrinkMaterial material = AmericanoMaterial.getInstance();
            
            //바리스타에게 재료와 머신 주입
            barista.setDrinkMaterial(material);
            barista.setMachine(machine);
         
            return barista;
            
        } else if ("Latte".equals(drinkType)) {
        	//바리스타, 머신, 재료 생성
        	barista = new LatteBarista();
        	Machine machine = LatteMachine.getInstance();
            DrinkMaterial material = LatteMaterial.getInstance();
            
            //바리스타에게 재료와 머신 주입
            barista.setDrinkMaterial(material);
            barista.setMachine(machine);
         
            return barista;
            
        } else {

            throw new IllegalArgumentException("준비되지 않은 메뉴입니다.");
        }
    }
}
