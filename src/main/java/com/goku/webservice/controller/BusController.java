package com.goku.webservice.controller;

import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by nbfujx on 2017-10-26.
 */
@Component
@WebService
public interface BusController {

    @WebMethod
    String process(@WebParam(name = "para") String para);
}
