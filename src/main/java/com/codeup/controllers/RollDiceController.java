package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by emilioalvarado on 6/19/17.
 */
@Controller
public class RollDiceController {
    @GetMapping("/roll-dice/home")
    public String diceRoll() {
        return "/profile/roll-dice";
    }
}
