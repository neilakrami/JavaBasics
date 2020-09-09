package com.syntax.class28;
/*Create Registration Class in which you would have variables as email, 
 * userName and password that have an access scope only within its own class.
 *  After creating an object of the class user should be able to call methods 
 *  and in each method separately pass values to set users email, username and password. 
 * 
 * Requirements: 

	1	Valid email consider to be only yahoo
	1	Valid userName and password cannot be empty and should be 
		of length larger than 6 characters. 
		Also valid password cannot contain userName.
 */
public class HW_Task_4_Registration {

	private String email, userName, password;
	
	static String mail = "yahoo";
	
	
	public void  setUserName(String username) {//set username
		if(!userName.isEmpty() && userName.length() > 6)
			
		this.userName = username;
	}
	
	public String getUserName() {//get username
		
		return userName;
	}
	
	
	
	public void setEmail(String email) {
		if(email.contains(mail))// check if it is contains "yahoo";
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	
	
	public void setPassword(String password) {
		if(!password.isEmpty() && password.length() > 6 && !password.contains(userName))
		this.password = password;
	}
	public  String getPassword() {
		return password;
	}
}
