package com.orangehrm.seleniumuiframwework.recruitment;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.RecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacanciesPage;
import com.orangehtm.seleniumuiframework.genericutility.BaseClass;

public class CreateVacancyTest extends BaseClass {
// public 
	// WebDriver driver;

	@Test
	public void addVacancy() throws InterruptedException {
		DashBoardPage dsp = new DashBoardPage(driver);
		RecruitmentPage rp = new RecruitmentPage(driver);
		VacanciesPage vp = new VacanciesPage(driver);
		AddVacancyPage addvp = new AddVacancyPage(driver);
		Actions act = new Actions(driver);

		dsp.clickRecuitment();
//vacancies
		rp.clickVacancieslink();
//vacancy link
		vp.clickAddbtn();
//recruitment 
		addvp.setVacancyNameTextField("v_001");
		act.click(addvp.getJobTitle()).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		addvp.setDescriptionTextField("A long description fot the requirement");
		act.sendKeys(addvp.getHiringManagerTextField(), "t").pause(Duration.ofSeconds(4)).keyDown(Keys.DOWN)
				.keyDown(Keys.ENTER).perform();
		addvp.setNoOfPositionsTextField("15");
		addvp.clickSavebtn();

	}
}
