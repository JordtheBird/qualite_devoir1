public class Patient {

    public Patient(VisibleSymptom visibleSymptom, String name){
        this.name = name;
        this.visibleSymptom = visibleSymptom;
    }

    public Patient(String name){
        this.name = name;
    }

    private VisibleSymptom visibleSymptom;
    private String name;

    public String getName() {
        return name;
    }

    public VisibleSymptom getVisibleSymptom() {
        return visibleSymptom;
    }
}
