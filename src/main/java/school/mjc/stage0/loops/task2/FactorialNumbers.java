package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 1;
        int sum = 1;
        while(i <= printToInclusive){
            sum = sum * i;
            System.out.println(sum);
            i++;
        }

    }
}
