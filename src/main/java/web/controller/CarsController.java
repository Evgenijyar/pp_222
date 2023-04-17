package web.controller;

import model.Car;
import model.CarList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarListService;
import service.CarListServiceImpl;

@Controller
public class CarsController {

    private CarListService carListService = new CarListServiceImpl();

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", carListService.getCars((byte) 5));
        return "cars";
    }

    @RequestMapping(value = "/cars", params = "count")
    public String printCars(@RequestParam(value = "count", required = false) byte count, ModelMap model) {
        model.addAttribute("cars", carListService.getCars(count));
        return "cars";
    }

}

