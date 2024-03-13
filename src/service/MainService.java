package service;

import datastr.MyLinkedList;

public class MainService {
	public static void main(String[] args) {
		MyLinkedList<Integer> myList = new MyLinkedList<Integer>();
		try {
			myList.add(10);
			myList.add(10);
			myList.add(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
