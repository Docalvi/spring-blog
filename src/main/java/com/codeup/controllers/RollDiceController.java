package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class RollDiceController {
    @GetMapping("/roll-dice/{n}")
    public String diceRoll(@PathVariable String n, Model model) {
        model.addAttribute("n", n);
        return "/profile/roll-dice";
    }
}
