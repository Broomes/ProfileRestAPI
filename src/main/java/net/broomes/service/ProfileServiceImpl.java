package net.broomes.service;

import net.broomes.dao.ProfileDAO;
import net.broomes.entity.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileDAO profileDAO;

    @Override
    @Transactional
    public List<Profile> getProfiles() {
        return profileDAO.getProfiles();
    }

    @Override
    @Transactional
    public void saveProfile(Profile theProfile) {
        profileDAO.saveProfile(theProfile);
    }

    @Override
    @Transactional
    public Profile getProfile(int theId) {
        return profileDAO.getProfile(theId);
    }

    @Override
    @Transactional
    public void deleteProfile(int theId) {
        profileDAO.deleteProfile(theId);
    }
}
