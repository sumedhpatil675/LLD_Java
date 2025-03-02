import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(11,22,33,44,55,66,77,88);

        int result = numbers.stream().filter(number->number%2==0).mapToInt(e->e*2).sum();

        System.out.println("Result "+result);
    }

}
