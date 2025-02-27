package com.hasnat.SerializationAndDeserialiazation;

import java.io.Serializable;

public record Employee(String name,String city,double salary)implements Serializable {
	
}
