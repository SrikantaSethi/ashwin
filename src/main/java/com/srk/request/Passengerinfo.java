package com.srk.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name="passenger-info")
public class Passengerinfo {
	
	private String firstname;
    private String lastname;
    private String from;
    private String to;
    private String journeydate;
    private String trainnumber; 
}
