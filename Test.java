package m251Abdelrahman_Usama_2051710528;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //Test HealthProfessional class
        HealthProfessional f1 = new HealthProfessional(1580, "Abdelrahman" , 2);// Doctor1
        HealthProfessional f2 = new HealthProfessional(1474, "yousef" , 6);// Doctor2
        HealthProfessional f3 = new HealthProfessional(8000, "sheref" , 4);// Doctor3
        HealthProfessional f4 = new HealthProfessional(951, "Ashraf" , 1);// Doctor4
        HealthProfessional f5 = new HealthProfessional(753, "Fady" , 7);// Doctor5
        HealthProfessional f6 = new HealthProfessional(315, "Ziad" , 12);// Doctor6
        //Test setter getter
        System.out.println(f6.getName());
        f4.setCivilId(2440);
        f3.setExperience(3);

        // Test to string
        System.out.println(f4.toString());
        System.out.println(f5.toString());
        System.out.println(f1.toString());
        System.out.println(f3.toString());
        System.out.println(f6.toString());
        System.out.println(f2.toString());



        //Create Doses
        Dose d1 = new Dose("Pfizer" , "1/9/2021" , "AOU_Clinic" , f1);
        Dose d2 = new Dose("AstraZeneca" , "19/9/2021" , "Alex_Clinic" , f2);
        Dose d3 = new Dose("Sinovac" , "6/11/2021" , "Siuz_Clinic" , f3);
        Dose d4 = new Dose("sinopharm" , "18/11/2021" , "BUC_Clinic" , f4);
        Dose d5 = new Dose("Johnson" , "21/3/2022" , "GUC_Clinic" , f1);
        Dose d6 = new Dose("sinovac" , "12/2/2022" , "AUC_Clinic" , f5);

//toString Doses
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        d1.setManufacturer("ABC");
        d3.setLocation("PlaceNew");
        d4.setLocation("9-9-2009");
        System.out.println(d1);
        System.out.println(d3);
        System.out.println(d4);
//Test Citizen
        Citizens k = new Citizens(159 , "fares" , " Alexandria", "01065314789",32 );
        Citizens k2 = new Citizens(357 , "Nadr" , "cairo", "01135684269" ,26);
        Citizens k3 = new Citizens(147 , "Nada" , "suez", "01548632167" ,24);
        Citizens k4 = new Citizens(258 , "mohab" , "tanta", "01232891278",43);
        Citizens k5 = new Citizens(369 , "hesham" , "manya", "010039176482",65);
        Citizens k6 = new Citizens(741 , "moaz" , "aswan", "01285245637" , 46);
        Citizens k7 = new Citizens(852 , "marwan" , "sinia", "01198267415" , 62);
        Citizens k8 = new Citizens(963 , "kotp" , "matroh", "010003698254" , 75);
        Citizens k9 = new Citizens(342 , "reem" , "redsea", "01118629357" , 23);
        Citizens k10 = new Citizens(768 , "aya" , "portsaid", "01222364928" ,18);


        System.out.println(k3);
        System.out.println(k5);
        System.out.println(k7);
        System.out.println(k4);
        System.out.println(k8);
        System.out.println(k10);

//Add citizen

        main.addlist(k);
        main.addlist(k2);
        main.addlist(k3);
        main.addlist(k4);
        main.addlist(k5);
        main.addlist(k6);
        main.addlist(k7);
        main.addlist(k8);
        main.addlist(k9);


        //Add doses to citizens

        main.addDoses(k,d3);
        main.addDoses(k3,d5);
        main.addDoses(k5,d6);
        main.addDoses(k7,d1);
        main.addDoses(k9,d5);
        main.addDoses(k10,d4);
        main.addDoses(k2,d2);
        main.addDoses(k4,d3);
        main.addDoses(k6,d4);
        main.addDoses(k8,d5);
        main.addDoses(k10,d6);
        main.addDoses(k,d3);
        main.addDoses(k3,d2);
        main.addDoses(k5,d1);

        main.fullyVaccinatedPersons();


        main.displayData();
        Collections.sort(main.citizens);
        main.displayData();

        main.saveTofile();

    }
}
