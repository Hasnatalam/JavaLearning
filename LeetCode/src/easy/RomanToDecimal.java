package easy;

import java.util.HashMap;

public class RomanToDecimal {
	
	public static int romanToInt(String s){
		int no=0;
		HashMap<Character,Integer>roman=new HashMap<>();
		roman.put('I',1);
		roman.put('V',5);
		roman.put('X',10);
		roman.put('L',50);
		roman.put('C',100);
		roman.put('D',500);
		roman.put('M',1000);
		for(int i=0;i<s.length()-1;i++){
			Character ch=s.charAt(i);
			System.out.print(roman.get(ch));
			if(roman.get(ch)>=roman.get(s.charAt(i+1))){
				no+=roman.get(ch);
				System.out.println("  "+no);
			}
			else {no-=roman.get(ch);System.out.println("  "+no);}
		}
		return no+roman.get(s.charAt(s.length()-1));}
	public static void main(String[] args) {
		String s= "MCMXCIV";
		System.out.println(romanToInt(s));
	}
	
}
