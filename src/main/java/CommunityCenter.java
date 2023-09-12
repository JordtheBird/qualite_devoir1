import java.util.ArrayDeque;
import java.util.Deque;

public class CommunityCenter extends AbstractClinic {
    private final Deque<Patient> patientDeque = new ArrayDeque<>();
    private final TriageType triageType;

    public CommunityCenter(TriageType triageType) {
        this.triageType = triageType;
    }

    public void triagePatient(String name, int gravity) {
        super.triagePatient(name, gravity);
        Patient patient = new Patient(name);
        if (triageType.equals(TriageType.GRAVITY) && gravity > 5) {
            patientDeque.addFirst(patient);
        } else {
            patientDeque.addLast(patient);
        }
    }
}
