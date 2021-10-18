package pl.pbs;


import java.time.LocalDateTime;

public class User {
    public String name;
    public LocalDateTime registrationDateTime;

    public User(String name, LocalDateTime registrationDateTime) {
        this.name = name;
        this.registrationDateTime = registrationDateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registrationDateTime=" + registrationDateTime +
                '}';
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
