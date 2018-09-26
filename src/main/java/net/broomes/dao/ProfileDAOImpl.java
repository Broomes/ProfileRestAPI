package net.broomes.dao;

import net.broomes.entity.Profile;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProfileDAOImpl implements ProfileDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Profile> getProfiles() {

        Session currentSession = sessionFactory.getCurrentSession();

        // create a query  ... sort by last name
        Query<Profile> theQuery =
                currentSession.createQuery("from Profile order by lastName",
                        Profile.class);

        List<Profile> profiles = theQuery.getResultList();

        return profiles;
    }

    @Override
    public void saveProfile(Profile theProfile) {
        Session currentSession = sessionFactory.getCurrentSession();
        currentSession.saveOrUpdate(theProfile);
    }

    @Override
    public Profile getProfile(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();
        Profile theProfile = currentSession.get(Profile.class, theId);
        return theProfile;
    }

    @Override
    public void deleteProfile(int theId) {
        Session currentSession = sessionFactory.getCurrentSession();

        Query theQuery =
                currentSession.createQuery("delete from Profile where id=:profileId");
        theQuery.setParameter("profileId", theId);

        theQuery.executeUpdate();
    }
}
