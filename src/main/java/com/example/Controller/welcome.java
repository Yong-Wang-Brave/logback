package com.example.Controller;




import lombok.extern.log4j.Log4j2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;


/**
 * @author Think
 * @Title: welocome
 * @ProjectName token-authentication
 * @Description: TODO
 * @date 2019/1/1815:4112211
 */
@RestController
@Log4j2
public class welcome {

    Logger logger = LoggerFactory.getLogger(welcome.class);

    @GetMapping("/get")
    public String get() {
        log.info("get");
        return "get";
    }

}
