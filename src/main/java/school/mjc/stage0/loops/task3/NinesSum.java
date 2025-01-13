package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        for(int i=1; i<=lengthOfLastNumber; i++) {
            int nine = 0;
            for(int j=1; j<=i; j++) {
                nine = nine*10 + 9;
            }
            sum+=nine;
        }
        System.out.println(sum);
    }
}
