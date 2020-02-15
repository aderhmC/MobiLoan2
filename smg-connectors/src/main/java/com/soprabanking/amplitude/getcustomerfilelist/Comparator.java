
package com.soprabanking.amplitude.getcustomerfilelist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour comparator.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="comparator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BETWEEN"/>
 *     &lt;enumeration value="BETWEEN EQUALS"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="GREATER EQUALS"/>
 *     &lt;enumeration value="GREATER THAN"/>
 *     &lt;enumeration value="LOWER EQUALS"/>
 *     &lt;enumeration value="LOWER THAN"/>
 *     &lt;enumeration value="NOT EQUALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "comparator")
@XmlEnum
public enum Comparator {

    BETWEEN("BETWEEN"),
    @XmlEnumValue("BETWEEN EQUALS")
    BETWEEN_EQUALS("BETWEEN EQUALS"),
    EQUALS("EQUALS"),
    @XmlEnumValue("GREATER EQUALS")
    GREATER_EQUALS("GREATER EQUALS"),
    @XmlEnumValue("GREATER THAN")
    GREATER_THAN("GREATER THAN"),
    @XmlEnumValue("LOWER EQUALS")
    LOWER_EQUALS("LOWER EQUALS"),
    @XmlEnumValue("LOWER THAN")
    LOWER_THAN("LOWER THAN"),
    @XmlEnumValue("NOT EQUALS")
    NOT_EQUALS("NOT EQUALS");
    private final String value;

    Comparator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Comparator fromValue(String v) {
        for (Comparator c: Comparator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
