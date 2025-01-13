package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        System.out.println(first);
    }
}
