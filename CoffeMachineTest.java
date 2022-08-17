import org.junit.jupiter.api.Test;
import java.util.logging.Level;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeMachineTest {
    public static final Logger logger = Logger.getLogger(CoffeeMachineTest.class.getName());

    @BeforeClass
    public static void beforeLog() {

        logger.log(Level.INFO, "Log before class.");
    }

    @Test
    public void firstTest() {

        logger.log(Level.INFO, "Started first test.");
        assertEquals(CoffeeMachine.thePriceForCoffee(92), CoffeeMachine.espreso);
        logger.log(Level.INFO, "Ended first test.");
    }

    @Test
    public void secondTest() {

        logger.log(Level.INFO, "Started second test.");
        assertEquals(CoffeeMachine.thePriceForCoffee(120), CoffeeMachine.macchiato);
        logger.log(Level.INFO, "Ended second test.");
    }

    @Test
    public void thirdTest() {

        logger.log(Level.INFO, "Started third test.");
        assertEquals(CoffeeMachine.thePriceForCoffee(160), CoffeeMachine.caffeLatte);
        logger.log(Level.INFO, "Ended third test.");
    }

    @Test
    public void fourthTest() {

        logger.log(Level.INFO, "Started fourth test.");
        assertEquals(CoffeeMachine.thePriceForCoffee(190), CoffeeMachine.cappuchino);
        logger.log(Level.INFO, "Ended fourth test.");
    }

    @AfterClass
    public static void afterLog() {
        Logger logger = Logger.getLogger(CoffeeMachineTest.class.getName());
        logger.log(Level.INFO, "Log after class.");
    }

}
