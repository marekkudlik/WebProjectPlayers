package marek.poznan.spring.dao;

import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import marek.poznan.spring.entity.Clubs;

@Repository
public class DAOimpl implements DAO {

	@Autowired
	SessionFactory session;

	@Override
	public List<Clubs> getClubs() {
		Session theSession = session.getCurrentSession();
		Query theQuery = theSession.createQuery("from Clubs", Clubs.class);
		List<Clubs> clubs = theQuery.getResultList();

		return clubs;
	}

	@Override
	public void deleteClub(int theId) {
		Session theSession = session.getCurrentSession();
		Query theQuery = theSession.createQuery("delete from Clubs where id=:clubId");
		theQuery.setParameter("clubId", theId);
		theQuery.executeUpdate();

	}

	@Override
	public void saveClub(Clubs theClub) {
		Session theSession = session.getCurrentSession();
		theSession.saveOrUpdate(theClub);
	}

	@Override
	public Clubs getClub(int theId) {
		Session theSession = session.getCurrentSession();
		Clubs theClub = theSession.get(Clubs.class, theId);
		
		return theClub;
	}

}
