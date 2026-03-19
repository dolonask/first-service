package kg.megalab.first_service.controllers;

import kg.megalab.first_service.models.Car;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    // PathVariable

    //http://localhost:8080/car/5

    @GetMapping({"/car/{id}", "/car"})
    public Car getById(@PathVariable(name = "id", required = false) Integer carId){
        Car car = new Car();
        car.setId(carId);
        car.setModel("Toyota");
        return car;
    }

    @GetMapping("/car/{id}/{model}")
    public Car getByIdAndName(@PathVariable Integer id, @PathVariable(name = "model") String name){
        Car car = new Car();
        car.setId(id);
        car.setModel(name);
        return car;
    }

    @GetMapping("/find/car")
    public Car findById(@RequestParam(name = "id") Integer carId){
        Car car = new Car();
        car.setId(carId);
        car.setModel("Toyota");
        return car;
    }

    @GetMapping("/find/car/model")
    public Car findByIdAndName(@RequestParam(name = "id") Integer carId, @RequestParam(required = false, defaultValue = "Undefined") String model){
        Car car = new Car();
        car.setId(carId);
        car.setModel(model);
        return car;
    }

    @PostMapping("/car")
    public Car saveCar(@RequestBody Car car){
        System.out.println(car);
        return car;
    }


}
