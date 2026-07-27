package model;

public class EmergencyContact {

    private String name;
    private String relationship;
    private String phone;

    public EmergencyContact(String name,
                            String relationship,
                            String phone) {

        this.name = name;
        this.relationship = relationship;
        this.phone = phone;
    }

    public void notifyContact() {

        System.out.println("Emergency notification sent to " + name);

    }

}
