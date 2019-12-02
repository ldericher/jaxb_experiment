package de.rwth_aachen.swc.miehe.experiments.jaxb.models.dariawan;

import javax.xml.bind.annotation.XmlAttribute;
import lombok.ToString;

@ToString
public class PhoneNumber {

    private String type;
    private String value;
    private Boolean defaultNumber;

    @XmlAttribute
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlAttribute
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @XmlAttribute
    public Boolean isDefaultNumber() {
        return defaultNumber;
    }

    public void setDefaultNumber(Boolean defaultNumber) {
        this.defaultNumber = defaultNumber;
    }
}
