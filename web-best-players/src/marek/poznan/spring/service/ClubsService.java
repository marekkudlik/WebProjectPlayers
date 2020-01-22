package marek.poznan.spring.service;

import java.util.List;

import marek.poznan.spring.entity.Clubs;

public interface ClubsService {

	List<Clubs> getClubs();

	Clubs getClub(int theId);

	void saveClub(Clubs theClub);

	void deleteClub(int theId);

}
