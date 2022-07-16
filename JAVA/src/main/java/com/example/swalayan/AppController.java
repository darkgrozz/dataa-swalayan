package com.example.swalayan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private DataSwalayanService service;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<dataswalayan> dataswalayanList = service.ListAll();
        model.addAttribute( attributeName "ListDataSwalayan", ListDataSwalayan);

        return "index";
    }

    @RequestMapping("/new")
    public String showDataSwalayanPage(Model model) {
        dataswalayan dataswalayan = new dataswalayan();
        model.addAttribute( attributeName "dataswalayan", dataswalayan);

        return  "new_dataswalayan";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveDataSwalayan(@ModelAttribute("dataswalayan") dataswalayan dataswalayan) {
        service.save(dataswalayan);

        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditDataSwalayanPage(@PathVariable(name = "id") int id) {
        service.delete(id);
        return "redirect:/"
    }


}
