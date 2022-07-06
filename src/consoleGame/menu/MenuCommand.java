package consoleGame.menu;

public class MenuCommand {
    private final Command newGame;
    private final Command loadGame;
    private final Command exitGame;

    public MenuCommand(Command newGame, Command loadGame, Command exitGame) {
        this.newGame = newGame;
        this.loadGame = loadGame;
        this.exitGame = exitGame;
    }

    public void newG(){newGame.execute();}
    public void loadG(){
        loadGame.execute();
    }
    public void exitG(){
        exitGame.execute();
    }

    public void menuPrint(){
        System.out.println("""
                Меню:
                1. Начать игру
                2. Загрузить игру
                3. Выйти""");
    }

    public void menuPrintSave(){
        System.out.println("""
                Меню:
                1. Начать игру
                2. Загрузить игру
                3. Выйти
                4. Сохранить игру""");
    }
}
