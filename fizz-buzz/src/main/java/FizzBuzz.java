import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> createOneToHundredList() {
        return IntStream.rangeClosed(1, 100).mapToObj(this::mapMultipleOfThreeToFizzAndMulptipleOfFiveToBuzz).collect(Collectors.toList());
    }

    private String mapMultipleOfThreeToFizzAndMulptipleOfFiveToBuzz(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "Bazzinga";
        } else if (isFizz(number)) {
            return "Fizz";
        } else if (isBuzz(number)) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    private boolean isBuzz(int number) {
        return isMultipleOrContains(number, 5);
    }

    private boolean isFizz(int number) {
        return isMultipleOrContains(number, 3);
    }

    private boolean isMultipleOrContains(int number, int valueToCompare) {
        return number % valueToCompare == 0 || String.valueOf(number).contains(String.valueOf(valueToCompare));
    }

}

