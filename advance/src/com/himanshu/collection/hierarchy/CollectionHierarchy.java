package com.himanshu.collection.hierarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionHierarchy {
	
	/*
	 * interface List extends Collection{
	 * 
	 * 	boolean addAll(int paramInt, Collection< ? extends E> paramCollection);
	 * 
	 *  E get(int paramInt);
	 *  
	 *  E set(int paramInt, E paramE);
	 * 
	 * 	void add(int paramInt, E paramE):
	 *  E remove(int paramInt);
	 *  
	 *  int indexOf(Object paramObject):
	 *  int lastIndexOf(Object paramObject);
	 *  
	 *  ListIterator<E> listIterator();
	 *  ListIterator<E> listIterator(int paramInt):
	 *  List<E> subList(int paramInt1, int paramInt2);
	 * 
	 * }
	 * 
	 * 
	 * */
	
	/*
	 * 
	 *way to instantiatre an array list
	 *List<Integer> integers = new ArrayList<Integer>();
	 *
	 * array list can have duplicates
	 * insertion order is preserved
	 * List<String> arrayList = new ArrayList<String>();
	 * 
	 * add at the end of the list
	 * arrayList.add("Sachin");
	 * 
	 * add at the end of the lsit
	 * arrayList.add("Dravid");
	 * 
	 * add at the index 0
	 * arrayList.add(0,"Ganguly");	[Ganguly,Sachin,Dravid]
	 * 
	 * arrayList.add("Sachin"); [Ganguly,Sachin,Dravid,Sachin]	
	 * 
	 * sysout(arrayList.size()); 4
	 * 
	 * sysout(arrayList.contains("Dravid")); true
	 * 
	 * Iterate over an arraylist
	 * Iterator<String> arrayListIterator = arrayList.iterator();
	 * while(arrayListIterator.hasNext()){
	 * 	sysout(arrayListIterator.next()); 
	 * }
	 * 
	 * 
	 * 
	 */
	
	/*
	 * 
	 * class Vector /implements List<E>, Runnable<E>/{
	 * thread safe
	 * synchronized
	 * implements RandomAccess, a marker interface
	 * support almost constant-time access
	 * }
	 * 
	 * */
	
	/*
	 * 
	 * class LinkedList /implements List<E>, Queue/ {
	 * elements are doubly linked list
	 * ideal choice to implement stack or queue
	 * iteration is slower than arraylist
	 * fast insertion and deletion
	 * implements queue interface, suport peek(),poll(),remove()
	 * }
	 * 
	 * */
	
	//unique things only - does not allow duplication
	//if obj1.equals(obj2) then only one of them can be in the Set.
	/* *
	 * interface Set<E> extends Collection<E>{}
	 * * */	
	
	public static void main(String[] args) {
	
//		arraylist example
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Sachin");
		arrayList.add("Dravid");
		arrayList.add(0,"Ganguly");
		arrayList.add("Sachin");
		
		Collections.sort(arrayList);
		
		Iterator<String> arrayListIterator = arrayList.iterator();
			
		while(arrayListIterator.hasNext()) {
			String s = arrayListIterator.next();
			System.out.println(s);
		}
		
		
	}
	
}
