package datastr;

public class MyLinkedList<Ttype> {
	private MyListNode first = null;
	private MyListNode last = null;
	private int counter = 0;
	
	//pēc noklusejuma jau ir bezargumenta konstruktors -> MyLinkedList()
	
	public boolean isEmpty()
	{
		return (counter==0);
	}
	
	//TODO padomāt un izveidot isFull() funkciju
	
	public int howManyElements()
	{
		return counter;
	}
	public void add(Ttype element) throws Exception {
		if(element == null) throw new Exception("Problems with element");
		
		MyListNode newNode = new MyListNode(element);
		     
		if(isEmpty()) {
			first = newNode;
			last = newNode;
		}else {
			newNode.setPrevious(last);
			last.setNext(newNode);
			last = newNode;
		}
		counter++;
	}
	
	public void print() throws Exception {
		if(isEmpty()) throw new Exception("List is empty");
		MyListNode temp = first;
		for(int i = 0; i < counter; i++) {
			System.out.println(temp+" ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}