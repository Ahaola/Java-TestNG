import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * @Test注解：将类或方法标记为测试的一部分，此标记若放在类上，则该类所有公共方法都将被作为测试方法
 */
public class Test1Test {

    @Test(groups = "groups1")
    public void Test1(){
        System.out.println("这是groups1的用例Test1");
    }

    @Test(groups = "groups1")
    public void Test11(){
        System.out.println("这是groups1的用例Test11");
    }

    @Test(groups = "groups2")
    public void Test2(){
        System.out.println("这是groups2的用例Test2");
    }

    @Test(groups = "groups2")
    public void Test22(){
        System.out.println("这是groups2的用例Test22");
    }

    //只对group1有效，即Test1和Test11
    @BeforeGroups(groups="group1")
    public void BeforeGroups(){
        System.out.println("这是@BeforeGroups的用例case");
    }

    //只对group2有效，即Test2和Test22
    @AfterGroups(groups="group2")
    public void AfterGroups(){
        System.out.println("这是@AfterGroups的用例case");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("这是BeforeClass的用例case");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("这是AfterClass的用例case");
    }

    @BeforeTest
    public void BeforeTest(){
        System.out.println("这是BeforeTest的用例case");
    }

    @AfterTest
    public void AfterTest(){
        System.out.println("这是AfterTest的用例case");
    }

    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("这是@BeforeSuite的用例case");
    }

    @AfterSuite
    public void AfterSuite(){
        System.out.println("这是@AfterSuite的用例case");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("这是@BeforeMethod的用例case");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("这是@AfterMethod的用例case");
    }

    @Parameters
    public void Parameters(){
        System.out.println("这是@AfterGroups的用例case");
    }


}