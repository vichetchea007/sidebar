package com.example.sidebar.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class SidebarController {

    @RequestMapping("/")
    public ModelAndView index(ModelMap map) {

        map.addAttribute("reportTitle", "Home Page");
        return new ModelAndView("index", map);
    }

    @RequestMapping("/report01")
    public ModelAndView report01(ModelMap map) {

        map.addAttribute("reportTitle", "របាយការណ៍ទី១");
        return new ModelAndView("report01", map);
    }

    @RequestMapping("/print")
    public ModelAndView print(ModelMap map) {
        return new ModelAndView("print", map);
    }

    @RequestMapping("/toexcel")
    public ModelAndView toexcel(ModelMap map) {
        return new ModelAndView("toexcel", map);
    }

}
