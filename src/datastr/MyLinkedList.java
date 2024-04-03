package datastr;

public class MyLinkedList<Ttype> {
	private MyListNode first = null;
	private MyListNode last = null;
	private int counter = 0;
	
	//pēc noklusejuma jau ir bezargumenta konstruktors -> MyLinkedList()
	
	public boolean isEmpty(){
		return (counter==0);
	}
	
	//TODO padomāt un izveidot isFull() funkciju
	
	public int howManyElements(){
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
	public void add(Ttype element, int pos) throws Exception {
		if(element == null) throw new Exception("Problems with element");
		
		MyListNode newNode = new MyListNode(element);

		if(pos > counter || pos < 0 ) 
			throw new Exception("Out of bounds");
		
		if(isEmpty() && pos == 0 ){
			add(element);
			
		}else if(isEmpty() && pos != 0){
			throw new Exception("list empty and pos not 0");
			
		}else if(pos == 0) {
			newNode.setNext(first);
			first.setPrevious(newNode);
			first = newNode;
			counter++;
			
		}else if(pos == counter){
			add(element);
			
		}else {
			MyListNode tempN = first;
			for(int i = 0; i < pos; i++) {
				tempN = tempN.getNext();
			}
			MyListNode rightNode = tempN;
			MyListNode leftNode = tempN.getPrevious();
			newNode.setNext(rightNode);
			rightNode.setPrevious(newNode);
			newNode.setPrevious(leftNode);
			leftNode.setNext(newNode);
			counter++;
		}
	}
	
	public void print() throws Exception {
		if(isEmpty()) throw new Exception("List is empty");
		
		MyListNode temp = first;
		for(int i = 0; i < counter; i++) {
			System.out.print(temp+ " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
	public void delete(int pos) throws Exception {
		
		if(pos >= counter || pos < 0 ) 
			throw new Exception("Out of bounds");

		if(isEmpty()){
			throw new Exception("list empty");
		}else if(pos == 0) {
			MyListNode newFirstNode = first.getNext();
			newFirstNode.setPrevious(null); 
			first = newFirstNode;
			counter--;
			System.gc();
		}else if(pos == counter-1){
			MyListNode newLastNode = last.getPrevious();
			newLastNode.setNext(null); 
			last = newLastNode;
			counter--;
			System.gc();
		}else {
			MyListNode tempN = first;

			for(int i = 0; i < pos; i++) {
				tempN = tempN.getNext();
			}
			MyListNode rightNode = tempN.getNext();
			MyListNode leftNode = tempN.getPrevious();
			leftNode.setNext(rightNode);
			rightNode.setPrevious(leftNode);
			counter--;
			System.gc();
		}
	}
}