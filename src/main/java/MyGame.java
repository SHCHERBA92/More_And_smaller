import java.util.HashSet;

public class MyGame {
    HashSet<Integer> integers;
    int rand = (int) (Math.random()*100);
    //System.out.println(rand);
    Integer numberOfScanner = null;

    public MyGame(HashSet<Integer> integers) {
        this.integers = integers;
    }

    public MyGame() {
        this.integers = new HashSet<>();
    }

    public void setRand(int rand) {
        this.rand = rand;
    }

    public boolean game(int number)
    {
//        System.out.println("Угадайте число от 0 до 100");
//            System.out.print("Введите число :\t");

            this.numberOfScanner = number;
            if (this.numberOfScanner <= 100 & this.numberOfScanner!=null)
            {
                if (this.numberOfScanner == rand)
                {
                    System.out.println("Вы угадали");
                    return true;
                }
                else if (this.numberOfScanner < rand)
                {
                    integers.add(this.numberOfScanner);
                    System.out.println("введите число больше\t\t");
                    System.out.print("Числа которые уже вводили : " + this.integers);
                    return false;
                }
                else {
                    integers.add(this.numberOfScanner);
                    System.out.println("ВВедите число меньше\t\t");
                    System.out.print("Числа которые уже вводили : " + this.integers);
                    return false;
                }
            }
            else {
                System.out.println("Число должно быть меньше 100");
                return false;
            }


    }
}
