package pl.pbs;


import java.time.LocalDateTime;

public class User {
    private String name;
    private String lastName;
    private LocalDateTime registrationDateTime;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.registrationDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", registrationDateTime=" + registrationDateTime +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(LocalDateTime registrationDateTime) {
        this.registrationDateTime = registrationDateTime;
    }
}
