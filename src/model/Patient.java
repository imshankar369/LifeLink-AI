package model;

public class Patient extends Person {

    private String patientId;
    private String medicalCondition;
    private boolean conscious;

    public Patient(String id, String name, int age,
                   String phoneNumber, String bloodGroup,
                   String patientId,
                   String medicalCondition,
                   boolean conscious) {

        super(id, name, age, phoneNumber, bloodGroup);

        this.patientId = patientId;
        this.medicalCondition = medicalCondition;
        this.conscious = conscious;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public boolean isConscious() {
        return conscious;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Patient ID : " + patientId);
        System.out.println("Condition  : " + medicalCondition);
        System.out.println("Conscious  : " + conscious);
    }
}
