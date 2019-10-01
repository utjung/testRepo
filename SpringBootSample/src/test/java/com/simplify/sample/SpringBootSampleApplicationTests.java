package com.simplify.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@AutoConfigureWebTestClient
public class SpringBootSampleApplicationTests {

	@Autowired
	private WebTestClient webClient;
	
	@Test
	public void helloWorldTest() throws Exception {
		webClient.get().uri("/test").exchange()
		             .expectStatus().isOk()
		             .expectBody(String.class).isEqualTo("Hello World");
	}

}