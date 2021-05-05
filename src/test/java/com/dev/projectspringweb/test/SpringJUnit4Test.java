/**
 * 
 */
package com.dev.projectspringweb.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.dev.projectspringweb.services.SpringService;

/**
 * @author pablo
 * Clase de prueba unitaria con Spring y JUnit 4
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext-test.xml"})
public class SpringJUnit4Test {
	
	@Autowired
	private SpringService spingServiceImpl;

	@Test
	public void test() {
		assertNotNull(this.spingServiceImpl);
		System.out.println(this.spingServiceImpl.mostrarNombreEmpleado());
	}

}
