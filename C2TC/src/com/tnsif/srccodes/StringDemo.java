package com.tnsif.srccodes;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str= "fareenabegum";
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        
        System.out.println(str.length());
        
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,10));
        System.out.println(str.equals("fareenabegum"));
        
        System.out.println(str.equalsIgnoreCase("fareenabegum"));
        
        System.out.println(str.replace('a', 'f'));
        
        
	}

}
