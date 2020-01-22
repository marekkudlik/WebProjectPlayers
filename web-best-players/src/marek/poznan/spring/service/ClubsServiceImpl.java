package marek.poznan.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marek.poznan.spring.dao.DAO;
import marek.poznan.spring.entity.Clubs;

@Service
public class ClubsServiceImpl implements ClubsService {
	
	@Autowired 
	DAO dao;

	@Override
	@Transactional
	public List<Clubs> getClubs() {
		
		return dao.getClubs();
	}

	@Override
	@Transactional
	public Clubs getClub(int theId) {
		return dao.getClub(theId);
	}

	@Override
	@Transactional
	public void saveClub(Clubs theClub) {
		dao.saveClub(theClub);
		
	}

	@Override
	@Transactional
	public void deleteClub(int theId) {
		dao.deleteClub(theId);
		
	}
	
	
	
	
}
