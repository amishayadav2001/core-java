package com.aurionpro.test;

import com.aurionpro.model.IAddable;


public class LambdaTest {

	public static void main(String[] args) {
		
		IAddable addObj = (x,y) -> x + y; 
		
		int sum = addObj.Add(11,33);
		System.out.println(sum);


	}

}
