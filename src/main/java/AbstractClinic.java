public abstract class AbstractClinic {

    public AbstractClinic(){}

    public void triagePatient(String name, int gravity, VisibleSymptom visibleSymptom){
        if(visibleSymptom.equals(VisibleSymptom.CORONAVIRUS)){
            throw new IllegalArgumentException("Awaye a maison!");
        }

    }
}
