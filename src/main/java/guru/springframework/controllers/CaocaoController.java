package guru.springframework.controllers;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CaocaoController {

    private static final Logger logger = LoggerFactory.getLogger(CaocaoController.class);

    @RequestMapping(value = "/order", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    String index( MultiValueMap paramMap) throws Exception{

        Gson gson = new Gson();
        logger.info("订单接到回调请求=" + gson.toJson(paramMap));
        return "index";
    }
}
