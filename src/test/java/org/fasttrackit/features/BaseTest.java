package org.fasttrackit.features;


import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.*;
import org.fasttrackit.utils.EnvConstants;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class BaseTest {

    @Managed(uniqueSession = true)
    public WebDriver driver;

    @Before
    public void maximise(){
        driver.manage().window().maximize();
        driver.get(EnvConstants.BASE_URL);
    }

    @Steps
    public LoginSteps loginSteps;
    @Steps
    public SearchSteps searchSteps;
    @Steps
    public CartSteps cartSteps;
    @Steps
    public HeaderMenuSteps headerMenuSteps;
    @Steps
    public CompareSteps compareSteps;

}
