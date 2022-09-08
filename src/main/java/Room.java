import java.util.ArrayList;

public abstract class Room {

    protected int capacity;
    protected ArrayList<Guest> guestList;

    public Room(int capacity) {
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int getGuestListSize(){
        return this.guestList.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean occupiedRoom(){
        return this.getGuestListSize() > 0;
    }

    public boolean vacantRoom(){
        return this.getGuestListSize() < 0;
    }

    public void checkInGuest(Guest guest){
        if (getGuestListSize() < this.capacity && this.vacantRoom()){
            guestList.add(guest);
        }
    }

    public void checkOutGuest(Guest guest){
        if (this.occupiedRoom()){
            guestList.clear();
        }
    }


}
