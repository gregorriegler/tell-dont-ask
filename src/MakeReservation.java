public class MakeReservation {

    public void make(Room room, int people) {
        int fitsPeople = room.getWidth() * room.getHeight();

        if(people <= fitsPeople) {
            System.out.println("reservation made");
        }
    }
}
