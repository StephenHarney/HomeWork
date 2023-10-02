package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

    @GetMapping("/calculate")
    public String Calculate(@RequestParam int num1,@RequestParam int num2,@RequestParam String operation, @RequestParam int result) {



        switch (operation) {
            case "ADD":
            case "add":

                result = num1 + num2;
                break;
            case "SUBTRACT":
            case "subtract":
            result = num1 - num2;
                break;
            case "MULTIPLY":
            case "multiply":

                result = num1 * num2;
                break;
            case "DIVIDE":
            case "Divide":

                result = num1/num2;

                break;
            default:


        }
        return "Operation =" + result;

    }
}

