import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class Test2Test {

    @Test(groups = "groups1")
    public void Test1(){
        System.out.println("这是groups1的用例case");
    }

    @Test(groups = "groups2")
    public void Test2(){
        System.out.println("这是groups2的用例case");
    }

    @BeforeGroups(groups="group1")
    public void BeforeGroups(){
        System.out.println("这是@BeforeGroups的用例case");
    }

    @AfterGroups(groups="group2")
    public void AfterGroups(){
        System.out.println("这是@AfterGroups的用例case");
    }
}