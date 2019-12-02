package com.Pages;

import org.openqa.selenium.WebDriver;

public class AddNewUser extends MasterPage {

	String firstNameField = "Name:fname";
	String lastNameField = "Name:lname";
	String emailField = "Name:email";
	String phoneNumber = "Name:phone";
	String passwordField = "cssSelector:#password";
	String cnfPassword = "Xpath://input[@name='confirm_password']";	
	String chkBox = "ID:register_updatecheck";
	String submitButton = "Xpath://input[@name='confirm_password']";
	
	
	
	public AddNewUser(WebDriver driver) {
		super(driver);
	}	
	public void newUserRegistration() {
		typeOnElement(firstNameField, "Khosruz");
		typeOnElement(lastNameField, "zaman");
		typeOnElement(emailField, "khosru.123@gmail.com");
		typeOnElement(phoneNumber, "2136549872");
		typeOnElement(passwordField, "1234abc");
		typeOnElement(cnfPassword, "1234abcd");
		clickElement(chkBox);
		clickElement(submitButton);
		//	public void completeREgistraionWith(String email, String uname, String fname, String lname ) {
	}
	
	public void cloeseBrowser() {
		closeBrowser();
	}
	
}

