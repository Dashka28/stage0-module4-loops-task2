package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
int val = 2;
        int count = 0;
        int sum = 0;
        if(power > 0){
            while(count <= power){
                sum = (int)(Math.pow(val, count));
                System.out.println(sum);
                count++;
            }
        }if(power == 0){
            sum = (int)(Math.pow(val, count));
            System.out.println(sum);
        }if(power < 0){
            System.out.println("too much power");
        }
    }
}
