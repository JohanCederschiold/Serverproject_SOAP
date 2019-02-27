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
		list.add(new HandSoap("Barnängen", "MjölkBlomma", 5.50, 375));
		list.add(new HandSoap("Barnängen", "Hallon och lök", 5.75, 200));
		list.add(new HandSoap("Rexona", "Solrosfrön", 4.50, 175));
		
		System.out.println("SoapDataProductionVersion körd");
		return list;
	}

	@Override
	public List<HandSoap> listSoapsByBrand(String brand) {
		List<HandSoap> list = new ArrayList<>();
		list.add(new HandSoap("Barnängen", "MjölkBlomma", 5.50, 375));
		list.add(new HandSoap("Barnängen", "Hallon och lök", 5.75, 200));
		
		return list;
	}

}
