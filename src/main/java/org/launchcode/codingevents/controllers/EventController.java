package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radhakrishnan Pillai
 * for LaunchCode, Kansas City, MO
 * as part of LC-101 Web Development
 */

@Controller
@RequestMapping("events")
public class EventController {

   @GetMapping
    public String displayAllEvents(Model model){
       List<String> events = new ArrayList<>();
       events.add("Code with Pride");
       events.add("LaunchCode Discovery");
       events.add("Strange Loop");
       events.add("Apple WWDC");
       events.add("SpringOne Platform");
       model.addAttribute("events", events);
       return  "events/index";
   }
}
