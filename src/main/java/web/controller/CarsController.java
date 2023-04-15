package web.controller;

import model.Car;
import model.CarList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", CarList.getCars((byte)5));
        return "cars";
    }

    @RequestMapping(value = "/cars", params = "count")
    public String printCars(@RequestParam(value = "count", required = false) byte count, ModelMap model) {
        model.addAttribute("cars", CarList.getCars(count));
        return "cars";
    }

}

