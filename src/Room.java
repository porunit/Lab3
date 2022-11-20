import Pressets.AbstractPlace;
import Pressets.PlaceAble;

public class Room extends AbstractPlace implements PlaceAble {

    public Room(String name) {
        super(name);
    }

    @Override
    public String getPlace() {
        return this.name;
    }
}
