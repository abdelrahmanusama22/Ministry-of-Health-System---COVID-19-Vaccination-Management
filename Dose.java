package m251Abdelrahman_Usama_2051710528;
public class Dose {
    //For each dose, the following information should be stored: manufacturer, when and where
    //has been taken, and information about the health professional who gave it

    private String Manufacturer;
    private String Time;
    private String Location;
    private HealthProfessional staffMember;

    public Dose(String man, String tim, String location, HealthProfessional nummem) {
        Manufacturer = man;
        Time = tim;
        Location = location;
        staffMember = nummem;
    }

    public Dose(String t, String p) {
        this("phizer",t,p,new HealthProfessional("Ahmed" ));

    }


    public Dose() {
        this(null,null,null,null);
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String man) {
        Manufacturer = man;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String tim ){
        Time = tim;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String place) {
        Location = place;
    }

    public HealthProfessional getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(mem) {
        staffMember = mem;
    }

    @Override
    public String toString() {
        return "\t-Dose :-" + Manufacturer + ","+" Time:- " + Time + ","+" Place:- " + Location +
                ","+" by :-  " + staffMember.getName() ;
    }
}
