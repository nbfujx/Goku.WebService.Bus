package com.goku.webservice.service;

import com.goku.webservice.model.gokuTranlogWithBLOBs;
import com.goku.webservice.util.RequestUtil.Header;

/**
 * Created by nbfujx on 2017-10-31.
 */
public interface checkService {
    String checkheader(Header header);
    int SaveTranlog(gokuTranlogWithBLOBs gokutranlog);
}
