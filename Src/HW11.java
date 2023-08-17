import java.util.Random;

public class HW11 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNum = random.nextInt(100000) + 11;
        System.out.println( "Рандомне число = " + randomNum );
        int sum = 0;
        while( randomNum > 0) {
            int temp = randomNum % 10;
            sum += temp;
          randomNum /= 10;
        }
           System.out.println(sum);
    }
}