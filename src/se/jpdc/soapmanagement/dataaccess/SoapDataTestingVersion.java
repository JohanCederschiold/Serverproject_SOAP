package se.jpdc.soapmanagement.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import se.jpdc.soapmanagement.domain.HandSoap;

@Stateless
@Alternative
public class SoapDataTestingVersion implements SoapDataaccess {

	@Override
	public List<HandSoap> listAllSoaps() {
		List<HandSoap> list = new ArrayList<>();
		list.add(new HandSoap("Test�ngen", "TestBlomma", 5.50, 375));
		list.add(new HandSoap("Test�ngen", "Testlon och l�k", 5.75, 200));
		list.add(new HandSoap("Testona", "Testrosfr�n", 4.50, 175));
		
		System.out.println("SoapDataTestingVersion k�rd");
		return list;
	}

	@Override
	public List<HandSoap> listSoapsByBrand(String brand) {
		
		List<HandSoap> list = new ArrayList<>();
		list.add(new HandSoap("Test�ngen", "TestBlomma", 5.50, 375));
		list.add(new HandSoap("Test�ngen", "Testlon och l�k", 5.75, 200));
		
		return list;
	}

}
