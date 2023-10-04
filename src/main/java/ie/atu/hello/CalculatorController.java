package ie.atu.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//define methods in this controller class
@RestController
public class CalculatorController {


    @GetMapping("/calculate")
    public Calculate Calculate(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation) {
        int result;
        switch (operation) {
            case "add":


                result = num1 + num2;
                break;

            case "subtract":
                result = num1 - num2;
                break;

            case "multiply":

                result = num1 * num2;
                break;

            case "divide":
                if (num2 == 0) {
                    throw new IllegalArgumentException("Divide is not equal to 0");
                }
                result = num1 / num2;

                break;
            default:

                throw new IllegalArgumentException("ERROR Operation nto working");
        }
        Calculate object = new Calculate(result, operation);
        return object;
    }
}

   /* @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public Calculate Calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation){

        int result;
        switch (operation){

            case"add":

                result = num1 + num2;
                //links http://localhost:8080/calculate/6/2/add
                break;

            case "subtract":
                result = num1 - num2;
                //links http://localhost:8080/calculate/10/5/subtract
                break;

            case "multiply":
                result = num1 * num2;

                //links http://localhost:8080/calculate/4/3/multiply
                    break;
            case "divide":
                if (num2 == 0){
                    throw new IllegalArgumentException("Divide is not equal to 0");
                }
                result = num1/num2;
               //links http://localhost:8080/calculate/8/2/divide
                    break;
            default:
                throw  new IllegalArgumentException("ERROR Operation nto working");


        }
        Calculate Object = new Calculate(result,operation);
        return Object;


    }




}*/







