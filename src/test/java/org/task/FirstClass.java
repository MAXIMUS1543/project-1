package org.task;

import org.junit.*;

public class FirstClass {

	@BeforeClass
	public static void bc() {
		System.out.println("bc");
	}

	@Before
	public void b() {
		System.out.println("b");
	}

	@Test
	public void t() {
		System.out.println("t");
	}

	@After
	public void a() {
		System.out.println("a");
	}

	@AfterClass
	public static void ac() {
		System.out.println("ac");
		System.out.println("bc");
		System.out.println("cc");
	}
}
