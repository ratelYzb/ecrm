package com.hx.ecrm.service.impl;

import com.hx.ecrm.service.RootService;
import org.springframework.stereotype.Service;

/**
 * @author ratel
 * @create 2018/12/24
 */
@Service
public class RootServiceImpl implements RootService {

    @Override
    public String getAppName() {
        return "ecrm";
    }
}
