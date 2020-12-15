public class PrintRoomInfo {

    public void print(Room room) {
        int fitsPeople = room.getWidth() * room.getHeight();
        System.out.println("room " + room.getName() + " fits " + fitsPeople + " people");
    }
}
