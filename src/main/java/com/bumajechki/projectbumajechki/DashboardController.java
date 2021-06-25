package com.bumajechki.projectbumajechki;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String rootView() {
        return "index";
    }
}
