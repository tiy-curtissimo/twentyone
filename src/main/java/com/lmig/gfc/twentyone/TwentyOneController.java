package com.lmig.gfc.twentyone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.twentyone.models.AceCard;
import com.lmig.gfc.twentyone.models.FaceCard;
import com.lmig.gfc.twentyone.models.Faces;
import com.lmig.gfc.twentyone.models.Hand;
import com.lmig.gfc.twentyone.models.NumberCard;
import com.lmig.gfc.twentyone.models.Suits;

@Controller
public class TwentyOneController {
	
//	private Game game;
//	
//	public public TwentyOneController() {
//		game = new Game();
//	}

	@GetMapping("/")
	public ModelAndView showBetScreen() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("bet");
		return mv;
	}
	
	@PostMapping("/bet")
	public ModelAndView handleBet(int bet) {
//		game.makePlayerBet(bet);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/play");
		return mv;
	}
	
	@GetMapping("/play")
	public ModelAndView showPlayScreen() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("play");
		
//		mv.addObject("playerHand", game.getPlayerHand());
		
		Hand hand = new Hand();
		hand.accept(new AceCard(Suits.DIAMONDS));
		hand.accept(new NumberCard(Suits.CLUBS, 4));
		hand.accept(new NumberCard(Suits.HEARTS, 8));
		
		mv.addObject("hand", hand);
		
		return mv;
	}
	
}










