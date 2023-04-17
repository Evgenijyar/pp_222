package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

@Controller
public class CarsController {

    private CarServiceImpl carServiceImpl;
    @Autowired
    public CarsController(CarServiceImpl carServiceImpl) {
        this.carServiceImpl = carServiceImpl;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        model.addAttribute("cars", carServiceImpl.getCars((byte) 5));
        return "cars";
    }

    @RequestMapping(value = "/cars", params = "count")
    public String printCars(@RequestParam(value = "count", required = false) byte count, ModelMap model) {
        model.addAttribute("cars", carServiceImpl.getCars(count));
        return "cars";
    }

}

