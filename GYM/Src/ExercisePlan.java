import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class ExercisePlan {
    private String plan_id;
    private String trainer_id;
    private String equipment_id;
    private String duration;

    public ExercisePlan(String plan_num) {
        this.plan_id = plan_num;
    }

    public ExercisePlan(String plan_num,  String trainer_name) {
        this.plan_id = plan_num;
        this.trainer_id = trainer_name;
    }

    public ExercisePlan(String plan_num, String trainer_name, String equipment_name) {
        this.plan_id = plan_num;
        this.trainer_id = trainer_name;
        this.equipment_id = equipment_name;
    }

    public ExercisePlan(String plan_num,  String trainer_name, String equipment_name, String duration) {
        this.plan_id = plan_num;
        this.trainer_id = trainer_name;
        this.equipment_id = equipment_name;
        this.duration = duration;
    }

    // Add getter methods
    public String getPlanID() {
        return plan_id;
    }

    public String getTrainerID() {
        return trainer_id;
    }

    public String getEquipmentID() {
        return equipment_id;
    }

    public String getDuration() {
        return duration;
    }
    @Override
    public String toString() {
        return getPlanID();
    }
}

