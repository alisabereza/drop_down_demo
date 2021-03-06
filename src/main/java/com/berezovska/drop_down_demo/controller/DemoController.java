package com.berezovska.drop_down_demo.controller;

import com.berezovska.drop_down_demo.service.CityService;
import com.berezovska.drop_down_demo.service.CountryService;
import com.berezovska.drop_down_demo.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
@RequestMapping(value = { "", "demo" })
public class DemoController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @Autowired
    private CityService cityService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("countries", countryService.findAll());
        return "demo/index";
    }

    @ResponseBody
    @RequestMapping(value = "loadStatesByCountry/{id}", method = RequestMethod.GET)
    public String loadStatesByCountry(@PathVariable("id") int id) {
        Gson gson = new Gson();
        return gson.toJson(stateService.findByCountry(id));
    }

    @ResponseBody
    @RequestMapping(value = "loadCitiesByState/{id}", method = RequestMethod.GET)
    public String loadCitiesByState(@PathVariable("id") int id) {
        Gson gson = new Gson();
        return gson.toJson(cityService.findByState(id));
    }

}