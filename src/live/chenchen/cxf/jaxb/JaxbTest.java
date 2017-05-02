package live.chenchen.cxf.jaxb;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbTest
{
	public static void main(String[] args) throws Exception
	{
		JAXBContext context = JAXBContext.newInstance(People.class);

		Marshaller marshaller = context.createMarshaller();

		People people = new People();
		people.setId(123);
		people.setUsername("zhangsan");
		people.setPassword("123456");
		
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantName("huandao restaurant");
		restaurant.setRestaurantAddress("shangdi huandao");
		
		School school = new School();
		school.setSchoolName("tsinghua university");
		school.setSchoolAddress("wudaokou");
		school.setRestaurant(restaurant);
		
		people.setSchool(school);

		marshaller.marshal(people, System.out);
		
		
		System.out.println("--------------------------------");

		Unmarshaller unmarshaller = context.createUnmarshaller();

		String xml = "<people><id>123</id><username>zhangsan</username><password>123456</password></people>";

		People p = (People) unmarshaller.unmarshal(new StringReader(xml));

		System.out.println(p.getId() + ", " + p.getUsername() + ", "
				+ p.getPassword());

	}
}
