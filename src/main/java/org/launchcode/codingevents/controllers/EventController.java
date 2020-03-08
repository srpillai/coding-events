package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Radhakrishnan Pillai for LaunchCode, Kansas City, MO as part of LC-101 Web
 * Development
 */

@Controller
@RequestMapping("events")
public class EventController {

  private static List<String> events = new ArrayList<>();

  @GetMapping
  public String displayAllEvents(Model model) {
    model.addAttribute("events", events);
    return "events/index";
  }

  //renders at events/create
  @GetMapping("create")
  public String renderCreateEventForm() {

    return "events/create";
  }

  //renders at events/create
  @PostMapping("create")
  public String createEvent(@RequestParam String eventName) {
    events.add(eventName);
    return "redirect:";
    //return "create";

  }
}
