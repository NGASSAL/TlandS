package com.m2i.strategy.classique;

import com.m2i.strategy.classique.Validator;

public class Main {

	public static void main(String[] args) {
        // old school
        Validator v1 = new Validator(new IsNumeric());
        System.out.println("com.m2i.strategy.classique.IsNumeric to validate aaaa :  "+ v1.validate("aaaa"));
        Validator v2 = new Validator(new IsAllLowerCase ());
        System.out.println("com.m2i.strategy.classique.IsAllLowerCase to validate bbbb :  "+v2.validate("bbbb"));
        

  }

}
