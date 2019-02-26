package se.jpdc.soapmanagement;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import se.jpdc.soapmanagement.domain.HandSoap;

@Stateless
public class SOAPmanagementServiceImplementation implements SOAPmanagementServiceLocal {

	@Override
	public List<HandSoap> listAllSoaps() {
		List<HandSoap> list = new ArrayList<>();
		list.add(new HandSoap("Barnängen", "Godast", 5.50, 375));
		list.add(new HandSoap("Barnängen", "Blommor", 5.75, 200));
		list.add(new HandSoap("Viael", "Kanel", 4.50, 175));
		
		
		return list;
	}

	@Override
	public List<HandSoap> listSoapsByBrand(String brand) {
		
		List<HandSoap> list = new ArrayList<>();
		list.add(new HandSoap("Barnängen", "Godast", 5.50, 375));
		list.add(new HandSoap("Barnängen", "Blommor", 5.75, 200));
		
		return list;
	}

}
