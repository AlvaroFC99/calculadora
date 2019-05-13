package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DivisionTest.class, MultiplicacionTest.class, RestaTest.class, SumaTest.class })
public class AllTests {

}
