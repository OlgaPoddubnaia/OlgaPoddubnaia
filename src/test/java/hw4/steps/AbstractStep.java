package hw4.steps;

import hw4.pages.*;
import org.openqa.selenium.WebDriver;

public abstract class AbstractStep extends ConfProperties {

    protected WebDriver driver;

    protected HomePagePO homePagePO;
    protected LoginPagePO loginPage;
    protected HeaderMenuOfHomePageAfterLoginPO headerMenuOfHomePageAfterLoginPO;
    protected ImagesOnIndexPagePO imagesOnIndexPagePO;
    protected TextsUnderImagesOnIndexPagePO textsUnderImagesOnIndexPagePO;
    protected IframePagePO iframePagePO;
    protected LeftSectionOnHomePagePO leftSectionOnHomePagePO;
    protected DifferentElementsPO differentElementsPO;
    protected LogRowsOnDifferentElementsPagePO logRowsOnDifferentElementsPagePO;

    protected AbstractStep(WebDriver driver) {
        loginPage = new LoginPagePO(driver);
        homePagePO = new HomePagePO(driver);
        headerMenuOfHomePageAfterLoginPO = new HeaderMenuOfHomePageAfterLoginPO(driver);
        imagesOnIndexPagePO = new ImagesOnIndexPagePO(driver);
        textsUnderImagesOnIndexPagePO = new TextsUnderImagesOnIndexPagePO(driver);
        iframePagePO = new IframePagePO(driver);
        leftSectionOnHomePagePO = new LeftSectionOnHomePagePO(driver);
        differentElementsPO = new DifferentElementsPO(driver);
        logRowsOnDifferentElementsPagePO =
                new LogRowsOnDifferentElementsPagePO(driver);
    }


}
