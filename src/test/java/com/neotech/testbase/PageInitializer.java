package com.neotech.testbase;

import com.neotech.pages.AddDisciplinaryCasePageElements;
import com.neotech.pages.AddEmployeePageElements;
import com.neotech.pages.ContactDetailsPageElements;
import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.DependentsPageElements;
import com.neotech.pages.DisciplinaryCasePageElements;
import com.neotech.pages.EmergencyContactsPageElements;
import com.neotech.pages.EmployeeListPageElements;
import com.neotech.pages.ImmigrationPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.MembershipsPageElements;
import com.neotech.pages.PersonalDetailsPageElements;
import com.neotech.pages.QualificationsPageElements;
import com.neotech.pages.ReportToPageElements;
import com.neotech.pages.SocialMediaDetailsPageElements;
import com.neotech.pages.WorkWeekPageElements;

public class PageInitializer extends BaseClass{
	
	public static AddDisciplinaryCasePageElements addDisciplinaryPage;
	public static AddEmployeePageElements addEmployeePage;
	public static ContactDetailsPageElements contactDetailsPage;
	public static DashboardPageElements dashboardPage;
	public static DependentsPageElements dependentsPage;
	public static DisciplinaryCasePageElements disciplinaryPage;
	public static EmergencyContactsPageElements emergencyContactsPage;
	public static EmployeeListPageElements employeeListPage;
	public static ImmigrationPageElements immigrationPage;
	public static LoginPageElements loginPage;
	public static MembershipsPageElements membershipPage;
	public static PersonalDetailsPageElements personalDetailsPage;
	public static QualificationsPageElements qualificationsPage;
	public static ReportToPageElements reportToPage;
	public static SocialMediaDetailsPageElements socialMediaDetailsPage;
	public static WorkWeekPageElements workWeekPage;
	
	
	public static void initialize() {
		
		
		addDisciplinaryPage = new AddDisciplinaryCasePageElements();
		addEmployeePage = new AddEmployeePageElements();
		contactDetailsPage = new ContactDetailsPageElements();
		dashboardPage = new DashboardPageElements();
		dependentsPage = new DependentsPageElements();
		disciplinaryPage = new DisciplinaryCasePageElements();
		emergencyContactsPage = new EmergencyContactsPageElements();
		employeeListPage = new EmployeeListPageElements();
		immigrationPage = new ImmigrationPageElements();
		loginPage = new LoginPageElements();
		membershipPage = new MembershipsPageElements();
		personalDetailsPage = new PersonalDetailsPageElements();
		qualificationsPage = new QualificationsPageElements();
		reportToPage = new ReportToPageElements();
		socialMediaDetailsPage = new SocialMediaDetailsPageElements();
		workWeekPage = new WorkWeekPageElements();
		
		
		
		
	}
	
	

}
