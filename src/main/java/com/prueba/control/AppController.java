package com.prueba.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AppController {

      @RequestMapping(method = RequestMethod.GET)
      public String index(Model model){
           model.addAttribute("message", "Juan");
           return "persona";
       }
}
