package info.axurez.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement(name = "order")
public class Order {

    @JsonIgnore
    @ManyToOne
    private Account account;

    @ManyToOne
    @XmlElement
    public Firm firm;

    @Id
    @GeneratedValue
    @XmlElement
    private Long id;

    Order() {

    }

    public Order(Account account, String description) {
        this.account = account;
        this.description = description;
    }

    @XmlElement
    public String description;

    public Account getAccount() {
        return account;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
