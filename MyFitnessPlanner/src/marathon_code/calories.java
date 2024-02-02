package marathon_code;

import java.util.Scanner;

public class calories extends Authentication{
	double calories;
	public void cal()
	{
		
		
		
//		System.out.println("As per your height and weight,your maintenance calories are: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("  ");
		System.out.println("Enter your weight in Kgs");
		weight = sc.nextInt();
		System.out.println("Choose your activity level:");
		System.out.println("  ");
		System.out.println("1. Sedentary(15 mins or less of daily exercise with a desk job)");
		System.out.println("  ");
		System.out.println("2. Lightly Active(1-2 hours of weights and/or cardio per week)");
		System.out.println("  ");
		System.out.println("3. Moderately Active(3-5 hours of weights and/or cardio per week)");
		System.out.println("  ");
		System.out.println("4. Very Active(6-7 hours of weights and/or cardio per week)");
		System.out.println("  ");
		System.out.println("5. Extremely Active(7+ hours of weights and/or cardio per week)");
		System.out.println("  ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:calories = weight*2.205*12;
			System.out.println("Your maintenance calories are " +calories+" calories");
		break;
		
		case 2:
			calories = weight*2.205*13.5;
			System.out.println("Your maintenance calories are " +calories+"calories");
		break;
		case 3:
			calories = weight*2.205*15;
			System.out.println("Your maintenance calories are " +calories+"calories");
		break;
		case 4:
			calories = weight*2.205*16.5;
			System.out.println("Your maintenance calories are " +calories+"calories");
		break;
		case 5:
			calories = weight*2.205*17;
			System.out.println("Your maintenance calories are " +calories+"calories");
		break;
		default:System.out.println("Invalid choice. Please choose between 1 - 5");
		cal();
		break;
		}
		
		System.out.println("");
		   while (true) {
	            System.out.println("Choose your goal:");
	            System.out.println("");
	            System.out.println("1. Weight gain");
	            System.out.println("2. Weight loss");
	            int choice1 = sc.nextInt();

	            switch (choice1) {
	                case 1:
	                	  System.out.println("");
	                    System.out.println("Your surplus calories are " + calories * 1.20);
	                    System.out.println("");
	                    break;
	                case 2:
	                	  System.out.println("");
	                    System.out.println("Your deficit calories are " + (calories - 400));
	                    System.out.println("");
	                    break;
	                default:
	                	  System.out.println("");
	                    System.out.println("Invalid choice. Please enter again.");
	                    System.out.println("");
	                    continue; 
	            }

	            
	            break;
	        }
		   while(true)
		   {
			   System.out.println("");
		   System.out.println("What would you like to do?");
		   System.out.println("");
		   System.out.println("1. Main menu");
		   System.out.println("");
		   System.out.println("2. Logout");
		   System.out.println("");
		   int choice2 = sc.nextInt();
		   switch(choice2)
		   {
		   case 1:
			   homepage h = new homepage();
			   h.home();
			   break;
		   case 2:menu m = new menu();
		   m.menu1();
		   break;
			  
		   default:continue;
				
			   
		   }
		   }
		
		}
	}

