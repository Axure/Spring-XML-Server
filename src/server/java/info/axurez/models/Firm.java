package info.axurez.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

@XmlRootElement(name = "firm")
public class Firm {

    @Id
    @GeneratedValue
    @XmlElement
    private Long id;

    @JsonIgnore
    @OneToMany(mappedBy = "firm")
    private Set<Order> orders = new HashSet<>();

    public Set<Order> getOrders() {
        return orders;
    }

    Firm() {
    }

    public Firm(String name, Account owner) {
        this.name = name;
        this.owner = owner;
    }

    @XmlElement
    public String name;

    @XmlElement
    @ManyToOne
    public Account owner;

}
