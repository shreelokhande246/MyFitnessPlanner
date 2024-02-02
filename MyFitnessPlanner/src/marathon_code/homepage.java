package marathon_code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class homepage extends Authentication {
public void home()
{
	System.out.println("__________________________________________");
	System.out.println("                 Main menu               ");
	System.out.println("__________________________________________");
	System.out.println("             ");
	System.out.print("1. Workout");
	System.out.print("   2. Calorie count");
	System.out.print("   3. Diet");
	System.out.println("   4. Back");

	
	try {
	System.out.print(" Enter Choice: ");
	Scanner sc = new Scanner(System.in);
	int choice = sc.nextInt();
	switch(choice)
	{
	    case 1:
	    	workout ref1=new workout();
	        ref1.wk();
	        String un=sc.nextLine();
	        break;
	    case 2:
	       calories ref2 =new calories();
	        ref2.cal();
	        break;

	    case 3:
	       dietplan ref3 = new dietplan();
	       ref3.diet();
	        break;
	        
	    case 4:
		    menu m = new menu();
		    m.menu1();
		        break;

	   
	    default:
	    	 System.out.println("");
	        System.out.println("Invalid choice! Please select again");
	        System.out.println("");
	        home();
	        break;
	} 
	}
	catch(InputMismatchException ie)
	{
		System.out.println("             ");
		System.out.println("Invalid entry! Please try again");
		 System.out.println("");
		home();
}

}
}
