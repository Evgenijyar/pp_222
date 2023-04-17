package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;

@Controller
public class CarsController {

    private final CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", carService.getCars((byte) 5));
        return "cars";
    }

    @RequestMapping(value = "/cars", params = "count")
    public String printCars(@RequestParam(value = "count", required = false) byte count, ModelMap model) {
        model.addAttribute("cars", carService.getCars(count));
        return "cars";
    }

}

