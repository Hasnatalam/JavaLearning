package com.hasnat.arrayList;

import java.io.Serializable;

public record Employee(int Id, String name, String des,double salary) implements Serializable {
	
}
