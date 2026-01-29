package chapter8;


import java.util.ArrayList;

public class Banner {
    public static void main(String[] args) {
        ArrayList<Person> personsList = new ArrayList<>();
        Person persons[] = new Person[15_000];
        persons[0] = new Student("John Smith", "900000000", "123 street, city, state, zip, usa", "jsmith@samford.edu");
        persons[1] = new Faculty("Dr. Jane Doe", "800000000", "456 avenue, city, state, zip, usa", "jdoe@samford.edu");
        persons[2] = new Staff("Mr. Bob Brown", "700000000", "789 boulevard, city, state, zip, usa", "bbrown@samford.edu");
        persons[3] = new Student("Alice Johnson", "600000000", "101 parkway, city, state, zip, usa", "ajohnson@samford.edu");
        persons[4] = new Faculty("Dr. Charlie Wilson", "500000000", "202 lane, city, state, zip, usa", "cwilson@samford.edu");
        persons[5] = new Staff("Ms. Diana Green", "400000000", "303 drive, city, state, zip, usa", "dgreen@samford.edu");
        for (Person person : persons) {
            if (person != null) {
                System.out.println("Name: " + person.name);

                System.out.println("Name: " + person.getName());
                System.out.println("Type: " + person.getType());
                /*if (person instanceof Student) {
                    System.out.println("Type: Student");
                } else if (person instanceof Faculty) {
                    System.out.println("Type: Faculty");
                } else if (person instanceof Staff) {
                    System.out.println("Type: Staff");
                }*/
            }
        }
    }    
}
