package day21;

import java.util.ArrayList;
import java.util.Collection;

public class myArrayList<E> extends ArrayList<E>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5276874241436996684L;

	public myArrayList() {
		super();
	}

	public myArrayList(Collection c) {
		super(c);
	}

	public myArrayList(int initialCapacity) {
		super(initialCapacity);
	}

	public myArrayList<E> addChain(E e) {
		super.add(e); 
		return this;
	}

	public myArrayList<E> removeChain(E e) {
		super.remove(e);
		return this;
	}

}
