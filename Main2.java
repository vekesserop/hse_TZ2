
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main2 {
    public static double[] read(String file_path) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(file_path));
        Scanner s = new Scanner(br);
        List<Double> result = new ArrayList<Double>();
        while (s.hasNextDouble()) {
            result.add(s.nextDouble());
        }
        return result.stream().mapToDouble(n -> n).toArray();
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.print("File path: ");
        Scanner s = new Scanner(System.in);
        String file_path = s.next();
        double[] data = read(file_path);
        System.out.printf("Min: " + _min(data));
        System.out.printf("Max: "+ _max(data));
        System.out.printf("Sum: " + _sum(data));
        System.out.printf("Product: " + _mult(data));
    }

    public static double _mult(double[] numbers) throws NullPointerException {
        if (numbers == null) {
            throw new NullPointerException("Ноль нельзя");
        }
        double mult = 1;
        for (int k = 0; k < numbers.length; k ++)
            mult = mult * numbers[k];
        return mult;
    }

    public static double _min(double[] numbers) throws NullPointerException {
        if (numbers == null) {
            throw new NullPointerException("Ноль нельзя");
        }
        OptionalDouble result = Arrays.stream(numbers).min();
        if (result.isEmpty()) {
            throw new NullPointerException("Ноль нельзя");
        }
        return result.getAsDouble();
    }

    public static double _max(double[] numbers) throws NullPointerException {
        if (numbers == null) {
            throw new NullPointerException("Ноль нельзя");
        }
        OptionalDouble result = Arrays.stream(numbers).max();
        if (result.isEmpty()) {
            throw new NullPointerException("Ноль нельзя");
        }
        return result.getAsDouble();
    }

    public static double _sum(double[] numbers) throws NullPointerException {
        if (numbers == null) {
            throw new NullPointerException("Ноль нельзя");
        }
        return Arrays.stream(numbers).sum();
    }
}