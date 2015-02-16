package com.test.comparision;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1==p2 ? 0 : (p1.equals(p2) ? 0 : (p1.compareTo(p2)));
	}

}
