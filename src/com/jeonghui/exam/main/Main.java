package com.jeonghui.exam.main;

import java.util.Scanner;

import com.jeonghui.exam.barista.Barista;
import com.jeonghui.exam.cafe.CafeFactory;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("음료를 선택하세요. Americano or Latte");
    	System.out.print("선택 : ");
    	String drinkType = sc.nextLine();
    	
        //바리스타 생성 및 주입을 팩토리에서 진행
        Barista barista = CafeFactory.orderMenu(drinkType);
        barista.makeDrink(); 
    }
}
