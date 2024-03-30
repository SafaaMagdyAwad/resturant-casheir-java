package resturant;
import java.util.Scanner;
public class Resturant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean s = true;
        while (s) {
            System.out.println(" what is your order? \n 1.Normal Burger \n 2. Healthy Burger \n 3.Delux Burger");
            int x = sc.nextInt();
            if (x == 1) {
                NormalBurger n = new NormalBurger();
                System.out.println("do you want \n 1-beef 10LE \n 2-chikens   20LE \n 3.none");
                int y = sc.nextInt();
                if (y == 1) {
                    n.beef();
                } else if (y == 2) {
                    n.chickens();
                }
                System.out.println("1 .extra chees  5.5 LE \n 2. extra tomatoes   4.5LE \n 3.none");
                y = sc.nextInt();
                if (y == 1) {
                    n.extraChees();
                } else if (y == 2) {
                    n.extratomatoes();
                }
                System.out.println("1.white bread   10 LE\n 2. brown bread   5   \n 3.none");
                y = sc.nextInt();
                if (y == 1) {
                    n.whitebread();
                } else if (y == 2) {
                    n.brownebread();
                }
                System.out.println(n.toString());
                System.out.println("do you want anoyher order(1. yes \n 2.no)");
                y = sc.nextInt();
                if (y == 1) {

                } else {
                    System.out.println(" thanks for comming to our resturant");
                    s = false;
                }
            } else if (x == 2) {
                HealthyBurger h = new HealthyBurger();
                System.out.println("do you want \n 1-beef  10LE \n 2-chikens   20LE \n 3.none");
                int y = sc.nextInt();
                if (y == 1) {
                    h.beef();
                } else if (y == 2) {
                    h.chickens();
                }
                System.out.println("1 .extra chees 5.5LE \n 2. extra tomatoes   4.5 LE \n 3.none");
                y = sc.nextInt();
                if (y == 1) {
                    h.extraChees();
                } else if (y == 2) {
                    h.extratomatoes();
                }
                System.out.println(h.toString());

                System.out.println("do you want anoyher order(1. yes, 2.no)");
                y = sc.nextInt();
                if (y == 1) {

                } else {
                    System.out.println(" thanks for comming to our resturant");
                    s = false;
                }

            } else if (x == 3) {
                DeluxBurger d = new DeluxBurger();
                System.out.println("do you want \n 1-beef  10LE \n 2-chikens   20LE \n 3.none");
                int y = sc.nextInt();
                if (y == 1) {
                    d.beef();
                } else if (y == 2) {
                    d.chickens();
                }
                System.out.println("1 .chips 6.5LE \n 2. Drinks   11.5LE \n 3.none");
                y = sc.nextInt();
                if (y == 1) {
                    d.chips();
                } else if (y == 2) {
                    d.drinks();
                }
                System.out.println(d.toString());

                System.out.println("do you want anoyher order\n (1. yes \n 2.no)");
                y = sc.nextInt();
                if (y == 1) {

                } else {
                    System.out.println(" thanks for comming to our resturant");
                    s = false;
                }
            } else {
                System.out.println("try again");
                x = sc.nextInt();
            }


        }
    }

}
