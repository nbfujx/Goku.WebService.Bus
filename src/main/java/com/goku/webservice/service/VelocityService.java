package com.goku.webservice.service;

/**
 * Created by nbfujx on 2017-11-03.
 */
public interface VelocityService {
    Object doProess(String BsCode, String Operation, String sqltemplate, Object Para);
}
