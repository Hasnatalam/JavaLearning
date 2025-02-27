package com.hasnat.inputOutput;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAndWrite 
{
	public static void main(String[] args) throws IOException 
	{
	  var fout = new FileOutputStream("C:\\InputOutput\\abc.txt");
	  
	  try(fout)  
	  {
		  String str = "India";
		  byte[] bytes = str.getBytes();
		  
		  fout.write(bytes); 
		  
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  
	  System.out.println("Success");
	  
	}

}