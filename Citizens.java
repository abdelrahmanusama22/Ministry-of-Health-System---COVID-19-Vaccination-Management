package m251Abdelrahman_Usama_2051710528;
import java.util.ArrayList;

public class Citizens extends Person implements Comparable<Citizens>{

    private String Address;
    private String numberphone;
    private int Age;
    private ArrayList<Dose> doses;

    public Citizens(int kp, String n, String add, String num, int ag) {
        super(kp, n);
        Address = add;
        numberphone = num;
        Age = ag;
        doses = new ArrayList<>();
    }

    public Citizens(int cid, String n, String ad, String ph) {
        this(cid, n, ad,ph, 16);
    }


    public Citizens() {
        this(0, null, null,null,0);
    }

    public String getAddress()  //address’getter
    {
        return Address;
    }

    public void setAddress(String add) //address’setter
    {
        Address = add;
    }

    public String getPhoneNumber()// phnoenumber’getter
    {
        return numberphone;
    }

    public void setPhoneNumber(String num) //phnoenumber’setter
    {
        numberphone = num;
    }

    public int getAge() //age’getter
    {
        return Age;
    }

    public void setAge(int ag) //age’setter
    {
        Age = ag;
    }

    public ArrayList<Dose> getDoses() //dose’getter
    {
        return doses;
    }

    public void setDoses(ArrayList<Dose> doses) //dose’setter
    {
        this.doses = doses;
    }

    @Override
    public String toString() {
        String X = "";
        if(!doses.isEmpty()) {
            X = "Citizen " + super.toString() + ","+"Address: " + Address + ","+" PhoneNumber: " + numberphone + ","+" age: " + Age
             + ","+"Doses : \n";
            for (Dose D : doses)
                X += D + "\n";
        }
        else {
            X+= "No doses!!!";
        }
        return X;
    }


    @Override
    public int compareTo(Citizens o) {
        if(getCivilId() > o.getCivilId())
            return 1;
        else if(getCivilId() < o.getCivilId())
            return -1;
        else
            return 0;

    }


    public boolean equals(Object o)
    {
        Citizens c = (Citizens) o;
        return c.getCivilId() == getCivilId() ;
    }
}
