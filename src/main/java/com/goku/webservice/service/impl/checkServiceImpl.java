package com.goku.webservice.service.impl;

import com.goku.webservice.datahelper.DataSource;
import com.goku.webservice.mapper.checkMapper;
import com.goku.webservice.model.gokuAuthority;
import com.goku.webservice.model.gokuBussiness;
import com.goku.webservice.model.gokuTranlogWithBLOBs;
import com.goku.webservice.model.gokuUserinfo;
import com.goku.webservice.service.checkService;
import com.goku.webservice.util.RequestUtil.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nbfujx on 2017-10-31.
 */
@Service
@DataSource("tran")
public class checkServiceImpl implements checkService {

    @Autowired
    private checkMapper checkmapper;

    @Override
    public String checkheader(Header header) {
        String user_id = header.getUser_id();
        String password = header.getPassword();
        String tran_no = header.getTran_no();
        String bs_code = header.getBs_code();
        if (checkbs_code(bs_code,tran_no)) {
            gokuUserinfo gokuuserinfo = checkmapper.GetUserinfo(user_id);
            if (gokuuserinfo == null) {
                return user_id + "用户不存在!";
            } else {
                if (!gokuuserinfo.getPassword().equals(password)) {
                    return user_id + "用户密码不正确!";
                } else {
                    gokuAuthority gokuauthority = checkmapper.GetAuthority(gokuuserinfo.getUserid(),bs_code,tran_no);
                    if (!"Y".equals(gokuauthority.getAuth())) {
                        return user_id + "无操作权限!";
                    }
                }
            }
            return null;
        }else
        {
            return "无相关操作类型!";
        }
    }

    @Override
    public int SaveTranlog(gokuTranlogWithBLOBs gokutranlog) {
        return checkmapper.SaveTranlog(gokutranlog);
    }


    private Boolean checkbs_code(String bs_code,String tran_no)
    {
        gokuBussiness gokubus=checkmapper.GetBussiness(bs_code,tran_no);
        if(gokubus==null)
        {
            return false;
        }else
        {
            return true;
        }
    }
}
