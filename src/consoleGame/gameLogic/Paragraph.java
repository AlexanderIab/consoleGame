package consoleGame.gameLogic;

import java.io.Serializable;

public class Paragraph implements Serializable {
    private final String textIntro;
    private Paragraph paragraph1;
    private Paragraph paragraph2;
    private final boolean exit;

    public Paragraph(String textIntro, boolean exit) {
        this.textIntro = textIntro;
        this.exit = exit;
    }

    public Paragraph(String textIntro, Paragraph paragraph1, Paragraph paragraph2, boolean exit) {
        this.textIntro = textIntro;
        this.paragraph1 = paragraph1;
        this.paragraph2 = paragraph2;
        this.exit = exit;
    }

    public String getTextIntro() {
        return textIntro;
    }

    public Paragraph getParagraph1() {
        return paragraph1;
    }

    public Paragraph getParagraph2() {
        return paragraph2;
    }

    public boolean isExit() {
        return exit;
    }

}
