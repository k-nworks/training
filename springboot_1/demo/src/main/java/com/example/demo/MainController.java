package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
    @RequestMapping("/home")
    public String mainpage(Model model) {
        return "mainpage";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @RequestMapping("/info")
    public ModelAndView info() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("target", "America");
        mav.setViewName("info");
        return mav;
    }

    @RequestMapping("/jquery-ajax")
    public String jquery(Model model) {
        return "jquery-ajax";
    }

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("message", "こんばんは");
        return "index";
    }

    @RequestMapping(name = "/index", method = RequestMethod.POST)
    public String nameToMessage(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "こんばんは" + name + "さん");
        return "index";
    }

}
