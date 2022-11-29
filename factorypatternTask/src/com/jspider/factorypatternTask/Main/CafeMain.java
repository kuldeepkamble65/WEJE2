package com.jspider.factorypatternTask.Main;

import java.util.Scanner;

import com.jspider.factorypatternTask.fastfoodname.Burger;
import com.jspider.factorypatternTask.fastfoodname.ColdCofee;
import com.jspider.factorypatternTask.fastfoodname.FrenchFrice;
import com.jspider.factorypatternTask.fastfoodname.Pasta;
import com.jspider.factorypatternTask.fastfoodname.Pizza;
import com.jspider.factorypatternTask.interf.FastFood;

public class CafeMain {
		static boolean loop = true;
		static FastFood fastFood;
		
	public static void main(String[] args) {
		while(loop) {
			
			try {
				foodFactory().orderFood();			
				}
				catch(NullPointerException e) {
					System.out.println("No Ordered Food");
				}
		}
	}
		public static FastFood foodFactory() {
			System.out.println("Select a Fastfood to order: \n"+"1- Pizza\n"+"2- Burger\n"+"3- Frenchfrice\n"+"4- Pasta\n"+"5- ColdCofee\n");
			Scanner sc = new Scanner(System.in);
			int choice =sc.nextInt();
			sc.close();
			
			switch (choice) {
			case 1: {
				fastFood = new Pizza();
				loop = false;
				return fastFood;
			}
			case 2: {
				fastFood = new Burger();
				loop = false;
				return fastFood;
			}
			case 3: {
				fastFood = new FrenchFrice();
				loop = false;
				return fastFood;
			}
			case 4: {
				fastFood = new Pasta();
				loop = false;
				return fastFood;
			}
			case 5: {
				fastFood = new ColdCofee();
				loop = false;
				return fastFood;
			}
			default:
				System.out.println("Invalid Input");
				return fastFood;
		
			}
			
	
	}
	
}
