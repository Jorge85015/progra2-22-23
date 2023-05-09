package com.progra.washingmachine.test;

import com.progra.washingmachine.main.*;

public class WashingMachineTest {
    public static void main(String[] args) {
        WashingMachineMX washingMachine;

        washingMachine = new WashingMachineMX1();
        System.out.println("Washing machine MX1");
        manipulate(washingMachine);

        washingMachine = new WashingMachineMX2();
        System.out.println("Washing machine MX2");
        manipulate(washingMachine);

        washingMachine = new WashingMachineMX3Deluxe();
        System.out.println("Washing machine MX3 Deluxe");
        manipulate(washingMachine);
    }

    private static void manipulate(WashingMachineMX washingMachine) {
        washingMachine.setProgram();
        washingMachine.infoProgram();
        washingMachine.start();
    }
}
