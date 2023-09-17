package com.oops.abstraction;
//example of functional interface...

import java.io.Serializable;

//interface which has only one method called functional interface...

@FunctionalInterface
interface Callable {

	void call();
	// void call1();
}

//marker interface....
interface Marks {

//	public Marks();
	// empty interface...

}

public class FuncIntDemo implements Callable{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

}
