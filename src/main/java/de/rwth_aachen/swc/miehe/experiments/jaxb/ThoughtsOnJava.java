package de.rwth_aachen.swc.miehe.experiments.jaxb;

import de.rwth_aachen.swc.miehe.experiments.jaxb.models.thoughtsonjava.Author;
import de.rwth_aachen.swc.miehe.experiments.jaxb.models.thoughtsonjava.ObjectFactory;

import javax.xml.bind.*;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import java.io.StringWriter;

class ThoughtsOnJava {
    void main() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Source orwellSource = new StreamSource(getClass().getResourceAsStream("/orwell.xml"));
        JAXBElement<Author> jaxbOrwell = unmarshaller.unmarshal(orwellSource, Author.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        StringWriter xmlWriter = new StringWriter();
        marshaller.marshal(jaxbOrwell, xmlWriter);
        System.out.println(xmlWriter.toString());
    }
}
