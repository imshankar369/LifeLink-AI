package service;

import model.PoliceStation;

public class PoliceService {

    public void notifyPolice(PoliceStation policeStation) {

        System.out.println("Police Station Notified");
        policeStation.alertPolice();

    }

}
