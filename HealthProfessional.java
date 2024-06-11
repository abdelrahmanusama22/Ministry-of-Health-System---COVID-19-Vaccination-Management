package m251Abdelrahman_Usama_2051710528;
public class HealthProfessional extends Person{
    //This class

    private int experience;

    public HealthProfessional(int kp, String n, int exp) {
        super(kp, n);
        experience = exp;
    }
    public HealthProfessional( String n, int exp) {
        super(0, n);
        experience = exp;
    }
    public HealthProfessional( String n) {
        super(0, n);
        experience = 0;
    }
    public HealthProfessional() {
        this(0,null,0);
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int op) {
        experience = op;
    }

    @Override
    public String toString() {
        return "Professional " +super.toString() + " ,number years of experience: " + experience;
    }
}
