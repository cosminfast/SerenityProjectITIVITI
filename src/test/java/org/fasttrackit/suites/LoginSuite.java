package org.fasttrackit.suites;

import org.fasttrackit.features.LoginTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        LoginTest.class

})
public class LoginSuite {
}
