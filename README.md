# Ministry of Health System - COVID-19 Vaccination Management

## Overview
This Java-based system is designed to manage COVID-19 vaccination records for citizens. It maintains records of citizens, their vaccination doses, and health professionals administering the vaccines. The system provides functionalities to add, remove, and display citizens and their vaccination details, as well as save this information to a file.

## Classes and Methods

### 1. Person Class
An abstract class representing a person with a civil ID and name.

#### Attributes:
- `int civilId`: The civil ID of the person.
- `String name`: The name of the person.

#### Constructors:
- `Person(int h, String nam)`: Initializes with a civil ID and name.
- `Person(String nam)`: Initializes with only a name.
- `Person()`: Default constructor.

#### Methods:
- Getters and setters for civilId and name.
- `toString()`: Returns a string representation of the person.

### 2. HealthProfessional Class
Represents a health professional with experience in years.

#### Inherits from:
- Person

#### Additional Attribute:
- `int experience`: The number of years of experience.

#### Constructors:
- Various constructors to initialize with different parameters.

#### Methods:
- Getters and setters for experience.
- `toString()`: Returns a string representation of the health professional.

### 3. Dose Class
Represents a vaccination dose with manufacturer, time, location, and the health professional who administered it.

#### Attributes:
- `String Manufacturer`
- `String Time`
- `String Location`
- `HealthProfessional staffMember`

#### Constructors:
- Various constructors to initialize with different parameters.

#### Methods:
- Getters and setters for all attributes.
- `toString()`: Returns a string representation of the dose.

### 4. Citizens Class
Represents a citizen with an address, phone number, age, and a list of doses.

#### Inherits from:
- Person

#### Additional Attributes:
- `String Address`
- `String numberphone`
- `int Age`
- `ArrayList<Dose> doses`

#### Constructors:
- Various constructors to initialize with different parameters.

#### Methods:
- Getters and setters for all attributes.
- `toString()`: Returns a string representation of the citizen.
- `compareTo(Citizens o)`: Compares citizens based on civil ID.
- `equals(Object o)`: Checks equality based on civil ID.

### 5. main Class
Contains the main method to test and demonstrate the functionality of the system.

#### Static Attributes:
- `ArrayList<Citizens> citizens`: List to store citizens.

#### Static Methods:
- `addlist(Citizens c)`: Adds a citizen to the list.
- `removeCitizen(Citizens c)`: Removes a citizen from the list.
- `addDoses(Citizens c, Dose d)`: Adds a dose to a citizen.
- `fullyVaccinatedPersons()`: Counts and displays the number of fully vaccinated persons.
- `displayData()`: Displays all citizens and their information.
- `saveTofile()`: Saves all citizen data to a file.
  ## Features
- Add Citizens: Add new citizens to the system.
- Remove Citizens: Remove existing citizens from the system.
- Add Doses: Record vaccination doses for citizens.
- Display Data: Display information about all citizens and their vaccination status.
- Fully Vaccinated Count: Display the number of fully vaccinated citizens.
- Save to File: Save all data to a text file.

## Notes
- The system assumes that a citizen is fully vaccinated if they have received at least two doses.
- The saveTofile method saves the data to a file named Abdelrahman Usama.txt.

## License
This project is licensed under the MIT License. See the LICENSE file for details.


## Usage Example

```java
public class Test {
    public static void main(String[] args) {
        // Create Health Professionals
        HealthProfessional f1 = new HealthProfessional(1580, "Abdelrahman", 2);
        HealthProfessional f2 = new HealthProfessional(1474, "yousef", 6);

        // Create Doses
        Dose d1 = new Dose("Pfizer", "1/9/2021", "AOU_Clinic", f1);
        Dose d2 = new Dose("AstraZeneca", "19/9/2021", "Alex_Clinic", f2);

        // Create Citizens
        Citizens c1 = new Citizens(159, "fares", "Alexandria", "01065314789", 32);
        Citizens c2 = new Citizens(357, "Nadr", "cairo", "01135684269", 26);

        // Add Citizens
        main.addlist(c1);
        main.addlist(c2);

        // Add Doses to Citizens
        main.addDoses(c1, d1);
        main.addDoses(c2, d2);

        // Display Fully Vaccinated Persons
        main.fullyVaccinatedPersons();

        // Display All Data
        main.displayData();

        // Save Data to File
        main.saveTofile();
    }
}

