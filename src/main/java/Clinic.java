import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Clinic extends AbstractClinic {

    private final Deque<Patient> radiologyQueue = new ArrayDeque<>();
    private final Deque<Patient> doctorQueue = new ArrayDeque<>();

    private final TriageType doctorTriageType;
    private final TriageType radiologyTriageType;


    public Clinic(TriageType doctorType, TriageType radiologyType) {
        this.doctorTriageType = doctorType;
        this.radiologyTriageType = radiologyType;
    }

    @Override
    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom) {
        super.triagePatient(name, gravity, visibleSymptom);

        Patient patient = new Patient(visibleSymptom, name);
        if (doctorTriageType.equals(TriageType.GRAVITY) && gravity > 5) {
            doctorQueue.addFirst(patient);
        } else {
            doctorQueue.addLast(patient);
        }

        if (visibleSymptom.DoesRequireRadiology()) {
            if (radiologyTriageType.equals(TriageType.GRAVITY) && gravity > 5) {
                radiologyQueue.addFirst(patient);
            } else {
                radiologyQueue.addLast(patient);
            }
        }
    }

    public boolean isFirstInDoctorQueue(Patient patient){
        return doctorQueue.remove() == patient;
    }

    public boolean isEmpty(){
        return doctorQueue.isEmpty() && radiologyQueue.isEmpty();
    }

    public boolean isDoctorQueueEmpty() {
        return doctorQueue.isEmpty();
    }

    public boolean isRadiologyQueueEmpty() {
        return radiologyQueue.isEmpty();
    }

    public Patient peekDoctorQueue() {
        return doctorQueue.peek();
    }

    public Patient peekRadiologyQueue() {
        return radiologyQueue.peek();
    }
}
