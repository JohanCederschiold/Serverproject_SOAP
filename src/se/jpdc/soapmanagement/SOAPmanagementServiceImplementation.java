package se.jpdc.soapmanagement;


import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import se.jpdc.soapmanagement.dataaccess.SoapDataaccess;
import se.jpdc.soapmanagement.domain.HandSoap;

@Stateless
public class SOAPmanagementServiceImplementation implements SOAPmanagementServiceLocal {
	
	@Inject 
	private SoapDataaccess service;
	
	@Override
	public void addNewSoap(HandSoap handsoap) {
		service.addNewSoap(handsoap);
	}
	

	@Override
	public List<HandSoap> listAllSoaps() {
		return service.listAllSoaps();
	}

	@Override
	public List<HandSoap> listSoapsByBrand(String brand) {
		return service.listSoapsByBrand(brand);
	}


}
