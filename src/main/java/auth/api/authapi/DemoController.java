package auth.api.authapi.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
@Controller
@RequestMapping("/")
public class DemoController {
   @ResponseBody
   @RequestMapping(method = GET, produces = "application/json")
   public String demo() {
       return "{\"hello\":\"world\"}";
   }
}