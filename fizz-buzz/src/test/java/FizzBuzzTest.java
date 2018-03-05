import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void createOneToHundredListTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        List<String> oneToHundredList = fizzBuzz.createOneToHundredList();
        assertEquals("Item not in list", 100, oneToHundredList.size());
    }

	@Test
	public void multiplesThreeFizzTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> oneToHundredList = fizzBuzz.createOneToHundredList();
		assertEquals("Item not in list", "Fizz", oneToHundredList.get(2));
	}

	@Test
	public void multiplesNineFizzTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> oneToHundredList = fizzBuzz.createOneToHundredList();
		assertEquals("Item not in list", "Fizz", oneToHundredList.get(8));
	}

	@Test
	public void multiplesFiveBuzzTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> oneToHundredList = fizzBuzz.createOneToHundredList();
		assertEquals("Item not in list", "Buzz", oneToHundredList.get(4));
	}

	@Test
	public void multiplesTenBuzzTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> oneToHundredList = fizzBuzz.createOneToHundredList();
		assertEquals("Item not in list", "Buzz", oneToHundredList.get(9));
	}

	@Test
	public void multiplesFiveTeenBuzzTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> oneToHundredList = fizzBuzz.createOneToHundredList();
		assertEquals("Item not in list", "FizzBuzz", oneToHundredList.get(14));
	}

	@Test
	public void multiplesThirtyTeenBuzzTest() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		List<String> oneToHundredList = fizzBuzz.createOneToHundredList();
		assertEquals("Item not in list", "FizzBuzz", oneToHundredList.get(29));
	}

}
