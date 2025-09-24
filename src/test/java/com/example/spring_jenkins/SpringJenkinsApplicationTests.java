package com.example.spring_jenkins;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	public  contextLoads() {
		logger.info(" Test case executing...");
		logger.info(" Test case executing second time...");
		int expected = 5;
		int actual = 2 + 3;
		assertEquals(expected, actual);
	}

}
