package net.broomes.controller;

import net.broomes.entity.Profile;
import net.broomes.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfileRestController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/profile")
    public List<Profile> getProfiles(){
        return profileService.getProfiles();
    }

    @GetMapping("/profile/{profileId}")
    public Profile getProfile(@PathVariable int profileId){
        return profileService.getProfile(profileId);
    }

}
