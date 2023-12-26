package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// data provider annotation
public class DataDrivenTesting {
    @Test(dataProvider = "loginData")
    public void login(String email , String password ,boolean success){
        System.out.println(email);
        System.out.println(password);
        System.out.println(success);
    }
@DataProvider
    public Object[][] loginData(){

        Object[][] data = new Object[3][3];
        data[0][0]="test1@gmail";
        data[0][1]="test1234";
        data[0][2]=true;

        data[1][0]="test2@gmail";
        data[1][1]="test1234";
        data[1][2]=false;

        data[2][0]="test3@gmail";
        data[2][1]="test12345";
        data[2][2]=true;
        return data;
    }
}
