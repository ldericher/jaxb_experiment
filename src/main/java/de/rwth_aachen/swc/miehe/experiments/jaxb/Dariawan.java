package de.rwth_aachen.swc.miehe.experiments.jaxb;

import de.rwth_aachen.swc.miehe.experiments.jaxb.models.dariawan.Address;
import de.rwth_aachen.swc.miehe.experiments.jaxb.models.dariawan.Customer;
import de.rwth_aachen.swc.miehe.experiments.jaxb.models.dariawan.PhoneNumber;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

class Dariawan {
    void main() throws JAXBException {
        // Step 1 - Create the Domain Model
        Customer customer = new Customer();
        customer.setId(1);
        customer.setName("Pablo Neruda");

        Address homeAddress = new Address();
        homeAddress.setType("home");
        homeAddress.setAddress1("Fernando Márquez de la Plata 0192");
        homeAddress.setAddress2("Barrio Bellavista");
        homeAddress.setAddress3("Providencia");
        homeAddress.setCity("Santiago");
        customer.getAddress().add(homeAddress);

        Address residentialAddress = new Address();
        residentialAddress.setType("residential");
        residentialAddress.setAddress1("Calle Ricardo de Ferrari 692");
        residentialAddress.setCity("Valparaíso");
        customer.getAddress().add(residentialAddress);

        PhoneNumber homeNumber = new PhoneNumber();
        homeNumber.setType("home");
        homeNumber.setValue("+56-2-2777-8741");
        homeNumber.setDefaultNumber(true);
        customer.getPhoneNumber().add(homeNumber);

        PhoneNumber workNumber = new PhoneNumber();
        workNumber.setType("home");
        workNumber.setValue("+56-2-2737-8712");
        customer.getPhoneNumber().add(workNumber);

        // Step 2 - Convert the Domain Model to XML
        JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter xmlWriter = new StringWriter();
        marshaller.marshal(customer, xmlWriter);
        System.out.println(xmlWriter.toString());

        // Step 3 - Convert XML back to Domain Model
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        StringReader xmlReader = new StringReader(xmlWriter.toString());
        Customer outCustomer = (Customer) unmarshaller.unmarshal(xmlReader);
        System.out.println(outCustomer);
    }
}
