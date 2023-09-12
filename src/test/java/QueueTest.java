/*
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    private static final String PATIENT_NAME = "Michael Jackson (yarchie)";
    private static final String SECOND_PATIENT_NAME = "John Mc Cormick";
    private static final VisibleSymptom PATIENT_DEFAULT_SYMPTOM = VisibleSymptom.OVERDOSE;
    private static final int GRAVITY = 0;


    @Test
    public void newQueue_shouldBeEmpty(){
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void emptyQueue_add_shouldNotBeEmpty(){
        Queue queue = new Queue();
        Patient patient = new Patient(PATIENT_DEFAULT_SYMPTOM, PATIENT_NAME, GRAVITY);

        queue.add(patient);

        assertFalse(queue.isEmpty());
    }

    @Test
    public void populatedQueue_remove_shouldReturnAndRemoveFirstElement(){
        Queue queue = new Queue();
        Patient patient = new Patient(PATIENT_DEFAULT_SYMPTOM, PATIENT_NAME, GRAVITY);

        queue.add(patient);
        Patient retrievedPatient = queue.remove();

        assertEquals(patient, retrievedPatient);
        assertTrue(queue.isEmpty());
    }

    @Test
    public void populatedQueue_peek_shouldReturnFirstElement(){
        Queue queue = new Queue();
        Patient patient = new Patient(PATIENT_DEFAULT_SYMPTOM, PATIENT_NAME, GRAVITY);

        queue.add(patient);
        Patient retrievedPatient = queue.peek();

        assertEquals(patient, retrievedPatient);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void populatedQueue_removeRemainingElement_shouldBeEmpty(){
        Queue queue = new Queue();
        Patient patient = new Patient(PATIENT_DEFAULT_SYMPTOM, PATIENT_NAME, GRAVITY);

        queue.add(patient);
        queue.remove();

        assertTrue(queue.isEmpty());
    }

    @Test
    public void populatedGravityQueue_priorityPatient_ShouldBePlacedFirst(){
        Queue queue = new Queue();
        Patient patient = new Patient(PATIENT_DEFAULT_SYMPTOM,PATIENT_NAME, 3);
        Patient patient2 = new Patient(PATIENT_DEFAULT_SYMPTOM,SECOND_PATIENT_NAME, 6);

        queue.add(patient);
        queue.add(patient2);

        queue.pushFront(patient2);

        assertEquals(patient2, queue.peek());
    }

    @Test
    public void emptyQueue_whenRemove_throwsException() {
        Queue queue = new Queue();

        assertThrows(EmptyQueueException.class, queue::remove);
    }

}
*/
