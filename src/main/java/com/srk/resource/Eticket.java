package com.srk.resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.srk.request.Passengerinfo;
import com.srk.response.Ticketinfo;

@RestController
public class Eticket {

	@PostMapping(value = "/bookticket",

			produces = { "application/xml", "application/json" }, 
			consumes = { "application/xml","application/json"}
)
	private Ticketinfo bookticket(@RequestBody Passengerinfo pinfo) {
        System.out.println(pinfo);
		Ticketinfo t = new Ticketinfo();
		t.setTicketid("SRI54UY");
		t.setTicketstatus("confirmed");
		t.setJourneydate(pinfo.getJourneydate());
		t.setPassengername(pinfo.getFirstname() + " " + pinfo.getLastname());
		t.setTrainnumber(pinfo.getTrainnumber());
		t.setTicketprice(35500.00);
		return t;

	}

}
