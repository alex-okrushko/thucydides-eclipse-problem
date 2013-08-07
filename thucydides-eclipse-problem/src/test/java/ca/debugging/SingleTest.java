package ca.debugging;

import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(ThucydidesRunner.class)
public class SingleTest {
		
	@Test
	public void test1(){
		System.out.println("test 1");
	}
	
	@Test
	public void test2(){
		System.out.println("test 2");
	}
	
	@Test
	public void testFailing(){
		throw new AssertionError("failing test");
	}
	
	@Test
	public void test4(){
		System.out.println("test 4");
	}
	
	
	@Test
	public void test5(){
		System.out.println("test 5");
	}
	
	@Test
	public void testRuntimeError(){
		throw new RuntimeException("runtime error");
	}

}
