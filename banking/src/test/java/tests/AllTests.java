//Jaden Schuster

package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testDeposit.class, testWithdraw.class })
public class AllTests {

}
