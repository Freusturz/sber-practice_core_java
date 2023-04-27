package ru.sber.OOP1;
public class Author {
    private String name;

    private String gender;

    private String email = null;


    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public Author(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    public String toString() {
        if (email == null || "".equals(email)) {
            return String.format("%s, %s", name, gender);
        }

        return String.format("%s, %s (%s)", name, gender, email);
    }
}
