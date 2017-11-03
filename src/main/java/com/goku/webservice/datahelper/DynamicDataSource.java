package com.goku.webservice.datahelper;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by nbfujx on 2017/10/18.
 */
public class DynamicDataSource extends AbstractRoutingDataSource  {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }

}
