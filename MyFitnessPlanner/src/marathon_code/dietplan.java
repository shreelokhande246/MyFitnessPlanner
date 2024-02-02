package marathon_code;

import java.util.Scanner;
import java.util.*;

public class dietplan{
	String vegetables;
	String fruits;
	String dryfruits;
	String dairyProducts;
	double calories;
	String carbohydrates;
	String protein;
	String fats;
	static boolean vsalad = false,fsalad=false,bld = false,nsalad=false,nbld=false;
	dietplan()
	{
		
	}
	

public void diet()
{

	Scanner sc = new Scanner(System.in);
	
	while(true) {
		System.out.println("________________________________________________");
		System.out.println("                  Diet type                      ");
		System.out.println("________________________________________________");
		System.out.println("");
	System.out.println("Choose your diet type:");
	System.out.println("1. Vegeterian:");
	System.out.println("2. Non-Vegeterian:");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	
	int choice = sc.nextInt();
	switch(choice)
	{
	case 1:
		System.out.println("________________________________________________");
		System.out.println("                  Veg Diet                      ");
		System.out.println("________________________________________________");
		System.out.println("");
	System.out.println("1. Vegetable Salad");
	System.out.println("2. Fruit Salad");
	System.out.println("3. Breakfast+Lunch+Dinner");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	
	
	
		int choice2 = sc.nextInt();
		switch(choice2)
		{
		case 1: vsalad = true;
		Vsalad();
		workout w = new workout();
		w.menubutton();
		break;
		case 2: vsalad=false;fsalad = true;
		Fsalad();
		workout w1 = new workout();
		w1.menubutton();
		break;
		case 3: vsalad=false;fsalad=false;bld= true;
	    bld();
	    workout w2 = new workout();
		w2.menubutton();
		}
		
		break;
	case 2:
		System.out.println("________________________________________________");
		System.out.println("                  Non-Veg Diet                      ");
		System.out.println("________________________________________________");
		System.out.println("");
	System.out.println("1. Non-Veg Salad");
	System.out.println("2. Lunch+Dinner");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	workout w = new workout();

		int choice3 = sc.nextInt();
		switch(choice3)
		{
		case 1: nsalad=true;
		Nsalad();
		w.menubutton();
		break;
		case 2: nsalad=false;nbld=true;
		Nbld();
		w.menubutton();
		break;
		default: continue;
		
		}
		break;
		
	default: continue;
		
	
	}
	
	
	
	}
}

dietplan(String vegetables,double calories,String carbohydrates,
		String protein,String fats)
{
	this.vegetables = vegetables;
	this.calories = calories;
	this.carbohydrates = carbohydrates;
	this.protein = protein;
	this.fats = fats;
}
dietplan(String fruits,int calories,String carbohydrates,
		String protein,String fats)
{
	this.fruits = fruits;
	this.calories = calories;
	this.carbohydrates = carbohydrates;
	this.protein = protein;
	this.fats = fats;
}



public String toString()
{
	if(vsalad)
	{
		System.out.println("________________________________________________");
		System.out.println("");
		System.out.println("Vegetables: "+vegetables);
		System.out.println("");
		System.out.println("Calories: "+calories);
		System.out.println("");
		System.out.println("Carbohydrates: "+carbohydrates);
		System.out.println("");
		System.out.println("Fats: "+fats);
		System.out.println("");
		System.out.println("Protein: "+protein);
		System.out.println("");
		System.out.println("________________________________________________");
	}
	else if(fsalad)
	{
		System.out.println("________________________________________________");
		System.out.println("");
		System.out.println("Fruits: "+fruits);
		System.out.println("");
		System.out.println("Calories: "+calories);
		System.out.println("");
		System.out.println("Carbohydrates: "+carbohydrates);
		System.out.println("");
		System.out.println("Fats: "+fats);
		System.out.println("");
		System.out.println("Protein: "+protein);
		System.out.println("");
		System.out.println("________________________________________________");
	}
	else if(bld)
	{
		System.out.println("________________________________________________");
		System.out.println("");
		System.out.println("Dish: "+fruits);
		System.out.println("");
		System.out.println("Calories: "+calories);
		System.out.println("");
		System.out.println("Carbohydrates: "+carbohydrates);
		System.out.println("");
		System.out.println("Fats: "+fats);
		System.out.println("");
		System.out.println("Protein: "+protein);
		System.out.println("");
		System.out.println("________________________________________________");
		
		
	}
	else if(nsalad)
	{
		System.out.println("________________________________________________");
		System.out.println("");
		System.out.println("Salad: "+fruits);
		System.out.println("");
		System.out.println("Calories: "+calories);
		System.out.println("");
		System.out.println("Carbohydrates: "+carbohydrates);
		System.out.println("");
		System.out.println("Fats: "+fats);
		System.out.println("");
		System.out.println("Protein: "+protein);
		System.out.println("");
		System.out.println("________________________________________________");
	}
	else if(nbld)
	{
		System.out.println("________________________________________________");
		System.out.println("");
		System.out.println("Dish: "+fruits);
		System.out.println("");
		System.out.println("Calories: "+calories);
		System.out.println("");
		System.out.println("Carbohydrates: "+carbohydrates);
		System.out.println("");
		System.out.println("Fats: "+fats);
		System.out.println("");
		System.out.println("Protein: "+protein);
		System.out.println("");
		System.out.println("________________________________________________");
	}
	return "";
	
}




public void Vsalad()
{
	
	System.out.println("________________________________________________");
	System.out.println("                  Veg Salad                      ");
	System.out.println("________________________________________________");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	System.out.println("");
	
	dietplan d = new dietplan("Chickpea Salad",300.0,"50g","6g","15g");
	System.out.println(d);
	dietplan d1 = new dietplan("Cucumber and Tomato Salad",80.0,"16g","2g","3g");
	System.out.println(d1);
	dietplan d2 = new dietplan("Sprouted Moong Bean Salad",250.0,"45g","1g","12g");
	System.out.println(d2);
	dietplan d3 = new dietplan("Paneer (Cottage Cheese) Salad",250.0,"10g","20g","12g");
	System.out.println(d3);
	dietplan d4 = new dietplan("Spinach and Chickpea Salad",280.0,"40g","10g","14g");
	System.out.println(d4);
	dietplan d5 = new dietplan("Mint and Coriander Chutney Salad",100.0,"15g","4g","3g");
	System.out.println(d5);
	dietplan d6 = new dietplan("Beetroot and Carrot Salad",120.0,"26g","1g","2g");
	System.out.println(d6);
	
	dietplan d7 = new dietplan("Avocado Salad",350.0,"16g","30g","5g");
	System.out.println(d7);
	
}

public void Fsalad()
{
	System.out.println("________________________________________________");
	System.out.println("                  Fruit Salad                      ");
	System.out.println("________________________________________________");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	System.out.println("");
	
	dietplan d = new dietplan("Mixed Fruit Salad",100,"25g","0g","1g");
	System.out.println(d);
	dietplan d1 = new dietplan("Watermelon and Mint Salad",60,"15g","0g","1g");
	System.out.println(d1);
	dietplan d2 = new dietplan("Papaya and Pineapple Salad",80,"20g","0g","1g");
	System.out.println(d2);
	dietplan d3 = new dietplan("Banana and Strawberry Salad",120,"30g","1g","2g");
	System.out.println(d3);
	dietplan d4 = new dietplan("Guava and Pomegranate Salad",110,"25g","1g","2g");
	System.out.println(d4);
	
}
public void bld()
{
	System.out.println("________________________________________________");
	System.out.println("              For Lunch and Dinner               ");
	System.out.println("________________________________________________");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	System.out.println("");
	
	dietplan d = new dietplan("Masoor Dal with Roti",320,"55g","7g","12g");
	System.out.println(d);
	dietplan d1 = new dietplan("Vegetable Korma with Paratha",400,"45g","18g","15g");
	System.out.println(d1);
	dietplan d2 = new dietplan("Chana Masala with Roti ",350,"55g","10g","15g");
	System.out.println(d2);
	dietplan d3 = new dietplan("Methi Thepla with Yogurt:",300,"30g","1g","10g");
	System.out.println(d3);
	dietplan d4 = new dietplan("Spinach and Chickpea Curry with Brown Rice:",400,"60g","10g","15g");
	System.out.println(d4);
}


public void Nsalad()
{
	System.out.println("________________________________________________");
	System.out.println("                 Non Veg Salad               ");
	System.out.println("________________________________________________");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	System.out.println("");
	
	dietplan d = new dietplan("Chicken Caesar Salad",300,"10g","15g","25g");
	System.out.println(d);
	dietplan d1 = new dietplan("Tandoori Chicken Salad:",350,"15g","18g","30g");
	System.out.println(d1);
	dietplan d2 = new dietplan("Mint and Lemon Salmon Salad",280,"10g","15g","25g");
	System.out.println(d2);
	dietplan d3 = new dietplan("Prawn Salad",320,"40g","12g","20g");
	System.out.println(d3);
	dietplan d4 = new dietplan("Tuna Salad with Chickpeas",300,"20g","12g","25g");
	System.out.println(d4);
}
public void Nbld()
{
	System.out.println("________________________________________________");
	System.out.println("                For Lunch & Dinner               ");
	System.out.println("________________________________________________");
	System.out.println("");
	System.out.println("---------------------------------------------------");
	System.out.println("");
	
	dietplan d = new dietplan("Grilled Chicken Breast with Steamed Vegetables",300,"10g","15g","25g");
	System.out.println(d);
	dietplan d1 = new dietplan("Tandoori Chicken with Cucumber Raita",350,"15g","18g","30g");
	System.out.println(d1);
	dietplan d2 = new dietplan("Lemon and Herb Marinated Grilled Shrimp",280,"10g","15g","25g");
	System.out.println(d2);
	dietplan d3 = new dietplan("Egg Curry with Mixed Vegetables:",320,"40g","12g","20g");
	System.out.println(d3);
	dietplan d4 = new dietplan("Mutton Stew with Brown Rice:",300,"20g","12g","25g");
	System.out.println(d4);
}
}
