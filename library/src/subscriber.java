public class subscriber {
    private int id;
    private String type;
    private String name;
    private String address;
    private String phone;
    private String email;
    private double balance;
    public subscriber(int id) {
        this.id = id;
        this.balance = 0.0;
    }
    public subscriber(int id, String type) {
        this.id = id;
        this.type = type;
        this.balance = 0.0;
    }
    public subscriber(int id, String type, String name) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.balance = 0.0;
    }
    public subscriber(int id, String type, String name, String address) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.address = address;
        this.balance = 0.0;
    }
    public subscriber(int id, String type, String name, String address, String phone) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.balance = 0.0;
    }
    public subscriber(int id, String type, String name, String address, String phone, String email) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.balance = 0.0;
    }
    public subscriber(int id, String type, String name, String address, String phone, String email , int money) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.balance = money;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
