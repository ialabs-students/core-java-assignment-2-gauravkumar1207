package com.assignment2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arraylist {
	public static ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> l1) {
	    Collections.sort(l1,Collections.reverseOrder());
	    return l1;
	}
	public static void main(String[] args) {
		

	ArrayList<BigInteger> l1=new ArrayList<>();
	l1.add(new BigInteger("24"));
	l1.add(new BigInteger("543534"));
	l1.add(new BigInteger("545"));
	l1.add(new BigInteger("2342"));
	l1.add(new BigInteger("9"));
	//ArrayListSort l2=new ArrayListSort();
	System.out.println(arrayListSortDesc(l1));
	
	}	

}