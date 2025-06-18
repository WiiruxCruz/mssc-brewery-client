package guru.springframework.mssc_brewery_client.web.client;

import static org.junit.jupiter.api.Assertions.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import guru.springframework.mssc_brewery_client.web.model.BeerDto;

@SpringBootTest
class BreweryClientTest {
	
	@Autowired
	BreweryClient client;
	
	@Test
	void testGetBeerById() {
		BeerDto dto = client.getBeerById(UUID.randomUUID());
		assertNotNull(dto);
	}
}
