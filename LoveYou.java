import java.util.Random;

class LoveYou {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(10);
        System.out.print("I ");
        for (int j = 0; j < i; j++){
            System.out.print("really");
            if (j != i-1) System.out.print(", ");
            else System.out.print(" ");
        }
        System.out.println("love you!");
    }
}