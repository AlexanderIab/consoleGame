package consoleGame.gameLogic;

import consoleGame.menu.GameMenu;
import consoleGame.menu.GameTools;

import java.util.Scanner;

public class RunGame {
    GameMenu gameMenu = new GameMenu();
    GameTools gameTools = new GameTools();

    public void runGame(Paragraph paragraph) {
        if (paragraph.isExit()) {
            System.out.println(paragraph.getTextIntro());
            return;
        }
        System.out.println(paragraph.getTextIntro());
        while (true) {
            int command = new Scanner(System.in).nextInt();
            if (command == 1) {
                runGame(paragraph.getParagraph1());
                break;
            } else if (command == 2) {
                runGame(paragraph.getParagraph2());
                break;
            } else if (command == 3) {
                gameMenu.saveExit();
                if (gameMenu.getUserCommand() == 4) {
                    gameTools.saveGame(paragraph);
                    runGame(paragraph);
                }
                break;
            } else System.out.println("Такой команды не существует, попробуйте ещё раз!");
        }
    }

    public void runGame() {
        gameMenu.startGame();
    }
}
