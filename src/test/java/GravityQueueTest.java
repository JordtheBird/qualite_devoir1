/*
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GravityQueueTest {
    private static final String PATIENT_NAME = "Michael Jackson (yarchie)";
    private static final String SECOND_PATIENT_NAME = "John Mc Cormick";
    private static final VisibleSymptom PATIENT_DEFAULT_SYMPTOM = VisibleSymptom.OVERDOSE;
    private static final int LOW_GRAVITY = 0;
    private static final int HIGH_GRAVITY = 10;

    @Test
    public void populatedGravityQueue_priorityPatient_ShouldBePlacedFirst(){
        Queue queue = new GravityQueue();
        Patient patient1 = new Patient(PATIENT_DEFAULT_SYMPTOM,PATIENT_NAME, LOW_GRAVITY);
        Patient patient2 = new Patient(PATIENT_DEFAULT_SYMPTOM,SECOND_PATIENT_NAME, HIGH_GRAVITY);

        queue.add(patient1);
        queue.add(patient2);

        Patient firstRemovedPatient = queue.remove();
        Patient secondRemovedPatient = queue.remove();

        assertEquals(patient2, firstRemovedPatient);
        assertEquals(patient1, secondRemovedPatient);
    }
}
*/
