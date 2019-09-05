package com.oppir.test.API_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import com.oppir.test.API_test.models.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApiTestApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestIntegration {
	@Autowired
	private TestRestTemplate restTemplate;

	@LocalServerPort
	private int port;

	private String getRootUrl() {
		return "http://localhost:" + port;
	}
	
	@Test
    public void contextLoads() {

    }
	
	@Test
	public void testGetAllCategoryByUserId() {
		User user = restTemplate.getForObject(getRootUrl() + "/module-id/u001", User.class);
		System.out.println("This is User Name : "+user.getUsername());
		System.out.println("This is User GroupId : "+user.getUserid());
	}
}
