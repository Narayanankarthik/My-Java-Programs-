package com.polaris.alertLayoutDesign.action;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) 
	{
		Integer[] ar = {1,4,5,7,2,6,3,9,8};
		List<Integer> l = new ArrayList<Integer>();
		l = Arrays.asList(ar);
		Collections.sort(l);
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
