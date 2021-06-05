package ro.ase.cts.unittesting.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import ro.ase.cts.unittesting.test.GrupaTest;
import ro.ase.cts.unittesting.test.GrupaTestWithFakes;
import ro.ase.cts.unittesting.test.GrupaTestWithMocks;
import ro.ase.cts.unittesting.test.GrupaTestWithStubs;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWithFakes.class, GrupaTestWithStubs.class, GrupaTestWithMocks.class})
public class CompleteTestSuite {


}
