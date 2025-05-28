package hooks;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before
    public void setup(){
        initialize("chrome");
    }

    @After
    public void teardown(){
        driver.quit();
    }
}
