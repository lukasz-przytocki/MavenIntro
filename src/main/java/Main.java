import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException, AWTException, IOException {
        Robot robot = new Robot();
        Random rand = new Random();

        Runtime rt = Runtime.getRuntime();
        rt.exec("notepad.exe");
        Thread.sleep(100);

        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_H);
        robot.keyPress(KeyEvent.VK_A);

        for (int i = 0; i < 100; i++) {

            robot.mouseMove(rand.nextInt(1500), rand.nextInt(1000));
        }
    }
}
