// the first window checked in the class and omitted
//this window shows the main chatroom with folowing users sending this messeges
// and then deletes one online user
public class Main {
    public static void main(String[] args) {
       // new UsernameFrame();

        ChatRoomGUI chatroomguic = new ChatRoomGUI();
        chatroomguic.addNewParticipant("ali");
        chatroomguic.addNewParticipant("reza");
        chatroomguic.addNewMessage("ali","salam");
        chatroomguic.removeparticipant("reza");
    }
}
