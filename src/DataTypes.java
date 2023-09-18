import java.util.List;

public class DataTypes {
    public static long sum(List<Integer> numbers) {

        long L = 0;
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            L += x;
        }
        return L;
    }
}