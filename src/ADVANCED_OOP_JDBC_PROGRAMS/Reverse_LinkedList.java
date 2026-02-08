package ADVANCED_OOP_JDBC_PROGRAMS;

import java.util.LinkedList;

public class Reverse_LinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		
		System.out.println("Show Actual Linked List :"+l);
		
		System.out.println("Show Reversed Format    :"+l.reversed());
	}
}
