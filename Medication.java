import java.time.LocalTime;

public class Medication {
    private String name;
    private int dosage;
    private int frequency;
    private LocalTime time;

    public Medication(String name, int dosage, int frequency, LocalTime time) {
        this.name = name;
        this.dosage = dosage;
        this.frequency = frequency;
        this.time = time;
    }

    // Getter methods for the medication details
    public String getName() {
        return name;
    }

    public int getDosage() {
        return dosage;
    }

    public int getFrequency() {
        return frequency;
    }

    public LocalTime getTime() {
        return time;
    }
}