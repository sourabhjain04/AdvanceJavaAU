package com.koenig.testSuitExample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({PrepareMyBagTest.class, AddPencilsTest.class})
public class SuitTest {

}
