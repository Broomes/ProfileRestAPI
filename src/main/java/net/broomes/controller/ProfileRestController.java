package net.broomes.controller;

import net.broomes.entity.Profile;
import net.broomes.exception.ProfileNotFoundException;
import net.broomes.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

        Profile theProfile = profileService.getProfile(profileId);

        if(theProfile == null) {
            throw new ProfileNotFoundException("Profile id with id " + profileId + " not found.");
        }

        return profileService.getProfile(profileId);
    }

    @PostMapping("/profile")
    public Profile addProfile(@RequestBody Profile theProfile){

        theProfile.setId(0);

        profileService.saveProfile(theProfile);

        return theProfile;
    }

    @PutMapping("/profile")
    public Profile updateProfile(@RequestBody Profile theProfile){

        profileService.saveProfile(theProfile);

        return theProfile;
    }

    @DeleteMapping("/profile/{profileId}")
    public String deleteProfile(@PathVariable int profileId){

        Profile theProfile = profileService.getProfile(profileId);

        if(theProfile == null) {
            throw new ProfileNotFoundException("Profile id with id " + profileId + " not found.");
        }

        profileService.deleteProfile(profileId);

        return "Profile " + profileId + " deleted.";
    }

}
