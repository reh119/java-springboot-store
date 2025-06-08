package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping; // part of web started dependency. used for request mapping annotation

@Controller // telling spring that this class should be used as web controller for receiving web traffic

public class HomeController {
    @Value("${spring.application.name}") // at runtime, spring will get the value associated with this kwy, and INJECT in our private field
    private String appName;

    @RequestMapping ("/")// root of website. this method will be called. can change argument depending on where traffic goes
    public String index(){
        // return name of view that should be returned to the browser on this endpoint.
        System.out.println(appName);
        return "index.html"; // we need to create this view.
    }


}
