package com.example.hystrix.server.hystrixserver.controller;

import com.example.hystrix.server.hystrixserver.dto.ResponseDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class AppController {

    @RequestMapping(value = "/getSimpleResponse", method = RequestMethod.GET)
    public ResponseDTO getSimpleResponse() {
        ResponseDTO responseDTO = new ResponseDTO();
        return responseDTO;
    }
}
