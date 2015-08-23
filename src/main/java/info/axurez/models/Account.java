package info.axurez.models;

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

    @Id
    @GeneratedValue
    @XmlElement
    private long Id;

    public Set<Order> getOrders() {
        return orders;
    }

    public long getId() {
        return Id;
    }

    @JsonIgnore
    public String password;

    @XmlElement
    public String username;

    public Account(String name, String password) {
        this.username = name;
        this.password = password;
    }

    Account() {

    }

}
