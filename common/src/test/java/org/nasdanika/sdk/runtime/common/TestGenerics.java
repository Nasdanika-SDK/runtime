package org.nasdanika.sdk.runtime.common;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

public class TestGenerics {
	
	public Consumer<String> consumer = new Consumer<String>() {
		@Override
		public void accept(String t) {
			System.out.println(t);
		}
	};
	
	public Consumer<String> createConsumer(Supplier<String> supplier) {
		return new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(supplier.get());
			}
		};
	}
	
	private class MyConsumer<Z extends List<String>> implements Consumer<String> {
		@Override
		public void accept(String t) {
			System.out.println(t);
		}
	}
	
	@Test
	public void testGenerics() throws Exception {
		
		TypeVariable<?>[] typeParameters = MyConsumer.class.getTypeParameters();
		
		Type[] gi = MyConsumer.class.getGenericInterfaces();
		Type gt = MyConsumer.class.getGenericSuperclass();
		
		System.out.println("Type parameters: " + typeParameters.length);
		System.out.println("Generic interfaces: " + gi.length);
		System.out.println("Generic superclass: " + gt);
		
		Type fgt = getClass().getField("consumer").getGenericType();
		System.out.println("Field generic type: " + fgt);
		
		record MyRecord<T>(T value, Function<String,T> mapper) {}
		
		Type rgt = MyRecord.class.getRecordComponents()[0].getGenericType();
		System.out.println("Record component generic type: " + rgt);
		
		Method method = getClass().getMethod("createConsumer", Supplier.class);
		Type mgrt = method.getGenericReturnType();
		System.out.println("Return generic type: " + mgrt);
		Type mgpt = method.getGenericParameterTypes()[0];
		System.out.println("Parameter generic type: " + mgpt);		
		
	}

}
