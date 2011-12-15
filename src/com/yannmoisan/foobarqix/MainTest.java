package com.yannmoisan.foobarqix;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
	@Test
	public void test() {
		Assert.assertEquals("1", Main.process(1));
		Assert.assertEquals("2", Main.process(2));
		Assert.assertEquals("FooFoo", Main.process(3));
		Assert.assertEquals("4", Main.process(4));
		Assert.assertEquals("BarBar", Main.process(5));
		Assert.assertEquals("Foo", Main.process(6));
		Assert.assertEquals("QixQix", Main.process(7));
		Assert.assertEquals("8", Main.process(8));
		Assert.assertEquals("Foo", Main.process(9));
		Assert.assertEquals("Bar", Main.process(10));
		Assert.assertEquals("FooBar", Main.process(51));
		Assert.assertEquals("BarFoo", Main.process(53));
		Assert.assertEquals("FooQix", Main.process(21));
		Assert.assertEquals("Foo", Main.process(13));
		Assert.assertEquals("FooBarBar", Main.process(15));
		Assert.assertEquals("FooFooFoo", Main.process(33));
	}
}
