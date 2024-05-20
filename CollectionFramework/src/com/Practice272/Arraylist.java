package com.Practice272;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;



public class Arraylist {

	public static void main(String[] args) {
//		ArrayList res=findArrayList();
//		System.out.println(res);
//
//	}
//
//	private static ArrayList findArrayList() {
//		Scanner sc=new Scanner(System.in);
//		ArrayList al=new ArrayList();
//		al.add(sc.nextInt());
//		al.add(sc.nextFloat());
//		al.add(sc.next());
//		al.add(sc.nextInt());
//		return al;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the List");
	ArrayList al=new ArrayList();
//	al.add(sc.nextInt());
//	al.add(sc.nextInt());
//	al.add(sc.nextInt());
	
	al.add(12);
	al.add(12);
	al.add(23);
	al.add(11);
	
	System.out.println(al);
	System.out.println(al.set(2,72));
	System.out.println(al.get(2));
	//Collection.sort(al);
	System.out.println(al);
	al.remove(0);
	System.out.println(al);
		Iterator it= al.iterator();
		//cheak if iterator has the elements
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
