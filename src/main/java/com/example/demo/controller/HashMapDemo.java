package com.example.demo.controller;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	
	HashMap<String,Integer> map=new HashMap<>();
	map.put("sami",1);
	map.put("ram",2);
	map.put("payal",3);
	
	map.forEach((x,y)->System.out.println(x+" "+y));
}
}
