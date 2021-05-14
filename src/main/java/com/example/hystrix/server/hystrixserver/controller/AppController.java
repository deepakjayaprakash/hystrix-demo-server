package com.example.hystrix.server.hystrixserver.controller;

import com.example.hystrix.server.hystrixserver.dto.ResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {
    Logger logger = LoggerFactory.getLogger(AppController.class);

    @RequestMapping(value = "/getSimpleResponse", method = RequestMethod.GET)
    public ResponseDTO getSimpleResponse() throws Exception {
        ResponseDTO responseDTO = new ResponseDTO();
        int random = (int) (Math.random() * 100);
        System.out.println(random);
        if (random % 2 == 0) {
            System.out.println("bad request");
            throw new Exception();
        } else {
            System.out.println("good request");
            return responseDTO;
        }
    }
}
