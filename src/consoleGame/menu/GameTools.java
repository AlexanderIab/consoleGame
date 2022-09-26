package consoleGame.menu;

import consoleGame.gameLogic.Paragraph;
import consoleGame.gameLogic.ParagraphInitialization;
import consoleGame.gameLogic.RunGame;

import java.io.*;

/**
 * @author Alexander Iablonski
 * */
public class GameTools {

    public void newGame() {
        new RunGame().runGame(new ParagraphInitialization().getLittleFoxAppStart());
    }

    public void loadGame() {
        try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("D:/saveGame.txt"))) {
            new RunGame().runGame((Paragraph) objectIn.readObject());
        } catch (FileNotFoundException exception){
            System.out.println("Сохранение не найдено");
            new GameMenu().startGame();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    public void saveGame(Paragraph paragraph) {
        try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream("D:/saveGame.txt"))) {
            objectOut.writeObject(paragraph);
            System.out.println("Игра успешно сохранена");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exitGame() {
        System.out.println("Спасибо. До свидания!");
    }
}
