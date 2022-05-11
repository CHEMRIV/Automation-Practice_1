package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {

    @DataProvider(name="credentials")
    public Object[][] getData(){
        Object[][]data =new Object[][]{
                {"","123456","An email address required."},
                {"abcd@gmail.com","","Password is required."},
                {"adfdfgfg","123456","Invalid email address."},
                {"abcd@gmail.com","123456","Authentication failed."},

        };
        return data;
    }

}
