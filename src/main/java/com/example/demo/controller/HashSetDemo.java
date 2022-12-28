package com.example.demo.controller;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	
	HashSet<String> hs=new HashSet<String>();
	hs.add("sami");
	hs.add("maya");
	hs.add("riya");
	

	hs.forEach(x->System.out.println(x));

}
}
