
package live.chenchen.cxf2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PemissionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PemissionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="READ_ONLY"/>
 *     &lt;enumeration value="READ_WRITE"/>
 *     &lt;enumeration value="FULL_CONTROL"/>
 *     &lt;enumeration value="NONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PemissionType")
@XmlEnum
public enum PemissionType {

    READ_ONLY,
    READ_WRITE,
    FULL_CONTROL,
    NONE;

    public String value() {
        return name();
    }

    public static PemissionType fromValue(String v) {
        return valueOf(v);
    }

}
