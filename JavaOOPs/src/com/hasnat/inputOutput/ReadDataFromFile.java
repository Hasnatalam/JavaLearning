package com.hasnat.inputOutput;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) throws IOException
	{
		var fin = new FileInputStream("C:\\InputOutput\\abc.txt");		
				
		try(fin)
		{
			int i;
			while(true)
			{
				i = fin.read();
				if(i==-1)
					break;
				System.out.print((char)i); 				
			}			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}