package marathon_code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class menu extends Authentication{
	public void menu1() {
	Scanner sc = new Scanner(System.in);
	System.out.println("__________________________________________");
	System.out.println("       	     Sign-up/Login Page 	     		  ");
	System.out.println("__________________________________________");
System.out.println("             ");
System.out.print("1.  Sign-Up");
System.out.print("   2. Login");
System.out.println("             ");
try {
System.out.print("  Enter Choice: ");
System.out.println("             ");
Scanner sc1 = new Scanner(System.in);
int choice = sc.nextInt();
Authentication a = new Authentication();
switch(choice)
{
    case 1:
    	
        a.signup();
        String un=sc.nextLine();
        break;
    case 2:
    	
        a.login();
        break;


    default:
        System.out.println("Invalid choice");
        menu b = new menu();
        b.menu1();
        break;
} 

}
catch(InputMismatchException ie)
{
	System.out.println("             ");
	System.out.println("Invalid entry! Please try again");
	  System.out.println("");
	menu1();
}
}
}

