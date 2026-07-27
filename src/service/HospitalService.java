package service;

import model.Hospital;

public class HospitalService {

    public void contactHospital(Hospital hospital) {

        System.out.println("Nearest Hospital Selected");
        hospital.displayHospitalInfo();

    }

}
