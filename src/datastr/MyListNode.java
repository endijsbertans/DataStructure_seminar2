package datastr;

public class MyListNode {
	private Ttype element;
	private MyListNode next = null;
	private MyListNode previous = null;
	public Ttype getElement() {
		return element;
	}
	public void setElement(Ttype element) {
		if(element !=null)
			this.element = element;
		else
			this.element = (Ttype) new Object();
	}
	public MyListNode getPrevious() {
		return previous;
	}
	public void setPrevious(MyListNode previous) {
		this.previous = previous;
	}
	public MyListNode getNext() {
		return next;
	}
	public void setNext(MyListNode next) {
		this.next = next;
	}
	public MyListNode(Ttype element) {
		setElement();
	}
	public String toString() {
		return " " + element;
	}
	
}
