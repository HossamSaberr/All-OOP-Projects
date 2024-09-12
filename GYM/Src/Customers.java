import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
public class Customers extends Person {
    private int customer_id;
    private String address;
    private String phone;
    private String email;
    private Date subscriptionStart;
    private GymHall hall;
    private Trainers trainer;
    private ExercisePlan exercisePlan;
    Equipments equipments;
    private final int subscriptionDuration = 30;
    private ArrayList<Customers> customers;

    public Customers() {
        super("Invalid name");
        customer_id = 000;
        address = "Invalid address";
        phone = "Invalid phone";
        email = "Invalid email";
        customers = new ArrayList<>();
    }

    public Customers(String name) {
        super(name);
        customer_id = 000;
        address = "Invalid address";
        phone = "Invalid phone";
        email = "Invalid email";
        customers = new ArrayList<>();
    }

    public Customers(String name , Gender gender) {
        super(name,gender);
        customer_id = 000;
        address = "Invalid address";
        phone = "Invalid phone";
        email = "Invalid email";
        customers = new ArrayList<>();
    }
    public Customers(String name , Gender gender , int age) {
        super(name,gender,age);
        customer_id = 000;
        address = "Invalid address";
        phone = "Invalid phone";
        email = "Invalid email";
        customers = new ArrayList<>();
    }

    public Customers(String name, Gender gender , int age , int id) {
        super(name,gender,age);
        customer_id = id;
        address = "Invalid address";
        phone = "Invalid phone";
        email = "Invalid email";
        customers = new ArrayList<>();
    }

    public Customers(String name, Gender gender , int age , int id, String address) {
        super(name,gender,age);
        customer_id = id;
        this.address = address;
        phone = "Invalid phone";
        email = "Invalid email";
        customers = new ArrayList<>();
    }

    public Customers(String name, Gender gender , int age , int id, String address, String phone) {
        super(name,gender,age);
        customer_id = id;
        this.address = address;
        this.phone = phone;
        email = "Invalid email";
        customers = new ArrayList<>();
    }

    public Customers(String name, Gender gender , int age , int id, String address, String phone, String email) {
        super(name,gender,age);
        customer_id = id;
        this.address = address;
        this.phone = phone;
        this.email = email;
        customers = new ArrayList<>();
    }

    public void subscribe(GymHall hall, Trainers trainer, ExercisePlan exercisePlan, Equipments equipments) {
        this.subscriptionStart = new Date();
        this.hall = hall;
        this.trainer = trainer;
        this.exercisePlan = exercisePlan;
        this.equipments = equipments;
    }

    public void addCustomer(Customers c1) {
        if (customers != null && c1 != null) {
            customers.add(c1);
        }
    }

    public void RemoveCustomer(Customers c1) {
        if (customers != null && c1 != null) {
            customers.remove(c1);
        }
    }

    public void ShowAllCustomers() {
        if (customers != null) {
            for (Customers x : customers) {
                x.ShowData();
            }
        }
    }

    public void setCustomer_id(int id) {
        customer_id = id;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubscriptionStart(Date subscriptionStart) {
        this.subscriptionStart = subscriptionStart;
    }

    public void setHall(GymHall hall) {
        this.hall = hall;
    }

    public void setTrainer(Trainers trainer) {
        this.trainer = trainer;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public ArrayList<Customers> getCustomersList() {
        return customers;
    }

    public Date getSubscriptionStart() {
        return subscriptionStart;
    }

    public Date getSubscriptionEnd() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(subscriptionStart);
        cal.add(Calendar.DAY_OF_MONTH, subscriptionDuration);
        return cal.getTime();
    }

    public GymHall getHall() {
        return hall;
    }

    public Trainers getTrainer() {
        return trainer;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name;
    }

    public void ShowData() {
        System.out.print("Customer ");
        super.ShowDate();
        System.out.println("Customer ID is : " + customer_id);
        System.out.println("Customer Address is : " + address);
        System.out.println("Customer Phone is : " + phone);
        System.out.println("Customer Email is : " + email);
        System.out.println("Customer Hall is : " + hall);
        System.out.println("Customer Trainer is : " + trainer);
        System.out.println("Customer Exercise Plan is : " + exercisePlan);
        System.out.println("Customer Subscription Day is : " + subscriptionStart);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
    }
}