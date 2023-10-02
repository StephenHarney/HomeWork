package ie.atu.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//define methods in this controller class
@RestController
public class CalculatorController {


    @GetMapping("/calculate")
        public int calculate(@RequestParam int num1, @RequestParam int num2){
                return num1+num2;


    }

    @GetMapping("/calculate")
        public int subtract(@RequestParam int num1, @RequestParam int num2){
                return num1 - num2;
        }

    @GetMapping("/calculate")
        public int multiply(@RequestParam int num1,@RequestParam int num2){
            return num1 * num2;
    }

    @GetMapping("/calculate")
        public int divide(@RequestParam int num1, @RequestParam int num2){
            return num1/num2;
    }

    /*@GetMapping("/calculate{num1}")
    public int add(@PathVariable int num1){
        return num1;

    }*/

}
   /* @GetMapping("/calculate")
    public String calculate(@RequestParam String num1, @RequestParam String num2, @RequestParam String operation, @RequestParam int subtract){
            return "num1 = num2 = operation = -  " + num1 + num2 + operation + subtract;
    }*/







