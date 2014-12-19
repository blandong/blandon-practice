package com.blandon.reflection;

public class MyClassLoader extends ClassLoader {

	public MyClassLoader (ClassLoader parent){
		super(parent);
	}

	public Class<?> loadClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.loadClass(name);
	}

}
