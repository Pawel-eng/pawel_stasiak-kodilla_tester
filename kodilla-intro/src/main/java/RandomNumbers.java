import java.util.Random;

public class RandomNumbers {
    
    static int min = 10;
    static int max = 0;
    public static void main(String[] args) {
        displayEvenNumbers();
    }

    public static void displayEvenNumbers() {
        Random random = new Random();
        int sum = 0;

        while (sum < 5000) {
            int temp = random.nextInt(31);
            min(temp);
            max(temp);
            sum = sum + temp;
            System.out.println(sum);
        }
    }

    public static void min(int number) {
        if (number<min) {
            min = number;
            System.out.println("wartość minimalna "+min);
        }
    }

    public static void max(int number) {
        if (number>max) {
            max = number;
            System.out.println("wartość maxymalna "+max);
        }
    }
}