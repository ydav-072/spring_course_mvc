package com.springApp.springMVC.proj.requestParamAnnotation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class EmployeeController {
    @RequestMapping("/")
    public String showIndexPage(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(){
        return "ask-emp-details-view";
    }

    //@RequestParam("employeeName") - name of form
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model){
        empName = "Mr." + empName;
        model.addAttribute("nameAttribute", empName);
        return "show-emp-details-view";
    }
}
