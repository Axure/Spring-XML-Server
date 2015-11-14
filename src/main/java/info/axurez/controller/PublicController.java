package info.axurez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/public")
public class PublicController {
    @RequestMapping(method = RequestMethod.GET)
    public String showPublic(ModelMap model) {
        model.addAttribute("body", "This is the public body.");
        return "public";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addPublic(ModelMap model) {
        return "public";
    }
}
