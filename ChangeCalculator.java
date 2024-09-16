import java.util.Random;
import java.util.Scanner;

class ChangeCalculator {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);
        double cost = rand.nextDouble()*100;
        String sen = String.format("That will be %.2f ", cost);
        System.out.println(sen);

        String inp = s.nextLine();

        if (Integer.parseInt(inp) < cost) System.out.println("Sorry that's not enough you can't have this anymore!");
        else{
            double dif =   Integer.parseInt(inp)-cost;
            String sen2 = String.format("Looks like I owe you %.2f", dif);
            System.out.println(sen2);
            System.out.println("Unluckily, we are out of change, so sorry!");
        }
    }
}