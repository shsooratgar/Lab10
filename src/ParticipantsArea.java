import javax.swing.*;
import java.awt.*;


public class ParticipantsArea extends JPanel
{
    private static final String LABEL_TXT = "Online People:";
    private static int count = 0;
    DefaultListModel model = new DefaultListModel();
    public ParticipantsArea() throws HeadlessException {
        super();
        this.setLayout(new BorderLayout());
        JLabel label = new JLabel(LABEL_TXT);
        JList list = new JList(model);
        add(label, BorderLayout.NORTH);
        add(list, BorderLayout.CENTER);
        setVisible(true);
    }

    public void addParticipant(String user)
    {
        model.addElement(user);

    }
    public void removeparticipant(String username){
        model.removeElement(username);
    }

}
