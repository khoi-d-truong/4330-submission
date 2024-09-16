import java.util.Random;

class Ave {
    public static void main(String[] args) {

        Random rand = new Random();

        int i1;
        double sum = 0;
        for (int i = 0; i < 10; i++){
            i1 = rand.nextInt(100);
            System.out.println(i1);
            sum += i1;
        }
        double av = sum/10;
        System.out.println("The average is : " + av);
    }
}