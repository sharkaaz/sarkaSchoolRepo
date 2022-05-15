package com.myspring.springproject1.Controllers;


import com.myspring.springproject1.Repository.ItemStock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
ItemStock stockitem = new ItemStock();

@GetMapping("/webshop")
public String homePage(Model model){
    model.addAttribute("items",stockitem.getItemstock());
    return "index";
}

}
