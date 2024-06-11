package m251Abdelrahman_Usama_2051710528;
public abstract class Person {
    //variables
    private int civilId;
    private String name;
    //Two arguments Constructor
    public Person(int h, String nam) {
        civilId = h;
        name = nam;
    }
    //One argument Constructor
    public Person(String nam) {
        this(0,nam);
    }

    public Person() {
        this(0,null);
    }
//accessor
    public int getCivilId() {
        return civilId;
    }
    public String getName() {
        return name;
    }


    public void setCivilId(int cid) {
        civilId = cid;
    }
    public void setName(String n) {
        name = n;
    }

    @Override
    public String toString() {
        return "-ID: " + civilId + ", The Name : " + name;
    }
}
