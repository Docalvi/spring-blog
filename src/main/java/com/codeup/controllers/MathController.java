package com.codeup.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by emilioalvarado on 6/19/17.
 */
@Controller

public class MathController {

    @RequestMapping(path = "/add/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int addMath(@PathVariable int number, @PathVariable int number2) {
        return number + number2;
    }

    @RequestMapping(path = "/subtract/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int subMath(@PathVariable int number, @PathVariable int number2) {
        return number - number2;
    }

    @RequestMapping(path = "/multiply/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public int multiplyMath(@PathVariable int number, @PathVariable int number2) {
        return number * number2;
    }

    @RequestMapping(path = "/divide/{number}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public double divideMath(@PathVariable int number, @PathVariable int number2) {
        return (double) number / number2;
    }

}
