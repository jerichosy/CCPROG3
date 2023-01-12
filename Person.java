import java.util.Calendar;

public class Person {
    // Variables
    private String name;
    private String city;
    private String mobileNumber; // Note: int or long cannot store leading zeros and country code signs (e.g. +63...)
    private String gender;
    private int birthYear;
    private Person friend;

    // Methods
    public void introduceSelf() {
        System.out.println("Hi, my name is " + getName() + ", I am " + (Calendar.getInstance().get(Calendar.YEAR) - getBirthYear()) + " years old and I live in " + getCity() + ".");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    public Person getFriend() {
        return friend;
    }
}