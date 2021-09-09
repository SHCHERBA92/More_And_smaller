import org.w3c.dom.ranges.Range;

import java.time.temporal.ValueRange;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MyGame myGame = new MyGame();
                System.out.println("Угадайте число от 0 до 100");
        do {
            System.out.print("\nВведите число :\t");

        }while (!myGame.game(scanner.nextInt()));


    }
}
