package co.com.tarjeta.business;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import co.com.tarjeta.bean.TarjetaBean;
@RunWith(MockitoJUnitRunner.class)
public class TarjetaBusinessTest {
	
	@InjectMocks
	TarjetaBusiness tarjetaBusiness;
	
	@Mock
	TarjetaBean tarjetaBean;
	
	@Test
	public void calculateNewDebtShouldReturnDebtPlus2000xDelayDaysWhenTypeVisaAE() {
		
		Double result = tarjetaBusiness.calculateNewDebt("visa", 4.0, 5);
		Double result2 = tarjetaBusiness.calculateNewDebt("american express", 4.0, 5);
		
		assertTrue("No fue igual a 10004", 10004 == result);
		assertTrue("No fue igual a 10005", 10004 == result2);
	}
	
	@Test
	public void calculateNewDebtShouldReturnDebtPlus1000xDelayDaysWhenTypeMasterCard() {
		
		Double result = tarjetaBusiness.calculateNewDebt("mastercard", 4.0, 5);
		
		assertTrue("No fue igual a 5004", 5004 == result);
	}

	
	@Test
	public void getAllCardsMustToCallTarjetaBeanDotBuscarTodas() {
		
		tarjetaBusiness.getAllCards();
		
		Mockito.verify(tarjetaBean).buscarTodas();
		
	}

}
