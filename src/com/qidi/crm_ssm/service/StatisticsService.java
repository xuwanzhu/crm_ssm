package com.qidi.crm_ssm.service;

import com.qidi.crm_ssm.bean.IndustryStatistics;
import com.qidi.crm_ssm.bean.SourceStatistics;

public interface StatisticsService {
    public IndustryStatistics queryInd();

    public SourceStatistics querySour();
}
