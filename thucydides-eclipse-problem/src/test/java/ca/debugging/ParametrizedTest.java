package ca.debugging;
import java.util.Arrays;
import java.util.Collection;

import net.thucydides.junit.annotations.TestData;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ThucydidesParameterizedRunner.class)
public class ParametrizedTest {
	
	protected String userRole = "ROLE";
	
	public ParametrizedTest(String userRole) {
		this.userRole = userRole;
	}
	
	@TestData(columnNames = "User")
	public static Collection<Object[]> testData(){
		return Arrays.asList(new Object[][]{{"STAFF"}, {"EYEDEMAND_ADMIN"}});
	}
	
	@Test
	public void test1(){
		System.out.println("test 1 for " + userRole);
	}
	
	@Test
	public void test2(){
		System.out.println("test 2 for " + userRole);
	}
	
	@Test
	public void testFailing(){
		throw new AssertionError("failing test");
	}
	
	@Test
	public void test4(){
		System.out.println("test 4 for " + userRole);
	}
	
	
	@Test
	public void test5(){
		System.out.println("test 5 for " + userRole);
	}
	
	@Test
	public void testRuntimeError(){
		throw new RuntimeException("runtime error");
	}

}
