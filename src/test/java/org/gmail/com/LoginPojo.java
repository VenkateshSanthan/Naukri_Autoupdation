package org.gmail.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	WebDriver driver;
	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"login_Layer\"]/div")
	private WebElement loginFrnt;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement txtUesr;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement txtPass;
	@FindBy (xpath="//*[@id=\"root\"]/div[3]/div[2]/div/form/div[6]/button")
	private WebElement loginBtn;
	@FindBy(xpath="//*[@id=\\\"root\\\"]/div/div/span/div/div/div/div[2]/div/div[2]/div[1]/div/div[1]/div[2]/div")
	private WebElement updatePro;
	@FindBy(xpath="(//span[text()='Key Skills'])[2]")
	private WebElement mouseAct;
	@FindBy(xpath="(//span[text()='Edit'])[2]")
	private WebElement editBtn;
	@FindBy(id="resumeHeadlineTxt")
	private WebElement resHdField;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveBtn;
	@FindBy (xpath="//div[text()='My Naukri']")
	private WebElement actMynak;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;

	public WebElement getLoginFrnt() {
		return loginFrnt;
	}

	public WebElement getTxtUesr() {
		return txtUesr;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getUpdatePro() {
		return updatePro;
	}

	public WebElement getMouseAct() {
		return mouseAct;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getResHdField() {
		return resHdField;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getActMynak() {
		return actMynak;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	

}
