import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> createOneToHundredList() {
        return IntStream.rangeClosed(1, 100).boxed().map(this::mapMultipleOfThreeToFizzAndMulptipleOfFiveToBuzz).collect(Collectors.toList());
    }

    private String mapMultipleOfThreeToFizzAndMulptipleOfFiveToBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}

