package com.engobytes.emailsender.api.controler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController("/email")
public class EmailController {

    @PostMapping
    public HttpStatus sendEmailWithTemplate(){

        return HttpStatus.ACCEPTED;
    }

}
