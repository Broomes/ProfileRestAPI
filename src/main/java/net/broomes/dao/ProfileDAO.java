package net.broomes.dao;

import net.broomes.entity.Profile;

import java.util.List;

public interface ProfileDAO {

    public List<Profile> getProfiles();

    public void saveProfile(Profile theProfile);

    public Profile getProfile(int theId);

    public void deleteProfile(int theId);
}
