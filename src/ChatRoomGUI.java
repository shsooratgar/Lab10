import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChatRoomGUI extends JFrame{
    private final String WINDOWS_TITLE = "AUT Chat Room";
    private final int WIDTH = 500, HEIGHT = 500;
    private final int X = 100, Y = 100;
    //private ArrayList<String> users = new ArrayList<>();
    ParticipantsArea participantsArea = new ParticipantsArea();
    MessageArea messageArea = new MessageArea();
    ChatArea chatBox = new ChatArea();


    public ChatRoomGUI() {
        super();
        this.setTitle(WINDOWS_TITLE);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WIDTH, HEIGHT);
        this.setLocation(X, Y);
        this.add(new JScrollPane(chatBox), BorderLayout.EAST);
        this.add(participantsArea, BorderLayout.WEST);
        this.add(messageArea, BorderLayout.SOUTH);
        this.setVisible(true);
    }
    public void addNewMessage(String username,String Messege){
        chatBox.addMessage(username, Messege);
    }
    public void addNewParticipant(String username){
        participantsArea.addParticipant(username);
    }
    public void removeparticipant(String username){
       participantsArea.removeparticipant(username);
    }


}