package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class NewController {

    private final CarService carService;

    @Autowired
    public NewController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String printCarId (@RequestParam(value = "count", defaultValue = "5") int id, Model model) {
        model.addAttribute("car", carService.printCarId(id));
        return "printCar";
    }
}