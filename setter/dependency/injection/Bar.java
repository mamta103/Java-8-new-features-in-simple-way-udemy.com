package com.setter.dependency.injection;

public class Bar {
	private Foo foo;
	public void setFoo(Foo foo){
        this.foo = foo;
    }
     
    public String toString(){
        return "Bar! Foo : \n" + foo;
    }
}