import java.util.ArrayList;

public class Equipments {
    private int equipment_id;
    private String name;
    private ArrayList<Equipments> equipment;
    public Equipments () {
        name = "Inavild name";
        equipment_id = 000;
        equipment = new ArrayList<>();
    }
    public Equipments (String name) {
        this.name = name;
        equipment_id = 000;
        equipment = new ArrayList<>();
    }
    public Equipments (String name , int id) {
        this.name = name;
        equipment_id = id;
        equipment = new ArrayList<>();
    }
    public void setName (String name) {
        this.name = name;
    }
    public void setEquipment_id (int id) {
        equipment_id = id;
    }
    public String getName () {
        return this.name;
    }
    public int getEquipment_id () {
        return equipment_id;
    }
    public void addEquipment(Equipments eq1) {
        if (equipment != null && eq1 != null) {
            equipment.add(eq1);
        }
    }
    public void RemoveEquipment(Equipments eq1) {
        if (equipment != null && eq1 != null) {
            equipment.remove(eq1);
        }
    }
    public void ShowAllEquipments() {
        if (equipment != null) {
            for (Equipments x : equipment) {
                x.ShowData();
            }
        }
    }
    public ArrayList<Equipments> getEquipmentsList() {
        return equipment;
    }
    public void ShowData () {
        System.out.println("Equipment name is : " + name);
        System.out.println("Equipment ID is : " + equipment_id);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
    }
}
