package com.xworkz.collections.arraylist;

import java.util.ArrayList;

public class CharacterArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Character> letter = new ArrayList<Character>();

		letter.add('h');
		letter.add('a');
		letter.add('l');
		letter.add('p');
		letter.add('y');

		System.out.println(letter.isEmpty());
		System.out.println("--------------------------");

		System.out.println("size of the array: " + letter.size());
		System.out.println("--------------------------");

		for (int i = 0; i < letter.size(); i++)
			System.out.println("for loop:" + letter.get(i));
		System.out.println("--------------------------");

		for (Character i : letter)
			System.out.println("for each loop:" + i);
		System.out.println("--------------------------");

		letter.set(0, 'Z');
		System.out.println(letter);
		System.out.println("--------------------------");

		System.out.println(letter.get(4));
		System.out.println("--------------------------");

		letter.remove(2);
		System.out.println(letter);
		System.out.println("--------------------------");

		System.out.println(letter.contains('Z'));
		System.out.println("--------------------------");

		letter.remove(new Character('Z'));
		System.out.println(letter);

	}

}

////O/p: 
//false
//--------------------------
//size of the array: 5
//--------------------------
//for loop:h
//for loop:a
//for loop:l
//for loop:p
//for loop:y
//--------------------------
//for each loop:h
//for each loop:a
//for each loop:l
//for each loop:p
//for each loop:y
//--------------------------
//[Z, a, l, p, y]
//--------------------------
//y
//--------------------------
//[Z, a, p, y]
//--------------------------
//true
//--------------------------
//[a, p, y]