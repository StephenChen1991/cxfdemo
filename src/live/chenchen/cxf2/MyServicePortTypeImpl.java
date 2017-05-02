
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package live.chenchen.cxf2;

import java.util.GregorianCalendar;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;

/**
 * This class was generated by Apache CXF 2.3.3
 * 2017-05-02T18:45:45.366+08:00
 * Generated source version: 2.3.3
 * 
 */

@javax.jws.WebService(
                      serviceName = "MyService",
                      portName = "MyServiceSoap",
                      targetNamespace = "http://cxf2.chenchen.live/",
                      wsdlLocation = "file:/D:/tmp/wsdl/pesonservice.wsdl",
                      endpointInterface = "live.chenchen.cxf2.MyServicePortType")
                      
public class MyServicePortTypeImpl implements MyServicePortType {

    private static final Logger LOG = Logger.getLogger(MyServicePortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see live.chenchen.cxf2.MyServicePortType#getPersonById(live.chenchen.cxf2.IdType  parameters )*
     */
    public live.chenchen.cxf2.PersonType getPersonById(IdType parameters) { 
		PersonType personType = new PersonType();

		personType.setAddress("beijing");
		personType.setName("zhangsan");
		personType.setBirthday(this.date2XMLGregorianCalendar(new Date()));

		RestaurantType restaurantType = new RestaurantType();
		restaurantType.setRestaurantAddress("shangdi");
		restaurantType.setRestaurantName("xiaochidian");

		SchoolType schoolType = new SchoolType();
		schoolType.setSchoolName("tsinghua university");
		schoolType.setRestaurant(restaurantType);

		personType.setSchool(schoolType);

		return personType;
	}

	private XMLGregorianCalendar date2XMLGregorianCalendar(Date date)
	{
		GregorianCalendar cal = new GregorianCalendar();

		cal.setTime(date);

		XMLGregorianCalendar xmlCal = null;

		try
		{
			xmlCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

		return xmlCal;
	}

}
