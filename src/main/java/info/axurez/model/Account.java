package info.axurez.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement(name = "account")
public class Account {
    @OneToMany(mappedBy = "account")
    private Set<Order> orders = new HashSet<>();

    @OneToMany(mappedBy = "account")
    private Set<Firm> firms = new HashSet<>();

    @Id
    @GeneratedValue
    @XmlElement
    private long Id;

    public Set<Order> getOrders() {
        return orders;
    }

    public Set<Firm> getFirms() {
        return firms;
    }

    public long getId() {
        return Id;
    }

    @JsonIgnore
    public String password;

    @XmlElement
    public String username;

    @XmlElement
    public String email;

    public Account(String name, String password, String email) {
        this.username = name;
        this.password = password;
        this.email = email;
    }

    Account() {

    }

}
