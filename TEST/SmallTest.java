package TEST;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SmallTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String result = input.stream().map(String::valueOf).collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
