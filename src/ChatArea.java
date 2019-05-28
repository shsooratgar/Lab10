import javax.swing.*;

public class ChatArea extends JTextArea {
    private static final int ROWS = 10, COLUMNS = 30;
    public ChatArea() {

    super(ROWS, COLUMNS);
    this.setEditable(false);
    this.setLineWrap(true);
    }
    public void addMessage(String username,String message)
    {
        //System.out.println(username +message);
        append(username+": "+message+"\n");
    }
}