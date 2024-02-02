package marathon_code;

import java.util.ArrayList;
import java.util.Scanner;

public class workout {

	public void wk()
	{
//		userdetails u = new userdetails();
//		u.userdet();
		System.out.println(" ");
		System.out.println("Choose your goal");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Muscle Gain: ");
		System.out.println(" ");
		
		System.out.println("2. Weight Loss: ");
		System.out.println(" ");
		
		System.out.println("3. Back: ");
		System.out.println(" ");
		
		System.out.println("4. Main menu: ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		    case 1:
		    	
		      musclegain();
		       
		        break;
		    case 2:
		    weightloss();
		        break;
		        
		    case 3:
			   //back
		    	homepage h = new homepage();
				h.home();
			        break;
		    case 4:
			  //mainmenu
		    	homepage h1 = new homepage();
				h1.home();
			        break;


		    default:
		        System.out.println("Invalid choice");
		        menu b = new menu();
		        b.menu1();
		        break;
		} 

	}
	
	public void musclegain()
	{
		System.out.println(" ");
		System.out.println("Choose your workout level");
		System.out.println(" ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Begineer level : ");
		System.out.println(" ");
		
		System.out.println("2. Intermediate level: ");
		System.out.println(" ");
		
		System.out.println("3. Advanced level: ");
		System.out.println(" ");
		
		System.out.println("4. Back: ");
		System.out.println(" ");
		
		System.out.println("5. Main Menu: ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		    case 1:
		    	
		     beginner();
		     menubutton();
		       
		        break;
		    case 2:
		     intermediate();
		     menubutton();
		        break;
		        
		    case 3:
			  advanced();
			  menubutton();
			        break;
			        
		    case 4:wk();
				 
				        break;

		    case 5:homepage h = new homepage();
			h.home();
			 
			        break;


		    default:
		        System.out.println("Invalid choice");
		      musclegain();
		        break;
		} 

		
	}
	public void beginner()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Variation 1 : ");
		System.out.println(" ");
		
		System.out.println("2. Variation 2 : ");
		System.out.println(" ");
		
		System.out.println("3. Variation 3 : ");
		System.out.println(" ");
		
		System.out.println("4. Variation 4 : ");
		System.out.println(" ");
		
		
		System.out.println("5. Back : ");
		System.out.println(" ");
		
		System.out.println("6. Main menu : ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		begvariation beg  = new begvariation();
		switch(choice)
		{
		    case 1:
		    	beg.variation1();
		       
		        break;
		    case 2:
		    	beg.variation2();
		        break;
		        
		    case 3:
		    	beg.variation3();
			        break;
			        
		    case 4:
		    	beg.variation4();
				        break;

		    case 5:
		    	 musclegain();
			        break;

		    case 6:
		    	homepage h = new homepage();
				h.home();
				        break;

		    default:
		        System.out.println("Invalid choice");
		      beginner();
		        break;
		} 
	}
	public void intermediate()
	{
		while(true)
		{
			System.out.println(" ");
			  System.out.println("___________________________________________________________");
		System.out.println("Intermediate level - Single Muscle Workouts : ");
		System.out.println(" ");
		System.out.println("Follow single muscle workout for each day of a week");
		  System.out.println("");
		System.out.println("Eg: - Chest on Monday, Shoulder on Tuesday,......Legs on Saturday");
		  System.out.println("___________________________________________________________");
		System.out.println(" ");
		 
		  System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Chest : ");
		System.out.println(" ");
		
		System.out.println("2. Shoulder : ");
		System.out.println(" ");
		
		System.out.println("3. Triceps : ");
		System.out.println(" ");
		
		System.out.println("4. Back : ");
		System.out.println(" ");
		
		System.out.println("5. Biceps : ");
		System.out.println(" ");
		
		System.out.println("6. Legs : ");
		System.out.println(" ");
		
		System.out.println("7. Back : ");
		System.out.println(" ");
		
		System.out.println("8. Main menu : ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			chest();
			break;
		case 2:shoulder();
		break;
		
		case 3: triceps();
		break;
		case 4: back();
		break;
		case 5: biceps();
		break;
		case 6: legs();
		break;
		case 7:wk();
		break;
		case 8:homepage h = new homepage();
		h.home();
			default:
				System.out.println("Invalid choice");
				intermediate();
				;
		}
	}
	}
	
	
	
