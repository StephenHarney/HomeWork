package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
        @GetMapping("/calculate")
                public String calculate(@RequestParam String name, @RequestParam int add){
                        return "num1" + name + add;
        }






}
