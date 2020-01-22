package marek.poznan.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import marek.poznan.spring.entity.Clubs;
import marek.poznan.spring.service.ClubsService;

@Controller
@RequestMapping("/clubs")
public class ClubsController {
	
	@Autowired
	ClubsService clubService;
	
	@GetMapping("/show")
	public String listClubs(Model theModel) {
		List<Clubs> clubs =	clubService.getClubs();
		theModel.addAttribute("theClubs", clubs);
		
		return "list-clubs";
	}
	
	@GetMapping("/formForAdd")
	public String formForAdd(Model theModel) {
		Clubs theClub = new Clubs();
		theModel.addAttribute("club", theClub);
		
		return "add-club";
		
	}
	
	@GetMapping("/delete")
	public String deleteClub(@RequestParam("clubsId") int theId) {
		
		clubService.deleteClub(theId);
		return "redirect:/clubs/show";
		
	}
	
	@PostMapping("/addClub")
	public String addClub(@ModelAttribute("club") Clubs theClub) {
		clubService.saveClub(theClub);
		return "redirect:/clubs/show";
	}
	
	@GetMapping("update")
	public String updateClub(@RequestParam("clubsId") int theId, Model theModel) {
		Clubs theClub = clubService.getClub(theId);
		theModel.addAttribute("club", theClub);
		return "add-club";
	}

}
