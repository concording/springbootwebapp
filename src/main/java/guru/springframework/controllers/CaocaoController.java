package guru.springframework.controllers;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CaocaoController {

    private static final Logger logger = LoggerFactory.getLogger(CaocaoController.class);

    @RequestMapping(value = "/order", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    String index(@RequestParam Map<String, String> paramMap) throws Exception{

        /**
         * {"ext_order_id":"493173102000","sign":"36e9ce4361fe8ab5081ec94dfc3e95d2c6fd170c","event":"4","order_id":"493173102000"
         * ,"sign_key":"55f4afd5437ddc8fed1cc7cdcb126eb2","timestamp":"1603876976883"}
         */
        Gson gson = new Gson();
        logger.info("订单接到回调请求=" + gson.toJson(paramMap));
        return "index";
    }
}
