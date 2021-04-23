package ovh.sixbt.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/_")
    @ResponseBody
    public String healtcheck(){
        return "Everything's fine !";
    }
}
