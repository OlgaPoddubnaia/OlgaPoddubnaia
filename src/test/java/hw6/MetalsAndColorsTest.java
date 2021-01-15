package hw6;

import hw6.entities.User;
import hw6.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MetalsAndColorsTest extends AbstractBaseTest {

    @Test
    public void metalsAndColorsFormTest(){
//
        JdiSite.open();
        //
        JdiSite.login(User.ROMAN);
        String actualFullName =JdiSite.getUserName();
        Assert.assertEquals(actualFullName,User.ROMAN.getFullName());

    }
}
