package com.niit.flight_system;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Arrays;
import java.util.List;

@Controller

//Note: Use @controller for UI,not @RestController

public class FlightController{
	@GetMapping("/")
public String viewDashboard(Model model){
// mock data to simulate our Flight System

model.addAttribute("username", "Instructor Wisdowm");

model.addAttribute("systemStatus", "Operational");

List<String> flights = Arrays.asList("NIIT-101 (Lagos)","NIIT-202 (London)", "NIIT-303(Dubai)");
model.addAttribute("activeFlights", flights);
return "index"; //this looks for index.html in the templates folders
  }
 }