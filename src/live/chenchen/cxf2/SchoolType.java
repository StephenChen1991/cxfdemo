
package live.chenchen.cxf2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restaurant" type="{http://cxf2.chenchen.live/}RestaurantType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolType", propOrder = {
    "schoolName",
    "restaurant"
})
public class SchoolType {

    @XmlElement(required = true)
    protected String schoolName;
    @XmlElement(required = true)
    protected RestaurantType restaurant;

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the restaurant property.
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType }
     *     
     */
    public RestaurantType getRestaurant() {
        return restaurant;
    }

    /**
     * Sets the value of the restaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType }
     *     
     */
    public void setRestaurant(RestaurantType value) {
        this.restaurant = value;
    }

}
