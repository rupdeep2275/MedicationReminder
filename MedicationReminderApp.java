import java.time.LocalTime;

public class MedicationReminderApp {
    public static void main(String[] args) {
        Medication medication = new Medication("Medicine A", 1, 3, LocalTime.of(9, 0));

        // Simulation for a reminder for medication time
        LocalTime currentTime = LocalTime.now();
        if (currentTime.equals(medication.getTime())) {
            remindMedication(medication);
        }
    }

    public static void remindMedication(Medication medication) {
        System.out.println("Reminder: It's time to take " + medication.getName());
        // We can implement reminder logic here, such as sending a push notification or displaying an alert
    }
}