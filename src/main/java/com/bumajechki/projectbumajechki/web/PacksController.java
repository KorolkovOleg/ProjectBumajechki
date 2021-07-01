package com.bumajechki.projectbumajechki.web;

import com.bumajechki.projectbumajechki.domain.Pack;
import com.bumajechki.projectbumajechki.domain.User;
import com.bumajechki.projectbumajechki.repositories.PacksRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.criteria.Path;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Controller
public class PacksController {

    @Autowired
    PacksRepository packsRepository;


    @GetMapping("/packs")
    public String getPacks(ModelMap model) {
        return "packs";
    }


    @PostMapping("/packs")
    public String createPack(@AuthenticationPrincipal User user) {

        Pack pack = new Pack();

        Set<User> users = new HashSet<>();
        users.add(user);
        pack.setUsers(users);

        pack = packsRepository.save(pack);

        return "redirect:/packs/" + pack.getId();
    }

    @GetMapping("/packs/{packId}")
    public String getPack(@PathVariable Long packId, ModelMap modelMap, HttpServletResponse response) throws IOException {

        Optional<Pack> packOpt = packsRepository.findById(packId);

        if (packOpt.isPresent()) {
            modelMap.put("pack", packOpt.get());
        } else {
            response.sendError(404);
        }

        return "packs";
    }

    @PostMapping("/packs/{packId}")
    public String savePack(@PathVariable Long packId, Pack pack) {
        pack = packsRepository.save(pack);
        return "redirect:/packs/" + pack.getId();
    }

}
