package live.chenchen.cxf.jaxb;

public class School
{
	private String schoolName;
	
	private String schoolAddress;
	
	private Restaurant restaurant;

	public String getSchoolName()
	{
		return schoolName;
	}

	public void setSchoolName(String schoolName)
	{
		this.schoolName = schoolName;
	}

	public String getSchoolAddress()
	{
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress)
	{
		this.schoolAddress = schoolAddress;
	}

	public Restaurant getRestaurant()
	{
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant)
	{
		this.restaurant = restaurant;
	}
}
