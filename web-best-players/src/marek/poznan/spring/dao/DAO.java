package marek.poznan.spring.dao;

import java.util.List;

import marek.poznan.spring.entity.Clubs;

public interface DAO {

	List<Clubs> getClubs();

	void deleteClub(int theId);

	void saveClub(Clubs theClub);

	Clubs getClub(int theId);

}
