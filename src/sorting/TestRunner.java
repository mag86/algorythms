package sorting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Created by admin on 25.05.2017.
 */
public class TestRunner {

        public static void main(String[] args) {
            Result result = JUnitCore.runClasses(Tests.class);

            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }

            System.out.println(result.wasSuccessful());
        }

}
