package com.blandon.reflection;

public class ReLoadClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ClassLoader parentClassLoader =  MyClassLoader.class.getClassLoader();

		MyClassLoader classLoader = new MyClassLoader(parentClassLoader);
		Class<Person> personClass = (Class<Person>) classLoader.loadClass("com.blandon.reflection.Person");
		Person person1 = (Person) personClass.newInstance();
		person1.setName("blandon");
		person1.setAge(20);

		//create new class loader so classes can be reloaded.
		ClassLoader classLoader2 = new MyClassLoader(parentClassLoader);
		Class<Person> personClass2 = (Class<Person>) classLoader2.loadClass("com.blandon.reflection.Person");
		Person person2 = (Person) personClass2.newInstance();
		person2.setName("nedlon");
		person2.setAge(22);

		personClass = personClass2;


		person1 = person2;

		System.out.println(person1.getName());

	}
}
