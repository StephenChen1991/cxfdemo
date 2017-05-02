
package live.chenchen.cxf2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the live.chenchen.cxf2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPersonByIdRequest_QNAME = new QName("http://cxf2.chenchen.live/", "getPersonByIdRequest");
    private final static QName _GetPersonByIdResponse_QNAME = new QName("http://cxf2.chenchen.live/", "getPersonByIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: live.chenchen.cxf2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link RestaurantType }
     * 
     */
    public RestaurantType createRestaurantType() {
        return new RestaurantType();
    }

    /**
     * Create an instance of {@link SchoolType }
     * 
     */
    public SchoolType createSchoolType() {
        return new SchoolType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf2.chenchen.live/", name = "getPersonByIdRequest")
    public JAXBElement<IdType> createGetPersonByIdRequest(IdType value) {
        return new JAXBElement<IdType>(_GetPersonByIdRequest_QNAME, IdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf2.chenchen.live/", name = "getPersonByIdResponse")
    public JAXBElement<PersonType> createGetPersonByIdResponse(PersonType value) {
        return new JAXBElement<PersonType>(_GetPersonByIdResponse_QNAME, PersonType.class, null, value);
    }

}
