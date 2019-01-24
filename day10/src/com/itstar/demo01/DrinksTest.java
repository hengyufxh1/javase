package com.itstar.demo01;

public class DrinksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ñ©±Ì ¿ÉÀÖ ÂÌ²è
		
		Drinks drink = new Drinks();
		drink.brand ="Ñ©±Ì";
		drink.count=20;
		drink.setPrice(2.5);
		drink.size=250.0;
		
		Drinks drink2 = new Drinks();
		drink2.brand ="¿ÉÀÖ";
		drink2.count=10;
		drink2.setPrice(3.0);
		drink2.size=300.0;
		
		Drinks drink3 = new Drinks();
		drink3.brand ="ÂÌ²è";
		drink3.count=15;
		drink3.setPrice(3.5);
		drink3.size=250.0;
	}

}
