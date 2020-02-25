package org.launchcode.codingevents.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Radhakrishnan Pillai
 * for LaunchCode, Kansas City, MO
 * as part of LC-101 Web Development
 */

@Controller
public class HomeController {

    @GetMapping
    public String index(){
        return "index";
    }


}
