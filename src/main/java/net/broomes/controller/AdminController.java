package net.broomes.controller;

import net.broomes.entity.Profile;
import net.broomes.service.ProfileService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(name = "/admin")
    public String admin(Model theModel){

        Profile theProfile = profileService.getProfile(1);

        theModel.addAttribute("profile", theProfile);

        return "admin";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("profile") Profile theProfile){

        theProfile.setId(1);
        profileService.saveProfile(theProfile);

        return "confirmation";
    }
}
