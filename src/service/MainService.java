package service;

import datastr.MyLinkedList;

public class MainService {
	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		try {
			myList.add(12);
			myList.add(130);
			myList.add(23);
			myList.print();
			myList.add(51, 1);
			myList.print();
			
			myList.delete(2);
			myList.print();
			
			System.out.println("GET: " + myList.get(2));
			System.out.println("SEARCH: " + myList.search(23));
			myList.makeEmpty();
			myList.add(2);
			myList.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
