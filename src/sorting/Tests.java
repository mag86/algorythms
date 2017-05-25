package sorting;

import org.junit.Test;

import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;
import sorting.Sorter;

/**
 * Created by admin on 25.05.2017.
 */
public class Tests {
    Logger logger = Logger.getLogger(Tests.class.getName());
    @Test
    public void testStringSortedByAlphabet(){
        System.out.println("Inside testStringSortedByAlphabet()");
        logger.info("Inside testStringSortedByAlphabet()");
        String[] array = {"test", "Victor", "Alexa", "aa", "azimut", "zex"};
        String[] resultarray ={"aa", "Alexa", "azimut", "test", "Victor", "zex"};

        assertEquals(resultarray,Sorter.stringSortedByAlpabet(array));
    }


    @Test
    public void testStringSortedByAlphabetRevers(){
        System.out.println("Inside testStringSortedByAlphabetReverse()");
        logger.info("Inside testStringSortedByAlphabetReverse()");
        String[] array = {"test", "Victor", "Alexa", "aa", "azimut", "zex"};
        String[] resultarray ={"zex", "Victor", "test", "azimut", "Alexa", "aa"};

        assertEquals(resultarray,Sorter.stringSortedByAlphabetReverse(array));
    }
}
