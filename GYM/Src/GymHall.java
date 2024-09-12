import java.util.ArrayList;
import java.util.List;

public class GymHall {
    private String name;
    public static List<Equipments> equipments;
    public static List<GymHall> gymhall;
    private final int openHours = 12;
    public GymHall () {
        this.equipments = new ArrayList<>();
        this.gymhall = new ArrayList<>();
    }
    public GymHall(String name) {
        this.name = name;
        this.equipments = new ArrayList<>();
        this.gymhall = new ArrayList<>();
    }
    public void addEquipment(Equipments equipment) {
        equipments.add(equipment);
    }
    public void removeEquipment(Equipments equipment) {
        equipments.remove(equipment);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public List<Equipments> getEquipments() {
        return equipments;
    }
    public List<GymHall> getHalls() {
        return gymhall;
    }
    public int getOpenHours() {
        return openHours;
    }
    @Override
    public String toString() {
        return getName();
    }
}
