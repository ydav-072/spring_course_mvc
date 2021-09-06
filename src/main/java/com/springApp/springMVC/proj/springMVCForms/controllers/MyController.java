package com.springApp.springMVC.proj.springMVCForms.controllers;

import com.springApp.springMVC.proj.springMVCForms.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showIndexPage(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

    //@RequestParam("employeeName") - name of form
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee){
        String name  = employee.getName();
        employee.setName("Mr " + name);
        employee.setSalary(employee.getSalary()*2);
        return "show-emp-details-view";
    }
}
