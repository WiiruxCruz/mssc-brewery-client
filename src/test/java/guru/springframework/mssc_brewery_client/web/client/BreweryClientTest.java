package guru.springframework.mssc_brewery_client.web.client;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
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
	
	@Test
	void testSavedNewBeer() {
		BeerDto beerDto = BeerDto.builder().beerName("New Beer").build();
		
		URI url = client.saveNewBeer(beerDto);
		
		assertNotNull(url);
		
		System.out.println(url.toString());
	}
	
	@Test
	void testUpdateBeer() {
		BeerDto beerDto = BeerDto.builder().beerName("New Beer 2").build();
		
		client.updateBeer(UUID.randomUUID(), beerDto);
	}
	
	@Test
	void testDeleteBeer() {		
		client.deleteBeer(UUID.randomUUID() );
	}
}
