package model;

public class Person {

    private String id;
    private String name;
    private int age;
    private String phoneNumber;
    private String bloodGroup;

    public Person(String id, String name, int age,
                  String phoneNumber, String bloodGroup) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.bloodGroup = bloodGroup;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void displayInfo() {
        System.out.println("ID          : " + id);
        System.out.println("Name        : " + name);
        System.out.println("Age         : " + age);
        System.out.println("Phone       : " + phoneNumber);
        System.out.println("Blood Group : " + bloodGroup);
    }
}
