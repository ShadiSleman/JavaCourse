package UnitTest;

import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//assertEquals()
//assertTrue() ( for boolean)
//assetNotEquals()
//assertArrayEquals() - comparing 2 arrays - lengths are same and every element in both arrays is same
//assertNull() and assertNotNull() ( we can use assert equals to check null but this the clearer)
//assertSame() and assertNotSame() - to check two instance are exact the same instance
//assertThat() - compare actual value against Junit matcher class , this is more powerful than other assert methods.
//@BeforeEach annotation - running before each unit test
//@AfterEach annotation - running after each unit test
//@BeforeAll annotation - run one time before execute test cases ( reading from DB or something like this )
//@AfterAll annotation - run one time after execute test cases ( reading from DB or something like this )
//test when we got exception (withdraw_noBranch example )

class BankAccountTest {

    private BankAccount account;
    private static int count ;

    @BeforeAll
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = "+count++);
    }

    //this will run before every test ( instead of creating instance every test)
    @BeforeEach
    public void setup(){
        account = new BankAccount("Tim", "Buchalka", 1000.00,BankAccount.CHECKING);
        System.out.println("Running a test...");
    }



    @Test
    void deposit() throws Exception {

        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    void withdraw_branch() throws Exception {
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test
     void withdraw_noBranch() throws Exception {
        try{
            account.withdraw(600.00, false);//The test here if we can withdraw more than 500
        }catch(IllegalArgumentException e){}
//        assertEquals(400.00, balance, 0);
    }


    @Test
    void getBalance() throws Exception  {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance(), 0);
    }

    @Test
    public void isChecking_true() throws Exception {
        assertTrue(account.isChecking(), "The account is NOT a checking account");

    }

    @Test
    public void dummyTest() {
        assertEquals(20, 20);

    }

    @AfterAll
    public static void afterClass(){
        System.out.println("This executes after any test cases. Count =" +count++);
    }

    @AfterEach
    public void teardown(){
        System.out.println("Count = "+count++);
    }

}