	public void advanced()
	{
		while(true)
		{
			System.out.println(" ");
			  System.out.println("___________________________________________________________");
		System.out.println("Choose Workout Variation : ");
		System.out.println(" ");
		  System.out.println("___________________________________________________________");
		System.out.println(" ");
		 
		  System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Advanced Workout-1 : ");
		System.out.println(" ");
		
		System.out.println("2. Advanced Workout-2 : ");
		System.out.println(" ");
		
		System.out.println("3. Back : ");
		System.out.println(" ");
		
		System.out.println("4. Main menu : ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			advanced1();
			break;
		case 2:advanced2();
		break;
		case 3:musclegain();
		break;
		case 4:homepage h = new homepage();
		h.home();
			default:
				System.out.println("Invalid choice");
				advanced();
				break;
		}
	}
	}
		
	public void advancedL()
	{
		while(true)
		{
			System.out.println(" ");
			  System.out.println("___________________________________________________________");
		System.out.println("Choose Workout Variation : ");
		System.out.println(" ");
		  System.out.println("___________________________________________________________");
		System.out.println(" ");
		 
		  System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Advanced Workout-1 : ");
		System.out.println(" ");
		
		System.out.println("2. Advanced Workout-2 : ");
		System.out.println(" ");
		
		System.out.println("3. Back : ");
		System.out.println(" ");
		
		System.out.println("4. Main menu : ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			advanced1();
			break;
		case 2:advanced2();
		break;
		case 3:musclegain();
		break;
		case 4:homepage h = new homepage();
		h.home();
			default:
				System.out.println("Invalid choice");
				advanced();
				
		}
	}
	}
		

	

	
	public void advanced1()
	{
		while(true)
		{
			System.out.println(" ");
			  System.out.println("___________________________________________________________");
		System.out.println("Advanced level - Double Muscle Workouts : ");
		System.out.println(" ");
		System.out.println("Follow double muscle workout for each day of a week");
		System.out.println(" ");
		System.out.println("Eg: - Chest,Abs on Monday, Shoulder,Triceps on Tuesday,......Legs on Saturday");
		  System.out.println("___________________________________________________________");
		System.out.println(" ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Chest and Abs : ");
		System.out.println(" ");
		
		System.out.println("2. Shoulder and Triceps : ");
		System.out.println(" ");
		
		System.out.println("3. Back And Biceps : ");
		System.out.println(" ");
		
		System.out.println("4. Legs : ");
		System.out.println(" ");
		
		System.out.println("5. Back : ");
		System.out.println(" ");
		
		System.out.println("6. Main menu : ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:  System.out.println("___________________________________________________________");
			System.out.println("Hit 3 exercises of each muscle mentioned below with sets and reps");
			  System.out.println("___________________________________________________________");
			chest();
			abs();
			
			break;
		case 2:
			  System.out.println("___________________________________________________________");
			System.out.println("Hit 3 exercises of each muscle mentioned below with sets and reps");
			  System.out.println("___________________________________________________________");
			shoulder();
				triceps();
		break;
		
		case 3:  System.out.println("___________________________________________________________");
		System.out.println("Hit 3 exercises of each muscle mentioned below with sets and reps");
		  System.out.println("___________________________________________________________");
			back();
				biceps();
		break;
		case 4: legs();
		break;
		case 5:wk();
		break;
		case 6:homepage h = new homepage();
		h.home();
		break;
			default:advanced();
		}
	}
	}
	
	public void advanced2()
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("");
			System.out.println("1. Chest-Shoulder-Triceps");
			System.out.println("");
			
