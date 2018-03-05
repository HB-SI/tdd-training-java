import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

    public static final String ITEM_NOT_IN_LIST = "Item not in list";

    @Test
    public void createOneToHundredListTest() {
        assertEquals(ITEM_NOT_IN_LIST, 100, getListToTest().size());
    }

    @Test
    public void multiplesThreeFizzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Fizz", obtainValueToTest(3));
    }

    @Test
    public void multiplesNineFizzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Fizz", obtainValueToTest(9));
    }

    @Test
    public void multiplesFiveBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Buzz", obtainValueToTest(5));
    }

    @Test
    public void multiplesTenBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Buzz", obtainValueToTest(10));
    }

    @Test
    public void multiplesFiveTeenBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Bazzinga", obtainValueToTest(15));
    }

    @Test
    public void multiplesThirtyTeenBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Bazzinga", obtainValueToTest(30));
    }

    @Test
    public void containsThreeIsFizzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Fizz", obtainValueToTest(31));
    }

    @Test
    public void containsFiveIsBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Buzz", obtainValueToTest(58));
    }

    @Test
    public void containsFiftyOneIsFizzBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Bazzinga", obtainValueToTest(51));
    }

    @Test
    public void containsFiftyThreeIsFizzBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Bazzinga", obtainValueToTest(53));
    }

    @Test
    public void containsThirtyFiveIsFizzBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Bazzinga", obtainValueToTest(35));
    }

    @Test
    public void containsFortyFiveIsFizzBuzzTest() {
        assertEquals(ITEM_NOT_IN_LIST, "Bazzinga", obtainValueToTest(45));
    }

    private String obtainValueToTest(int value) {
        return getListToTest().get(value - 1);
    }

    private List<String> getListToTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        return fizzBuzz.createOneToHundredList();
    }
}
