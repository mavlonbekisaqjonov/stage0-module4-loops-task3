package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fibonacci1 = 0;
        int fibonacci2 = 1;
        int fibonacciCurrent;
        int count = 1;

        if (lastFibonacci >= 1) {
            System.out.println(fibonacci1);
            count++;
        }

        if (lastFibonacci >= 2) {
            System.out.println(fibonacci2);
            count++;
        }

        while (count <= lastFibonacci) {
            fibonacciCurrent = fibonacci1 + fibonacci2;
            System.out.println(fibonacciCurrent);
            fibonacci1 = fibonacci2;
            fibonacci2 = fibonacciCurrent;
            count++;
        }
    }
}
