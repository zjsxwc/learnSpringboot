package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.json.JSONObject;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
            System.out.println("com.example.demo.DemoApplicationTests.contextLoads()");
            JSONObject jo = new JSONObject("{ \"abc\" : \"def\" }");
            System.out.println(jo.toString());
            
	}

}
