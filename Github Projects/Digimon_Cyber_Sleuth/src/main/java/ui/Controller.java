package ui;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Controller {

    private final View view = new View();
    private Robot robot = new Robot();

    public Controller() throws AWTException {
    }

    private void runAppLoop() {
        MainMenuOption option;
        do {
            option = view.getMenuOption();
            switch (option) {
                case CAM_GRIND:
                    camGrind();
                    break;
            }
        } while (option != MainMenuOption.EXIT);
    }

    private void camGrind() {
        robot.delay(5000);
        int counter = 0;
        while (counter < 100) {
            robot.keyPress(KeyEvent.VK_C);
            robot.delay(300);
            robot.keyRelease(KeyEvent.VK_C);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_C);
            robot.delay(300);
            robot.keyRelease(KeyEvent.VK_C);

            robot.delay(5500);

            robot.keyPress(KeyEvent.VK_P);
            robot.delay(300);
            robot.keyRelease(KeyEvent.VK_P);

            robot.delay(19000);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyPress(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);

            robot.delay(300);

            robot.keyPress(KeyEvent.VK_SPACE);
            robot.delay(100);
            robot.keyRelease(KeyEvent.VK_SPACE);


            robot.delay(5000);
        }
    }

    public void run() {
        view.displayHeader("Digimon Cyber Sleuth Automation");
        runAppLoop();
        view.displayHeader("Goodbye.");
    }
}
