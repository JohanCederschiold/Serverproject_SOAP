package se.jpdc.soapmanagement;

import java.util.List;

import javax.ejb.Local;

import se.jpdc.soapmanagement.domain.HandSoap;

@Local
public interface SOAPmanagementServiceLocal {
	
	public void addNewSoap(HandSoap handsoap);
	public List<HandSoap> listAllSoaps();
	public List<HandSoap> listSoapsByBrand(String brand);

}
