package se.jpdc.soapmanagement;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import se.jpdc.soapmanagement.domain.HandSoap;

@Stateless
@WebService(name="HandSoapWeb")
public class SOAPmanagementWebServiceImplementation {
	
	@Inject
	private SOAPmanagementServiceLocal service;
	
	public List<HandSoap> getAllSoaps() {
		return service.listAllSoaps();
	}
	
	public List<HandSoap> getSoapsNyBrand(String brand) {
		return service.listSoapsByBrand(brand);
	}

}
