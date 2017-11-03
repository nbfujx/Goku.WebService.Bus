package com.goku.webservice.Interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.goku.webservice.mapper.checkMapper;
import com.goku.webservice.model.gokuIpList;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by nbfujx on 2017-11-03.
 */
public class IpAddressInInterceptor extends AbstractPhaseInterceptor<Message> {

    @Autowired
    private checkMapper checkmapper;

    public IpAddressInInterceptor() {
        super(Phase.RECEIVE);
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
        String ipAddress = request.getRemoteAddr(); // 取客户端IP地址
        gokuIpList gokuiplist=checkmapper.GetIpLimt(ipAddress);
        if(gokuiplist==null)
        {
            throw new Fault(new IllegalAccessException("IP地址" + ipAddress + "未定义"));
        }else
        {
            if("N".equals(gokuiplist.getLimitflag()))
            {
                throw new Fault(new IllegalAccessException("IP地址" + ipAddress + "在黑名单"));
            }
        }
    }
}
