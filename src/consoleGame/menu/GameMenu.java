package consoleGame.menu;

import java.util.Scanner;

/**
 * @author Alexander Iablonski
 * */
public class GameMenu {
    GameTools game = new GameTools();
    Command newG = game::newGame;
    Command loadG = game::loadGame;
    Command exitG = game::exitGame;

    private int userCommand;
    private boolean startMenu;

    MenuCommand menuCommand = new MenuCommand(newG, loadG, exitG);

    public void switchCommand(){
        while (true){
            userCommand = new Scanner(System.in).nextInt();
            if (userCommand == 1){
                menuCommand.newG();
                break;
            }
            else if (userCommand == 2){
                menuCommand.loadG();
                break;
            }
            else if (userCommand == 3){
                menuCommand.exitG();
                break;
            }
            else if (userCommand == 4 && !startMenu) break;
            else System.out.println("Такой команды не существует");
        }
    }

    public void saveExit() {
        menuCommand.menuPrintSave();
        startMenu = false;
        switchCommand();
    }

    public void startGame() {
        menuCommand.menuPrint();
        startMenu = true;
        switchCommand();
    }

    public int getUserCommand() {
        return userCommand;
    }
}
