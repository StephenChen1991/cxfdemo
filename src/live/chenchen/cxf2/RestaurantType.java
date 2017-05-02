
package live.chenchen.cxf2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RestaurantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RestaurantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restaurantName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="restaurantAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestaurantType", propOrder = {
    "restaurantName",
    "restaurantAddress"
})
public class RestaurantType {

    @XmlElement(required = true)
    protected String restaurantName;
    @XmlElement(required = true)
    protected String restaurantAddress;

    /**
     * Gets the value of the restaurantName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * Sets the value of the restaurantName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantName(String value) {
        this.restaurantName = value;
    }

    /**
     * Gets the value of the restaurantAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    /**
     * Sets the value of the restaurantAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantAddress(String value) {
        this.restaurantAddress = value;
    }

}