				System.out.println("2. Back-Biceps");
				System.out.println("");
				System.out.println("3. Legs-Abs");
				System.out.println("");
		
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1: CST();
			break;
		case 2:BB();
			
			
		break;
		case 3:LA();
			
			
			
		break;
		default:advanced2();
		}
		       
		       
		    }
	
	public void CST()
	{   System.out.println("_____________________");
		System.out.println("Chest-Shoulder-Triceps");
		System.out.println("_____________________");

		 String[][] workouts = {
		            {"Push-ups", "3", "15"},
		            {"Flat Bench Dumbbell Press", "3", "15"},
		            {"Incline Bench Dumbbell Press", "3", "15"},
		            {"OverHead shoulder dumbbell press", "3", "15"},
		            {"Dumbbell Front rows", "3", "15"},
		            {"Dumbbell Lateral raise", "3", "15"},
		            {"Overhead Triceps pushdown", "3", "15"},
		            {"Triceps pushdown with rope", "3", "15"},
		            {"Triceps pushdown with rod", "3", "15"}
		        };

		      
		        for (String[] workout : workouts) {
		        	System.out.println("---------------------------------");
		        	System.out.println("");
		            System.out.println("Workout Name: " + workout[0]);
		            System.out.println("");
		            System.out.println("Sets: " + workout[1]);
		            System.out.println("");
		            System.out.println("Reps: " + workout[2]);
		            System.out.println("");
		            System.out.println("---------------------------------");
		            
		        }
	}
	public void BB()
	{
		System.out.println("_________________");
		System.out.println("   Back-Biceps   ");
		System.out.println("_________________");

		 String[][] workouts = {
		            {"Lat Pull Down", "3", "15"},
		            {"Bent over rows on the Barbell", "3", "15"},
		            {"Deadlift with 2x of body weight", "3", "15"},
		            {"Standing Bicep curls", "3", "15"},
		            {"Preacher Curl", "3", "15"},
		            {"Hammer Curls", "3", "15"},
		           
		        };

		      
		        for (String[] workout : workouts) {
		        	System.out.println("---------------------------------");
		        	System.out.println("");
		            System.out.println("Workout Name: " + workout[0]);
		            System.out.println("");
		            System.out.println("Sets: " + workout[1]);
		            System.out.println("");
		            System.out.println("Reps: " + workout[2]);
		            System.out.println("");
		            System.out.println("---------------------------------");
		            
		        }
	}
	public void LA()
	{
		    System.out.println("__________");
			System.out.println("Legs-Abs");
			System.out.println("__________");

			 String[][] workouts = {
			            {"Squats", "3", "15"},
			            {"Squats with barbell", "3", "15"},
			            {"Legs Extension", "3", "15"},
			            {"Leg Press", "3", "15"},
			            {"Leg curls for Hamstring", "3", "15"},
			            {"Hanging leg raises", "3", "15"},
			            {"Crunches", "3", "15"},
			            {"Side Plank each side", "3", "15"},
			            {"Plank", "3", "15"}
			        };

			      
			        for (String[] workout : workouts) {
			        	System.out.println("---------------------------------");
			        	System.out.println("");
			            System.out.println("Workout Name: " + workout[0]);
			            System.out.println("");
			            System.out.println("Sets: " + workout[1]);
			            System.out.println("");
			            System.out.println("Reps: " + workout[2]);
			            System.out.println("");
			            System.out.println("---------------------------------");
			            
			        }
	}
	public void weightloss()
	{
		System.out.println(" ");
		System.out.println("Choose your workout level");
		System.out.println(" ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Begineer level : ");
		System.out.println(" ");
		
		System.out.println("2. Intermediate level: ");
		System.out.println(" ");
		
		System.out.println("3. Advanced level: ");
		System.out.println(" ");
		
		System.out.println("4. Back: ");
		System.out.println(" ");
		
		System.out.println("5. Main Menu: ");
		System.out.println(" ");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
		    case 1:
		    	 System.out.println("___________________________________________________________");
		    	 System.out.println("");
			     System.out.println("Cardio after workout:");
			     System.out.println("");
			     System.out.println("Treadmill for 10 mins at normal brisk walking speed");
			     System.out.println("");
			     System.out.println("Cycling for 10 mins");
			     System.out.println("");
			     System.out.println("___________________________________________________________");
		     beginner();
		    
		     menubutton();
		     break;		    
		     
		    case 2:
		    	 System.out.println("___________________________________________________________");
		    	System.out.println("");
			     System.out.println("Cardio after workout:");
			     System.out.println("");
			     System.out.println("Treadmill for 15 mins at running speed");
			     System.out.println("");
			     System.out.println("Cycling for 15 mins");
			     System.out.println("");
			     System.out.println("___________________________________________________________");
		     intermediate();
		     
		     menubutton();
		     
		        break;
		        
		    case 3:
		    	 System.out.println("___________________________________________________________");
		    	  System.out.println("");
				     System.out.println("Cardio after workout(Choose only 2):");
				     System.out.println("");
				     System.out.println("Treadmill for 25 mins at running speed");
				     System.out.println("");
				     System.out.println("Cycling for 25 mins");
				     System.out.println("");
				     System.out.println("Zumba for 20 mins");
				     System.out.println("");
				     System.out.println("Rope Skipping for 15 mins");
				     System.out.println("");
				     System.out.println("Jumping Jacks for 20 mins(3 breaks of 2-3 minutes between the sets)");
				     System.out.println("");
				     System.out.println("___________________________________________________________");
			  advanced1();
			
			     menubutton();
			        break;
			        
		    case 4:
				  //back
		    	wk();
				        break;

		    case 5:
		    	homepage h = new homepage();
				h.home();
			        break;


		    default:
		        System.out.println("Invalid choice");
		       weightloss();
		        break;
		} 
	}
	
	public void menubutton()
	{
		 while (true) {
	            System.out.println("                           ");
	            System.out.print("1. Press 1 to go back to --- Main menu");
	            System.out.println("                           ");
	            Scanner sc = new Scanner(System.in);
	            int mm = sc.nextInt();
	            switch(mm)
	            {
	            case 1: homepage h = new homepage();
				h.home();
				default: System.out.println("Please try again");
				continue;
	            }
	     
	       
	        
	     }
	}
	public void chest()
	{
		ArrayList <interworkout> inter = new ArrayList<>();
		interworkout i = new interworkout();
		interworkout i1 = new interworkout();
		interworkout i2 = new interworkout();
		interworkout i3 = new interworkout();
		interworkout i4 = new interworkout();
		i.setworkoutname("Push-ups");
		i.setsets("3");
		i.setreps("15");
		i1.setworkoutname("Flat Bench Dumbbell Press");
		i1.setsets("3");
		i1.setreps("15");
		i2.setworkoutname("Incline Bench Dumbbell Press");
		i2.setsets("3");
		i2.setreps("15");
		i3.setworkoutname("Decline Bench Dumbbell Press");
		i3.setsets("3");
		i3.setreps("15");
		i4.setworkoutname("Sitted Flies");
		i4.setsets("3");
		i4.setreps("15");
		inter.add(i);
		inter.add(i1);
		inter.add(i2);
		inter.add(i3);
		inter.add(i4);
		
		for(interworkout interworkout: inter)
		{
			System.out.println("");
			System.out.println("Workout Name: "+interworkout.getworkoutname());
			System.out.println("");
			System.out.println("Sets: "+interworkout.getsets());
			System.out.println("");
			System.out.println("Reps: "+interworkout.getreps());
			System.out.println("");
		}
	}
	public void abs()
	{
		ArrayList <interworkout> inter = new ArrayList<>();
		interworkout i = new interworkout();
		interworkout i1 = new interworkout();
		interworkout i2 = new interworkout();
		interworkout i3 = new interworkout();
		interworkout i4 = new interworkout();
		interworkout i5 = new interworkout();
		i.setworkoutname("Hanging leg raises");
		i.setsets("3");
		i.setreps("15");
		i1.setworkoutname("Sleeping leg raises");
		i1.setsets("3");
		i1.setreps("15");
		i2.setworkoutname("Crunches");
		i2.setsets("3");
		i2.setreps("15");
		i3.setworkoutname("Legs scissors");
		i3.setsets("3");
		i3.setreps("15");
		i4.setworkoutname("Side Plank each side");
		i4.setsets("3");
		i4.setreps("15");
		i5.setworkoutname("Plank");
		i5.setsets("3");
		i5.setreps("15");
		inter.add(i);
		inter.add(i1);
		inter.add(i2);
		inter.add(i3);
		inter.add(i4);
		inter.add(i5);
		
		
		for(interworkout interworkout: inter)
		{
			System.out.println("");
			System.out.println("Workout Name: "+interworkout.getworkoutname());
			System.out.println("");
			System.out.println("Sets: "+interworkout.getsets());
			System.out.println("");
			System.out.println("Reps: "+interworkout.getreps());
			System.out.println("");
		}
	}
	
	public void shoulder()
	{
		ArrayList <interworkout> inter = new ArrayList<>();
		interworkout i = new interworkout();
		interworkout i1 = new interworkout();
		interworkout i2 = new interworkout();
		interworkout i3 = new interworkout();
		interworkout i4 = new interworkout();
		i.setworkoutname("OverHead shoulder dumbbell press");
		i.setsets("3");
		i.setreps("15");
		i1.setworkoutname("Dumbbell Front rows");
		i1.setsets("3");
		i1.setreps("15");
		i2.setworkoutname("Dumbbell Lateral raise");
		i2.setsets("3");
		i2.setreps("15");
		i3.setworkoutname("Reverse Flies");
		i3.setsets("3");
		i3.setreps("15");
		i4.setworkoutname("Shrugs");
		i4.setsets("3");
		i4.setreps("15");
		inter.add(i);
		inter.add(i1);
		inter.add(i2);
		inter.add(i3);
		inter.add(i4);
		
		for(interworkout interworkout: inter)
		{
			System.out.println("");
			System.out.println("Workout Name: "+interworkout.getworkoutname());
			System.out.println("");
			System.out.println("Sets: "+interworkout.getsets());
			System.out.println("");
			System.out.println("Reps: "+interworkout.getreps());
			System.out.println("");
		}
	}
	public void triceps()
	{
		ArrayList <interworkout> inter = new ArrayList<>();
		interworkout i = new interworkout();
		interworkout i1 = new interworkout();
		interworkout i2 = new interworkout();
		interworkout i3 = new interworkout();
		interworkout i4 = new interworkout();
		i.setworkoutname("Overhead Triceps pushdown");
		i.setsets("3");
		i.setreps("15");
		i1.setworkoutname("Triceps pushdown with rope");
		i1.setsets("3");
		i1.setreps("15");
		i2.setworkoutname("Triceps pushdown with rod");
		i2.setsets("3");
		i2.setreps("15");
		i3.setworkoutname("Diamond Pushups on knees");
		i3.setsets("3");
		i3.setreps("15");
		i4.setworkoutname("Reverse Triceps pushdown");
		i4.setsets("3");
		i4.setreps("15");
		inter.add(i);
		inter.add(i1);
		inter.add(i2);
		inter.add(i3);
		inter.add(i4);
		
		for(interworkout interworkout: inter)
		{
			System.out.println("");
			System.out.println("Workout Name: "+interworkout.getworkoutname());
			System.out.println("");
			System.out.println("Sets: "+interworkout.getsets());
			System.out.println("");
			System.out.println("Reps: "+interworkout.getreps());
			System.out.println("");
		}
	}
	public void back()
	{
		ArrayList <interworkout> inter = new ArrayList<>();
		interworkout i = new interworkout();
		interworkout i1 = new interworkout();
		interworkout i2 = new interworkout();
		interworkout i3 = new interworkout();
		interworkout i4 = new interworkout();
		interworkout i5 = new interworkout();

		i.setworkoutname("Pull ups");
		i.setsets("3");
		i.setreps("10");
		i1.setworkoutname("Lat Pull Down");
		i1.setsets("3");
		i1.setreps("15");
		i2.setworkoutname("Bent over rows on the Barbell");
		i2.setsets("3");
		i2.setreps("15");
		i3.setworkoutname("Deadlift with 25% of body weight");
		i3.setsets("3");
		i3.setreps("15");
		i4.setworkoutname("Seated Row");
		i4.setsets("3");
		i4.setreps("15");
		i5.setworkoutname("Dumbbell rows");
		i5.setsets("3");
		i5.setreps("15");
		inter.add(i);
		inter.add(i1);
		inter.add(i2);
		inter.add(i3);
		inter.add(i4);
		inter.add(i5);
		
		for(interworkout interworkout: inter)
		{
			System.out.println("");
			System.out.println("Workout Name: "+interworkout.getworkoutname());
			System.out.println("");
			System.out.println("Sets: "+interworkout.getsets());
			System.out.println("");
			System.out.println("Reps: "+interworkout.getreps());
			System.out.println("");
		}
	}
	public void biceps()
	{
		ArrayList <interworkout> inter = new ArrayList<>();
		interworkout i = new interworkout();
		interworkout i1 = new interworkout();
		interworkout i2 = new interworkout();
		interworkout i3 = new interworkout();
		interworkout i4 = new interworkout();
		i.setworkoutname("Incline Bench Biceps curls on Dumbbells");
		i.setsets("3");
		i.setreps("15");
		i1.setworkoutname("Standing Bicep curls");
		i1.setsets("3");
		i1.setreps("15");
		i2.setworkoutname("Preacher Curl");
		i2.setsets("3");
		i2.setreps("15");
		i3.setworkoutname("Hammer Curls");
		i3.setsets("3");
		i3.setreps("15");
		i4.setworkoutname("Reverse curl on E-Z Barbell");
		i4.setsets("3");
		i4.setreps("15");
		inter.add(i);
		inter.add(i1);
		inter.add(i2);
		inter.add(i3);
		inter.add(i4);
		
		for(interworkout interworkout: inter)
		{
			System.out.println("");
			System.out.println("Workout Name: "+interworkout.getworkoutname());
			System.out.println("");
			System.out.println("Sets: "+interworkout.getsets());
			System.out.println("");
			System.out.println("Reps: "+interworkout.getreps());
			System.out.println("");
		}
	}
	public void legs()
	{
		ArrayList <interworkout> inter = new ArrayList<>();
		interworkout i = new interworkout();
		interworkout i1 = new interworkout();
		interworkout i2 = new interworkout();
		interworkout i3 = new interworkout();
		interworkout i4 = new interworkout();
		interworkout i5 = new interworkout();
		i.setworkoutname("Squats");
		i.setsets("3");
		i.setreps("15");
		i1.setworkoutname("Squats with barbell");
		i1.setsets("3");
		i1.setreps("15");
		i2.setworkoutname("Legs Extension");
		i2.setsets("3");
		i2.setreps("15");
		i3.setworkoutname("Leg Press");
		i3.setsets("3");
		i3.setreps("15");
		i4.setworkoutname("Leg curls for Hamstring");
		i4.setsets("3");
		i4.setreps("15");
		i5.setworkoutname("Calf raises");
		i5.setsets("3");
		i5.setreps("15");
		inter.add(i);
		inter.add(i1);
		inter.add(i2);
		inter.add(i3);
		inter.add(i4);
		inter.add(i5);
		
		for(interworkout interworkout: inter)
		{
			System.out.println("");
			System.out.println("Workout Name: "+interworkout.getworkoutname());
			System.out.println("");
			System.out.println("Sets: "+interworkout.getsets());
			System.out.println("");
			System.out.println("Reps: "+interworkout.getreps());
			System.out.println("");
		}
	}
}
