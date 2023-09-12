import org.junit.Test;

import static org.junit.Assert.*;

public class ClinicTest {

    private static String PATIENT_NAME = "JohnyBoy";
    private static String SECOND_PATIENT_NAME = "GabrielJeanson";

    @Test
    public void clinicWithoutPatient_shoudBeEmpty(){
        Clinic clinic = new Clinic(TriageType.FIFO, TriageType.FIFO);

        assertTrue(clinic.isEmpty());
    }

    @Test
    public void clinicWithPatients_shoudNotBeEmpty(){
        Clinic clinic = new Clinic(TriageType.FIFO, TriageType.FIFO);
        clinic.triagePatient(PATIENT_NAME, 4, VisibleSymptom.MIGRAINE);

        assertFalse(clinic.isEmpty());
    }

    @Test
    public void emptyClinic_whenNewPatientWithMigraine_patientInGeneralAdmission() {
        Clinic clinic = new Clinic(TriageType.FIFO, TriageType.FIFO);
        clinic.triagePatient(PATIENT_NAME, 4, VisibleSymptom.MIGRAINE);

        assertFalse(clinic.isDoctorQueueEmpty());
        assertTrue(clinic.isRadiologyQueueEmpty());
    }

    @Test
    public void emptyClinic_whenNewPatientWithSprain_patientIsFirstInGeneralAdmissionAndRadiology() {
        Clinic clinic = new Clinic(TriageType.FIFO, TriageType.FIFO);
        clinic.triagePatient(PATIENT_NAME, 4, VisibleSymptom.SPRAIN);

        assertEquals(PATIENT_NAME, clinic.peekDoctorQueue().getName());
        assertEquals(PATIENT_NAME, clinic.peekRadiologyQueue().getName());
    }

    @Test
    public void emptyClinic_patientWithBrokenBone_patientIsFirstInGeneralAdmissionAndRadiology(){
        Clinic clinic = new Clinic(TriageType.FIFO, TriageType.FIFO);
        clinic.triagePatient(PATIENT_NAME, 4, VisibleSymptom.BROKEN_BONE);

        assertEquals(PATIENT_NAME, clinic.peekDoctorQueue().getName());
        assertEquals(PATIENT_NAME, clinic.peekRadiologyQueue().getName());
    }
}
