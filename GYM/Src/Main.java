import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();
        Trainers trainers = new Trainers();
        Equipments equipments = new Equipments();
        ArrayList<GymHall> gymHalls = new ArrayList<>();
        ArrayList<ExercisePlan> exercisePlans = new ArrayList<>();
        System.out.println("Welcome To Our Gym System! \nChoose Your Option \n");
        System.out.println("1- Add Customer \n2- Add Trainer \n3- Add Equipment \n4- Add Gym Hall\n5- Add Exercise Plan \n6- Show All Customers \n7- Show all Trainers \n8- Show all Equipment \n9- Show Gym Halls \n10- Show Exercise Plans \n11- Remove Customer \n12- Remove Trainer \n13- Remove Equipment \n14- Remove Gym Hall \n15- Remove Exercise Plan \n0- Exit");
        System.out.println();
        System.out.println("======================================");
        System.out.println();
        Scanner in = new Scanner(System.in);
        int x;
        x = in.nextInt();
        while (x != 0) {
            switch (x) {
                case 1:
                    System.out.println("Enter Customer Name ");
                    String name = in.next();
                    System.out.println("Enter Customer Gender ");
                    String gend = in.next();
                    Person.Gender gender = null;
                    if (Objects.equals(gend, "Male") || Objects.equals(gend, "male") || Objects.equals(gend, "m") || Objects.equals(gend, "M")) {
                        gender = gender.Male;
                    }
                    if (Objects.equals(gend, "Female") || Objects.equals(gend, "female") || Objects.equals(gend, "f") || Objects.equals(gend, "F")) {
                        gender = gender.Female;
                    }
                    System.out.println("Enter Customer Age ");
                    int age = in.nextInt();
                    System.out.println("Enter Customer ID ");
                    int id = in.nextInt();
                    System.out.println("Enter Customer Address ");
                    String address = in.next();
                    System.out.println("Enter Customer Phone ");
                    String phone = in.next();
                    System.out.println("Enter Customer Email ");
                    String email = in.next();
                    Customers customer = new Customers(name , gender , age , id , address , phone , email);
                    System.out.println("Enter Name Or Number Of Gym Hall \n1- Hall A \n2- Hall B \n3- Hall c");
                    String s = in.next();
                    if (Objects.equals(s, "1")) {
                        s = "Hall A";
                    }
                    if (Objects.equals(s, "2")) {
                        s = "Hall B";
                    }
                    if (Objects.equals(s, "3")) {
                        s = "Hall c";
                    }
                    GymHall hl = new GymHall(s);
                    customer.setHall(hl);
                    System.out.println("Enter Name Or Number Of Trainer \n1- Magdy \n2- Fady \n3- Ramy");
                    String ss = in.next();
                    if (Objects.equals(ss, "1")) {
                        ss = "Magdy";
                    }
                    if (Objects.equals(ss, "2")) {
                        ss = "Fady";
                    }
                    if (Objects.equals(ss, "3")) {
                        ss = "Ramy";
                    }
                    Trainers tr = new Trainers();
                    tr.setName(ss);
                    System.out.println("Enter Name Or Number Of Exercise Plan \n1- Plan 1 \n2- Plan 2 \n3- Plan 3");
                    String sss = in.next();
                    if (Objects.equals(sss, "1")) {
                        sss = "Plan 1";
                    }
                    if (Objects.equals(sss, "2")) {
                        sss = "Plan 2";
                    }
                    if (Objects.equals(sss, "3")) {
                        sss = "Plan 3";
                    }
                    ExercisePlan ex = new ExercisePlan(sss);
                    customer.subscribe(hl, tr, ex, equipments);
                    customers.addCustomer(customer);
                    System.out.println("Customer Added Successfully!");
                    System.out.println();
                    System.out.println("======================================");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Enter Trainer Name ");
                    name = in.next();
                    System.out.println("Enter Customer Gender ");
                    String gendd = in.next();
                    Person.Gender gendder = null;
                    if (Objects.equals(gendd, "Male") || Objects.equals(gendd, "male") || Objects.equals(gendd, "m") || Objects.equals(gendd, "M")) {
                        gendder = gendder.Male;
                    }
                    if (Objects.equals(gendd, "Female") || Objects.equals(gendd, "female") || Objects.equals(gendd, "f") || Objects.equals(gendd, "F")) {
                        gendder = gendder.Female;
                    }
                    System.out.println("Enter Trainer Age ");
                    age = in.nextInt();
                    System.out.println("Enter Trainer ID ");
                    id = in.nextInt();
                    System.out.println("Enter Name Or Number Of Gym Hall \n1- Hall A \n2- Hall B \n3- Hall c");
                    String sa = in.next();
                    if (Objects.equals(sa, "1")) {
                        sa = "Hall A";
                    }
                    if (Objects.equals(sa, "2")) {
                        sa = "Hall B";
                    }
                    if (Objects.equals(sa, "3")) {
                        sa = "Hall c";
                    }
                    GymHall hll = new GymHall(sa);
                    System.out.println("Enter Name Or Number Of Exercise Plan \n1- Plan 1 \n2- Plan 2 \n3- Plan 3");
                    String ssss = in.next();
                    if (Objects.equals(ssss, "1")) {
                        ssss = "Plan 1";
                    }
                    if (Objects.equals(ssss, "2")) {
                        ssss = "Plan 2";
                    }
                    if (Objects.equals(ssss, "3")) {
                        ssss = "Plan 3";
                    }
                    ExercisePlan exx = new ExercisePlan(ssss);
                    Trainers trainer = new Trainers(name, gendder , age ,id, hll, exx);
                    trainers.addTrainer(trainer);
                    System.out.println("Trainer Added Successfully!");
                    System.out.println();
                    System.out.println("======================================");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter Equipment Name ");
                    name = in.next();
                    System.out.println("Enter Equipment ID ");
                    id = in.nextInt();
                    Equipments equipment = new Equipments(name, id);
                    equipments.addEquipment(equipment);
                    System.out.println("Equipment Added Successfully!");
                    System.out.println();
                    System.out.println("======================================");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Enter Gym Hall Name ");
                    name = in.next();
                    GymHall gymHall = new GymHall(name);
                    gymHalls.add(gymHall);
                    System.out.println("Gym Hall Added Successfully!");
                    System.out.println();
                    System.out.println("======================================");
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Enter Exercise Plan ID:");
                    String planID = in.next();
                    System.out.println("Enter Trainer Name:");
                    String trna = in.next();
                    System.out.println("Enter Equipment Name:");
                    String eqna = in.next();
                    System.out.println("Enter duration Name:");
                    String duration = in.next();
                    ExercisePlan newPlan = new ExercisePlan(planID, trna, eqna, duration);
                    exercisePlans.add(newPlan);
                    System.out.println("Exercise Plan Added Successfully!");
                    System.out.println();
                    System.out.println("======================================");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("All Customers:");
                    customers.ShowAllCustomers();
                    break;
                case 7:
                    System.out.println("All Trainers:");
                    trainers.ShowAllTrainer();
                    break;
                case 8:
                    System.out.println("All Equipment:");
                    equipments.ShowAllEquipments();
                    break;
                case 9:
                    System.out.println("All Gym Halls:");
                    for (GymHall hall : gymHalls) {
                        System.out.println("Gym Hall Name: " + hall.getName());
                        System.out.println("Equipment in Gym Hall:");
                        for (Equipments eq : hall.getEquipments()) {
                            eq.ShowData();
                        }
                        System.out.println();
                    }
                    break;
                case 10:
                    System.out.println("All Exercise Plans:");
                    for (ExercisePlan plan : exercisePlans) {
                        System.out.println("Plan ID: " + plan.getPlanID());
                        System.out.println("Trainer Name: " + plan.getTrainerID());
                        System.out.println("Equipment Name: " + plan.getEquipmentID());
                        System.out.println("Duration: " + plan.getDuration());
                        System.out.println();
                    }
                    break;
                case 11:
                    System.out.println("Enter Customer ID to Remove ");
                    id = in.nextInt();
                    Customers removeCustomer = null;
                    for (Customers c : customers.getCustomersList()) {
                        if (c.getCustomer_id() == id) {
                            removeCustomer = c;
                            break;
                        }
                    }
                    if (removeCustomer != null) {
                        customers.RemoveCustomer(removeCustomer);
                        System.out.println("Customer Removed Successfully!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    else {
                        System.out.println("Customer Not Found!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    break;
                case 12:
                    System.out.println("Enter Trainer ID to Remove ");
                    id = in.nextInt();
                    Trainers removeTrainer = null;
                    for (Trainers t : trainers.getTrainersList()) {
                        if (t.getTrainer_id() == id) {
                            removeTrainer = t;
                            break;
                        }
                    }
                    if (removeTrainer != null) {
                        trainers.RemoveTrainer(removeTrainer);
                        System.out.println("Trainer Removed Successfully!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    else {
                        System.out.println("Trainer Not Found!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    break;
                case 13:
                    System.out.println("Enter Equipment ID to Remove ");
                    id = in.nextInt();
                    Equipments removeEquipment = null;
                    for (Equipments eq : equipments.getEquipmentsList()) {
                        if (eq.getEquipment_id() == id) {
                            removeEquipment = eq;
                            break;
                        }
                    }
                    if (removeEquipment != null) {
                        equipments.RemoveEquipment(removeEquipment);
                        System.out.println("Equipment Removed Successfully!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    else {
                        System.out.println("Equipment Not Found!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    break;
                case 14:
                    System.out.println("Enter Gym Hall Name to Remove ");
                    name = in.next();
                    GymHall removeHall = null;
                    for (GymHall hall : gymHalls) {
                        if (hall.getName().equals(name)) {
                            removeHall = hall;
                            break;
                        }
                    }
                    if (removeHall != null) {
                        gymHalls.remove(removeHall);
                        System.out.println("Gym Hall Removed Successfully!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    else {
                        System.out.println("Gym Hall Not Found!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    break;
                case 15:
                    System.out.println("Enter Exercise Plan ID to Remove ");
                    String idd = in.next();
                    ExercisePlan removePlan = null;
                    for (ExercisePlan plan : exercisePlans) {
                        if (Objects.equals(plan.getPlanID(), idd)) {
                            removePlan = plan;
                            break;
                        }
                    }
                    if (removePlan != null) {
                        exercisePlans.remove(removePlan);
                        System.out.println("Exercise Plan Removed Successfully!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    else {
                        System.out.println("Exercise Plan Not Found!");
                        System.out.println();
                        System.out.println("======================================");
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Invalid Option! Please try again.");
                    System.out.println();
                    System.out.println("======================================");
                    System.out.println();
            }
            System.out.println("Choose Your Option: ");
            System.out.println("1- Add Customer \n2- Add Trainer \n3- Add Equipment \n4- Add Gym Hall\n5- Add Exercise Plan \n6- Show All Customers \n7- Show all Trainers \n8- Show all Equipment \n9- Show Gym Halls \n10- Show Exercise Plans \n11- Remove Customer \n12- Remove Trainer \n13- Remove Equipment \n14- Remove Gym Hall \n15- Remove Exercise Plan \n0- Exit");
            System.out.println();
            System.out.println("======================================");
            System.out.println();
            x = in.nextInt();
        }
        System.out.println("Exiting System. Goodbye!");
    }
}