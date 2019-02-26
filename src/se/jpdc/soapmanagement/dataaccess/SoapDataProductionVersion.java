package se.jpdc.soapmanagement.dataaccess;

import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.inject.Default;

import se.jpdc.soapmanagement.domain.HandSoap;

@Stateless
@Default
public class SoapDataProductionVersion implements SoapDataaccess {

	@Override
	public List<HandSoap> listAllSoaps() {
		return null;
	}

	@Override
	public List<HandSoap> listSoapsByBrand(String brand) {
		return null;
	}

}
