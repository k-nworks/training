package com.example.demo;

        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/index")
    public String main(Model model) {
        model.addAttribute("target", "Japan");
        return "index";
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

}
