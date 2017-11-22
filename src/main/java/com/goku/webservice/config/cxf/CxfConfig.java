package com.goku.webservice.config.cxf;

import com.goku.webservice.Interceptor.IpAddressInInterceptor;
import com.goku.webservice.controller.BusController;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
/**
 * Created by nbfujx on 2017/11/22.
 */
@Configuration
public class CxfConfig {

    @Autowired
    private Bus bus;

    @Autowired
    private BusController buscontroller;

    @Bean
    public IpAddressInInterceptor ipAddressInInterceptor()
    {
        return new IpAddressInInterceptor();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus,buscontroller);
        endpoint.publish("/BusService");//接口发布在 /NetbarServices 目录下
        endpoint.getInInterceptors().add(ipAddressInInterceptor());
        return endpoint;
    }

}
