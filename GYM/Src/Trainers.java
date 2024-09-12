import java.util.ArrayList;

public class Trainers extends Person {
    private int trainer_id;
    private final int workingHours = 8;
    private GymHall hall;
    private ExercisePlan exercisePlan;
    private ArrayList<Trainers> trainers;
    public Trainers () {
        super("Inavild name");
        trainer_id = 000;
        trainers = new ArrayList<>();
    }
    public Trainers (String name) {
        super(name);
        trainer_id = 000;
        trainers = new ArrayList<>();
    }
    public Trainers (String name , Gender gender) {
        super(name,gender);
        trainer_id = 000;
        trainers = new ArrayList<>();
    }
    public Trainers (String name , Gender gender , int age) {
        super(name,gender,age);
        trainer_id = 000;
        trainers = new ArrayList<>();
    }
    public Trainers (String name , Gender gender , int age , int id) {
        super(name,gender,age);
        trainer_id = id;
        trainers = new ArrayList<>();
    }
    public Trainers (String name , Gender gender , int age , int id , GymHall hall ) {
        super(name,gender,age);
        this.hall = hall;
        trainer_id = id;
        trainers = new ArrayList<>();
    }
    public Trainers (String name , Gender gender , int age , int id , GymHall hall , ExercisePlan exercisePlan ) {
        super(name,gender,age);
        this.hall = hall;
        trainer_id = id;
        this.exercisePlan = exercisePlan;
        trainers = new ArrayList<>();
    }
    public void setTrainer_id (int id) {
        trainer_id = id;
    }
    public int getTrainer_id () {
        return trainer_id;
    }
    public void submitEGymHall(GymHall hall) {
        this.hall = hall;
    }
    public void submitExercisePlan(ExercisePlan plan) {
        this.exercisePlan = plan;
    }
    public int getWorkingHours() {
        return workingHours;
    }
    public GymHall getHall() {
        return hall;
    }
    public ExercisePlan getExercisePlan() {
        return exercisePlan;
    }
    public void addTrainer(Trainers t1) {
        if (trainers != null && t1 != null) {
            trainers.add(t1);
        }
    }
    public void RemoveTrainer(Trainers t1) {
        if (trainers != null && t1 != null) {
            trainers.remove(t1);
        }
    }
    public void ShowAllTrainer() {
        if (trainers != null) {
            for (Trainers x : trainers) {
                x.ShowData();
            }
        }
    }
    public ArrayList<Trainers> getTrainersList() {
        return trainers;
    }
    @Override
    public String toString() {
        return getName();
    }
    public void ShowData () {
        System.out.print("Trainer ");
        super.ShowDate();
        System.out.println("Trainer ID is : " + trainer_id);
        System.out.println("Trainre Working Hours is : " + workingHours);
        System.out.println("Tranier Hall is : " + hall);
        System.out.println("Tranier Exercise Plan is : " + exercisePlan);
        System.out.println();
        System.out.println("======================================");
        System.out.println();
    }
}