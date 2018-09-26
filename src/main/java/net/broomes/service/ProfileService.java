package net.broomes.service;

import net.broomes.entity.Profile;

import java.util.List;

public interface ProfileService {

    public List<Profile> getProfiles();

    public void saveProfile(Profile theProfile);

    public Profile getProfile(int theId);

    public void deleteProfile(int theId);
}
