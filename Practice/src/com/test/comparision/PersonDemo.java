package com.test.comparision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class PersonDemo {
	public static void main(String[] args) {
		Person nagesh = new Person("Nagesh", "Arra");
		Person nagesh2 = new Person("Arra", "Nagesh");
		Person nagesh3 = new Person("Nagesh", null);
		Person nagesh4 = new Person("Arra", null);
		Person jaya = new Person("Jaya", "Arra");
		Person jaya2 = new Person("Arra", "Jaya");
		Person jaya3 = new Person("Jaya", null);
		Person sahasra = new Person("Sahasra", "Arra");
		Person sahasra2 = new Person("Arra", "Sahasra");
		Person sahasra3 = new Person("Sahasra", null);
		
		HashMap<Person, String> map = new HashMap<>();
		map.put(nagesh, "Nagesh Arra");
		map.put(nagesh2, "Arra Nagesh");
		map.put(nagesh3, "Nagesh null");
		map.put(nagesh4, "Arra null");
		map.put(jaya, "Jaya Arra");
		map.put(jaya2, "Arra Jaya");
		map.put(jaya3, "Jaya null");
		map.put(sahasra, "Sahasra Arra");
		map.put(sahasra2, "Arra Sahasra");
		map.put(sahasra3, "Sahasra null");
		
		System.out.println("n=n2 "+nagesh.equals(nagesh2));
		System.out.println("n=j "+nagesh.equals(jaya));
		System.out.println("j=j2 "+jaya.equals(jaya2));
		System.out.println("j=s "+jaya.equals(sahasra));
		System.out.println("s=s2 "+sahasra.equals(sahasra2));
		System.out.println("s=n "+sahasra.equals(nagesh));
		
		System.out.println("n=n "+nagesh.equals(nagesh));
		System.out.println("n=null "+nagesh.equals(null));
		System.out.println("n=test "+nagesh.equals("test"));
		
		String s = map.get(nagesh);
		System.out.println(s);
		
		String s2 = map.get(new Person("Jaya", "Arra"));
		System.out.println(s2);
		
//		TreeMap<Person, String> tMap = new TreeMap<>(map);
//		System.out.println(tMap.keySet());
//		TreeMap<Person, String> tMap2 = new TreeMap<>(new PersonComparator());
//		tMap2.putAll(tMap);		
//		System.out.println(tMap2.keySet());
		
		ArrayList<Person> pList = new ArrayList<>();
		pList.addAll(map.keySet());
		System.out.println(pList);

		LinkedList<Person> lList = new LinkedList<>();
		lList.addAll(pList);
		System.out.println(pList);
		
//		Collections.sort(pList, new PersonComparator());
//		System.out.println(pList);
		
//		LinkedHashMap<Person, String> lhMap = new LinkedHashMap<>(map);
//		System.out.println(lhMap.keySet());
		
		try {
			Person clonedNagesh = nagesh.clone();
			System.out.println("clonedNagesh="+clonedNagesh.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}

}
