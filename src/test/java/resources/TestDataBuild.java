package resources;

import java.util.ArrayList;

import pojo2.AddPlace12;
import pojo2.Location;

public class TestDataBuild {

	public AddPlace12 AddPlacePayLoad()
	{
		
		AddPlace12 p=new AddPlace12();
		
	
		
		p.setAccuracy(50);
		p.setAddress("123street");
		p.setLanguage("Arabic");
		p.setPhonenumber("123456789");
		p.setWebsite("https://rahulshetty.com");
		p.setName("Radia");
		// create arraylist for types bcs it has several values, build the list than pass it to its 
		ArrayList<String> mylist= new ArrayList<String>();
		mylist.add("shoe park");
		mylist.add("shop");
		p.setTypes(mylist);
		//location expects another class object. so we have to create location class obj
	
		Location loc=new Location();
		loc.setLat(-569.007);
		loc.setLon(362.25);
		p.setLocation(loc);
		
		
		return p;
	}
	
	
	
	
}
