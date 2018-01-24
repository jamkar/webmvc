package controller;

import model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    public String welcome(User user, Model model, ModelAndView modelAndView) {
        System.out.println("name:" + user.getName() + ", email: " + user.getEmail());

        model.addAttribute("name", user.getName());
        model.addAttribute("email", user.getEmail());

        return "welcome";
    }

}
