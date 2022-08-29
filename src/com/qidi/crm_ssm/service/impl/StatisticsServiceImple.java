package com.qidi.crm_ssm.service.impl;


import org.springframework.stereotype.Service;

import com.qidi.crm_ssm.bean.IndustryStatistics;
import com.qidi.crm_ssm.bean.SourceStatistics;
import com.qidi.crm_ssm.dao.StatisticsDao;
import com.qidi.crm_ssm.service.StatisticsService;

import javax.annotation.Resource;

@Service("statisticsService")
public class StatisticsServiceImple implements StatisticsService {

    @Resource(name = "statisticsDao")
    private StatisticsDao sd;

    @Override
    public IndustryStatistics queryInd() {
        IndustryStatistics industryStatistics = new IndustryStatistics(sd.getEducate(),sd.getElectric(),sd.getOutTrade(),sd.getHotel(),sd.getEstate());
        return industryStatistics;
    }

    @Override
    public SourceStatistics querySour() {
        SourceStatistics sourceStatistics = new SourceStatistics(sd.getPhonee(),sd.getInternet());
        return sourceStatistics;
    }
}
