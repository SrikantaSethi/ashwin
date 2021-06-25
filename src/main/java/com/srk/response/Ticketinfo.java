package com.srk.response;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Ticketinfo {

	private String ticketid;
	private String ticketstatus;
	private double ticketprice;
    private String passengername;
    private String from;
    private String to;
    private String trainnumber;
    private String journeydate;
}
