package com.zl.ssm.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by zhangli on 16/7/31 21:27.<br/>
 */
public class MultipleDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> dataSourceKey = new InheritableThreadLocal<String>();

    public static void setDataSourceKey(String dataSource) {
        dataSourceKey.set(dataSource);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return dataSourceKey.get();
    }
}
