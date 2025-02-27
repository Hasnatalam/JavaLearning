package com.hasnat.basic;

public class ArrayLengthWithCases {
	public static void main(String[] args)
	{
		if(args.length == 0)
		{
			System.out.println("No value from command line ars");
		}
		else if(args.length == 1)
		{
			System.out.println(args[0]);
		}
		else if(args.length == 2)
		{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			System.out.println("Sum is :"+(x+y));
		}

	}
}
