
package com.soprabanking.amplitude.getcustomerlist;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour comparisonOperator.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="comparisonOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="ENDS WITH"/>
 *     &lt;enumeration value="EQUALS"/>
 *     &lt;enumeration value="STARTS WITH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "comparisonOperator")
@XmlEnum
public enum ComparisonOperator {

    CONTAINS("CONTAINS"),
    @XmlEnumValue("ENDS WITH")
    ENDS_WITH("ENDS WITH"),
    EQUALS("EQUALS"),
    @XmlEnumValue("STARTS WITH")
    STARTS_WITH("STARTS WITH");
    private final String value;

    ComparisonOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonOperator fromValue(String v) {
        for (ComparisonOperator c: ComparisonOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
