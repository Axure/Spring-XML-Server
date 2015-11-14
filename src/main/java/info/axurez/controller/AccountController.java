package info.axurez.controller;

import info.axurez.model.Account;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/account")
public class AccountController {
    @RequestMapping(value = {"/list"}, method = RequestMethod.GET, produces = "application/xml")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    Account newStudent() {
        Account newAccount = new Account("Name", "Password", "name@host.com");
        return newAccount;
    }

}
