package marathon_code;

import java.util.Scanner;
interface Login
{
	void login();
}
public class Authentication implements Login {
private String fname;
private String lname;
private long contact;
private String username = "admin";
private String password = "admin";
String gender;
String Age;
int weight;
String height;


public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public long getContact() {
	return contact;
}
public void setContact(long contact) {
	this.contact = contact;
}
public String getusername() {
	return username;
}
public void setusername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public boolean isValidUsername(String username) {
    return username.matches("^[\\w!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?0-9a-zA-Z]{6,}$");
}

public boolean isValidPassword(String password) {
    return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\",./<>?]).{8,}$");
}


public void signup()
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first name: ");
	System.out.print(" ");
	setFname(sc.nextLine());
	System.out.print("Enter the last name: ");
	System.out.print(" ");
	setLname(sc.nextLine());
//	System.out.print("Enter the username: ");
//	System.out.print(" ");
//	setusername(sc.nextLine());
//	System.out.print("Enter the Password: ");
//	System.out.print(" ");
//	setPassword(sc.nextLine());
	
	String username;
    do {
    	//(more than 5 characters)
        System.out.print("Enter the username : ");
        username = sc.nextLine();
    } while (!isValidUsername(username));
    setusername(username);
    
    String password;
    do {
    	//(at least 8 characters, 1 special character, 1 uppercase, 1 lowercase, and 1 digit)
        System.out.print("Enter the Password : ");
        password = sc.nextLine();
    } while (!isValidPassword(password));
    setPassword(password);

	login();
}

@Override
public void login()
{
	System.out.println("");
	System.out.println("Please enter the credentials to login");
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter username");
	String email1 = sc.nextLine();
	System.out.println("Enter password");
	String pass = sc.nextLine();
	if (email1.equals(this.username) && pass.equals(this.password))
	{
		System.out.println("Login Successful...!");
	}
	else
	{
		System.out.println("Unsuccessful..! Please try again.");
		login();
	}
	homepage h = new homepage();
	h.home();
	
}




}
