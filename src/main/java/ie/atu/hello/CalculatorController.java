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
                if (num2 == 0){
                    throw new IllegalArgumentException("Divide is not equal to 0");
                }
                result = num1/num2;

                break;
            default:

               throw  new IllegalArgumentException("ERROR Operation nto working");
        }
        Calculate object = new Calculate(result,operation);
        return object;
    }

   /* @GetMapping
    public String Calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation, @PathVariable int result){

        switch (operation){
            case "ADD":
            case"add":
                result = num1 +num2;
                break;
            case "SUBTRACt":
            case "subtract":
                result = num1 -num2;
                break;
            case "MULTIPLY":
            case "multiply":
                result = num1 * num2;
            case "DIVIDE":
            case "Divide":
                result = num1/num2;

            default:





        }
        return "operation = " + result;

    }*/

    /*@GetMapping("/calculate{num1}")
    public int add(@PathVariable int num1){
        return num1;

    }*/

}
   /* @GetMapping("/calculate")
    public String calculate(@RequestParam String num1, @RequestParam String num2, @RequestParam String operation, @RequestParam int subtract){
            return "num1 = num2 = operation = -  " + num1 + num2 + operation + subtract;
    }*/







