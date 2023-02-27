package org.test;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Client {
	@Ignore
	@Test
	public void  test1() {

    }
	@Test
	public void test2() {
		
	}
	@Test(invocationCount=5)
	public void test3() {
    }
	@Test(enabled=false)
    public void test4() {
		
	}
	@Test(enabled=true)
	public void test5(){
}}

	


