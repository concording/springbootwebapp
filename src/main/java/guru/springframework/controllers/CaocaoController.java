package guru.springframework.controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class CaocaoController {
    @PostMapping("/order")
    String index(@RequestBody Object object){

        Gson gson = new Gson();
        System.out.println(gson.toJson(object));
        return "index";
    }
}
