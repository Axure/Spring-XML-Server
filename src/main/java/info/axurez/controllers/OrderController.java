package info.axurez.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import info.axurez.xml.Parser;

@Controller
@RequestMapping("/order")
public class OrderController {
    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public @ResponseBody
    String listOrder() {
        return "This is your response.";
    }

    @RequestMapping(value = {"/create"}, method = RequestMethod.POST)
    public @ResponseBody
    String createOrder(@RequestBody String orderData) {

        return orderData;
    }
}
