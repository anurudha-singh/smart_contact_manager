import java.util.*;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ID;

    private String name;
    @Column(unique = true)
    private String email;
    private String role;
    private boolean enabled;
    private String imageUrl;
    private String about;
    @OneToMany(cascade=CascadeType.ALL,fetch =FetchType.LAZY,mappedBy = "user")
    private List<Contact> contacts=new ArrayList<Contact>();
    
    public User() {
        super();
    }
    public User(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
   
    public List<Contact> getContacts() {
        return contacts;
    }


   

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getAbout() {
        return about;
    }

}
