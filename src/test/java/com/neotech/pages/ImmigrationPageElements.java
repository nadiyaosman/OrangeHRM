package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class ImmigrationPageElements extends CommonMethods {

	// move to the personal details elements page????
	@FindBy(id = "top-menu-trigger")
	public WebElement moreDropdown;

	//////////////////////////////////////////////////////////
	@FindBy(linkText = "Immigration")
	public WebElement immigration;

	@FindBy(xpath = "//div[@class='pim-container']/div/div/a")
	public WebElement addImmigration;

	@FindBy(id = "number")
	public WebElement docNum;

	@FindBy(xpath = "//button[@class='btn']")
	public WebElement issuedByDD;

	// issued date- cal written
	@FindBy(id = "issuedDate")
	public WebElement issuedDateWritten;

	// Formatting for immigration calendar:
	// D, dd M yyyy ex: Wed, 22 May 2024
	// issued date cal box

	// expiry date- cal
	@FindBy(id = "expiryDate")
	public WebElement expiryDateWritten;

	// expiry date -cal button

	// eligible review date- cal
	@FindBy(id = "reviewDate")
	public WebElement reviewDateWritten;

	// expiry date -cal button

	// eligible status- written
	@FindBy(id = "status")
	public WebElement status;

	// comments-- written
	@FindBy(id = "notes")
	public WebElement comments;

	// save button
	@FindBy(id = "modal-save-button")
	public WebElement immigrationSave;

	// cancel button
	@FindBy(xpath = "//button[text()='Cancel']")
	public WebElement immigrationCancel;

	/////////////////////////////////////////////////////////
	// possible errors

	// required feedback
	@FindBy(xpath = "//span[text()='Required']")
	public WebElement requiredPopUp;

	// format error: written
	@FindBy(xpath = "//*[text()='Expected format: D, dd M yyyy']")
	public WebElement formatError;

	public ImmigrationPageElements() {

		PageFactory.initElements(driver, this);
	}

}
