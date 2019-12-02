package de.rwth_aachen.swc.miehe.experiments.jaxb.models.dariawan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import lombok.ToString;

@ToString
@XmlRootElement
@XmlType(propOrder={"id", "name", "address", "phoneNumber"})
public class Customer {

    private long id;
    private String name;
    private List<Address> address;
    private List<PhoneNumber> phoneNumber;

    public Customer() {
        address = new ArrayList<>();
        phoneNumber = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<PhoneNumber> getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(List<PhoneNumber> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}