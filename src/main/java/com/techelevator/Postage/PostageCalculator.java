package com.techelevator.Postage;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PostageCalculator {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the weight of the package? ");

        double weightInput = Double.parseDouble(myScanner.nextLine());

        System.out.println("(P)ounds or (O)unces? ");

        String unitInput = myScanner.nextLine().toLowerCase();
        if(unitInput.equals("p") || unitInput.equals("pounds")) {
            weightInput = (weightInput/16);
        }

        List <DeliveryDriver> deliverDrivers = new ArrayList<>();
        FirstClass firstClass = new FirstClass();
        SecondClass secondClass = new SecondClass();
        ThirdClass thirdClass = new ThirdClass();
        FexEd fexEd = new FexEd();
        NextDaySPU nextDaySPU = new NextDaySPU();
        TwoDaySPU twoDaySPU = new TwoDaySPU();
        FourDaySPU fourDaySPU = new FourDaySPU();

        deliverDrivers.add(firstClass);
        deliverDrivers.add(secondClass);
        deliverDrivers.add(thirdClass);
        deliverDrivers.add(fexEd);
        deliverDrivers.add(nextDaySPU);
        deliverDrivers.add(twoDaySPU);
        deliverDrivers.add(fourDaySPU);


















    }
}
