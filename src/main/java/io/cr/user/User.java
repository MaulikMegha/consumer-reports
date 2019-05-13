package io.cr.user;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_register")
public class User{
    @NotEmpty
    @Size(message = "First Name too short", min = 3)
    private String fName;

    @NotEmpty
    @Size(message = "Last Name too short", min = 3)
    private String lName;

    @Id
    @NotEmpty
    @Pattern(message = "Wrong email format", regexp="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")
    private String email;

    public User(){}
    public User(String fName, String lName, String email) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.email = email;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }
}