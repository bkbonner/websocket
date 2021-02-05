package com.paraware.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @GetMapping(produces = "application/json", path = "/")
    public @ResponseBody String hello() {
        return "Hello";
    }

}
