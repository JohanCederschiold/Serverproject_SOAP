package se.jpdc.soapmanagement.dataaccess;

import java.util.List;

import javax.ejb.Local;

import se.jpdc.soapmanagement.domain.HandSoap;

@Local
public interface SoapDataaccess {
	
	public List<HandSoap> listAllSoaps ();
	public List<HandSoap> listSoapsByBrand(String brand);

}
