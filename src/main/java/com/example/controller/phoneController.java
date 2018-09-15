package com.example.controller;

import com.example.dao.phoneMapper;
import com.example.models.Phone;
import com.example.models.cangkumodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class phoneController {
    @Autowired
    private phoneMapper phonemapper;
    @RequestMapping("listall")
    public String listAll(Model model){
        model.addAttribute("phones",phonemapper.selectAll());
        return "tongji";
    }
    @RequestMapping("add")
    public String Add(Phone phone){
        phonemapper.addPhone(phone);
        return "success";
    }
   @RequestMapping("/return")
    public String Delete(int id){

        phonemapper.deletePhone(id);
        return "success";
   }
   @RequestMapping("/selectku")
    public String Kucuncha(String type,Model model){
        List<cangkumodel> models=phonemapper.selectBynumber(type);
        model.addAttribute("cangkumodels",models);
        return "kucun";
   }

}
