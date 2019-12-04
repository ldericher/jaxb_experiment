package de.rwth_aachen.swc.miehe.experiments.jaxb;

import javax.xml.bind.JAXBException;

public class JAXB_Experiment {
    public static void main(String[] args) throws JAXBException {
        System.out.println("Content from https://www.dariawan.com/tutorials/java/using-jaxb-java-11/");
        new Dariawan().main();

        System.out.println("~~~~~");
        System.out.println("Content from https://thoughts-on-java.org/generate-your-jaxb-classes-in-second/");
        new ThoughtsOnJava().main();
    }
}
