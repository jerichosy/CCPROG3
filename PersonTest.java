import java.util.*;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();

        person1.setName("Matthew Jericho Go Sy");
        person1.setCity("Pasig City");
        person1.setMobileNumber("+639175857291");
        //person.setMobileNumber("09175857291");
        person1.setGender("Male");
        person1.setBirthYear(2000);

        System.out.println(person1.getName());
        System.out.println(person1.getCity());
        System.out.println(person1.getMobileNumber());
        System.out.println(person1.getGender());
        System.out.println(person1.getBirthYear());
        //person1.introduceSelf();

        System.out.println();

        Person person2 = new Person();
        person2.setName("John Daniel Esguerra");
        person2.setCity("Cavite");
        person2.setMobileNumber("09991234567");
        person2.setGender("Male");
        person2.setBirthYear(2001);

        person1.setFriend(person2);
        
        Person person2test = person1.getFriend();
        System.out.println(person2test.getName());
        System.out.println(person2test.getCity());
        System.out.println(person2test.getMobileNumber());
        System.out.println(person2test.getGender());
        System.out.println(person2test.getBirthYear());
        //person2test.introduceSelf();

        Person[] personArray = new Person[3];
        personArray[0] = person1;
        personArray[1] = person2;

        for (int i = 0; i < personArray.length - 1; i++) {
            personArray[i].introduceSelf();
        }
    }
}