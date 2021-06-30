package com.bumajechki.projectbumajechki.web;

import com.bumajechki.projectbumajechki.domain.Pack;
import com.bumajechki.projectbumajechki.domain.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PacksController {

    @GetMapping("/packs")
    public String getPacks(ModelMap model) {
        return "packs";
    }

    @PostMapping("/packs")
    public String createPack(@AuthenticationPrincipal User user){

        Pack pack = new Pack();


        return "redirect:/packs";
    }

}
