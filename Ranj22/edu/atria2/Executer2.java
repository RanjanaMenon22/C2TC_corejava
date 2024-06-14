package edu.atria2;

import edu.atria.Base;

public class Executer2 extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b2=new Base();
		//private members are not accessible outside the first package.
		//System.out.println(b2.varPrivate);
		//default members are not accessible outside the first package.
		//System.out.println(b2.varDefault);
		Executer2 ex=new Executer2();
		System.out.println(b2.varProtected);
		System.out.println(b2.variablePublic);
	}

}
