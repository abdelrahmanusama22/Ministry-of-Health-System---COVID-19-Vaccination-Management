package m251Abdelrahman_Usama_2051710528;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class main {

    public static ArrayList<Citizens> citizens = new ArrayList<>();//ArrayList
    public static void addlist(Citizens c)//method to add citizen
    {
        if(citizens.contains(c))
            System.out.println("National ID: " + c.getCivilId() + " Already Added ");
        else{
            citizens.add(c);
            System.out.println("National ID: " + c.getCivilId() + " Successful addition");
        }
    }

    public static void removeCitizen(Citizens c)
    {
        if(!citizens.contains(c))
            System.out.println("National ID: " + c.getCivilId() + " is not in list");
        else{
            citizens.remove(c);
            System.out.println("National ID: " + c.getCivilId() + " Successfully deleted");
        }
    }


public static void addDoses(Citizens c , Dose d)//Add doses to Citizens
{
    if(!citizens.contains(c))//If the item is not in the list
        System.out.println("Citizen is not in list, add him before");
    else {
        if(c.getDoses().size() < 3)//If the ingredient is less than three doses 
        {
            c.getDoses().add(d);
            System.out.println( "National ID "+c.getCivilId()+ "  finish: " + c.getDoses().size() + " dose");
        }
        else
            System.out.println("Citizen completed the doses");
    }
}

public static void fullyVaccinatedPersons()
{
    int vaccinatedPerson = 0;
    for(Citizens cit : citizens)
    {
        if(cit.getDoses().size()>=2)
            vaccinatedPerson++;
    }
    System.out.println("The fully vaccinated persons : " + vaccinatedPerson + " citizen");
}


public static void displayData()//displayData method
{
    for(Citizens c: citizens)
        System.out.println(c);
}

public static void saveTofile()//saveTofile method
{
    try {
        PrintWriter out = new PrintWriter("Abdelrahman Usama.txt");
        out.println("ministry of health system: ");
        for (Citizens c: citizens)
        {
            out.println("\t - " +c);
        }
        out.close();
        System.out.println("Save to file");
    }catch(FileNotFoundException e)
    {
        System.out.println("file not found");
    }


}


}
