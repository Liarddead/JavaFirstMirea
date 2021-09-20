package ru.mirea.task4.task4_1;
public class Author {
    private String name;
    private String email;
    private char gender;
    Author(String Name, String Email, char Gender){
        name= Name;
        email=Email;
        gender=Gender;
    }
    public String getName(){return name;}
    public String getEmail(){return email;}
    public void setEmail(String Email){email=Email;}
    public char getGender(){return gender;}
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}

