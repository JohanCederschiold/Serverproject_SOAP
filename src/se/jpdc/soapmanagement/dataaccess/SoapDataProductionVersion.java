package se.jpdc.soapmanagement.dataaccess;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import se.jpdc.soapmanagement.domain.HandSoap;

@Stateless
@Default
public class SoapDataProductionVersion implements SoapDataaccess {

	@Override
	public List<HandSoap> listAllSoaps() {
		List<HandSoap> list = new ArrayList<>();
		list.add(new HandSoap("Barn�ngen", "Mj�lkBlomma", 5.50, 375));
		list.add(new HandSoap("Barn�ngen", "Hallon och l�k", 5.75, 200));
		list.add(new HandSoap("Rexona", "Solrosfr�n", 4.50, 175));
		
		System.out.println("SoapDataProductionVersion k�rd");
		return list;
	}

	@Override
	public List<HandSoap> listSoapsByBrand(String brand) {
		List<HandSoap> list = new ArrayList<>();
		list.add(new HandSoap("Barn�ngen", "Mj�lkBlomma", 5.50, 375));
		list.add(new HandSoap("Barn�ngen", "Hallon och l�k", 5.75, 200));
		
		return list;
	}

}
