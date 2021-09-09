import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void TestGame1()
    {
        MyGame myGame = new MyGame();
        myGame.setRand(50);
        Assertions.assertTrue(myGame.game(50));
    }
    @Test
    public void TestGame2()
    {
        MyGame myGame = new MyGame();
        myGame.setRand(70);
        Assertions.assertFalse(myGame.game(50));
    }
    @Test
    public void TestGame3()
    {
        MyGame myGame = new MyGame();
        myGame.setRand(0);
        Assertions.assertTrue(myGame.game(0));
    }
    @Test
    public void TestGame4()
    {
        MyGame myGame = new MyGame();
        myGame.setRand(10000);
        Assertions.assertFalse(myGame.game(50));
    }
}
