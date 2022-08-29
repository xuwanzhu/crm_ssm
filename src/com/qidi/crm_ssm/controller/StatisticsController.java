package com.qidi.crm_ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qidi.crm_ssm.bean.IndustryStatistics;
import com.qidi.crm_ssm.bean.SourceStatistics;
import com.qidi.crm_ssm.service.StatisticsService;

import javax.annotation.Resource;

@Controller
public class StatisticsController {


    @Resource(name="statisticsService")
    private StatisticsService ss;

    @RequestMapping("queryind.do")
    public String queryInd(Model model){
        IndustryStatistics is = ss.queryInd();
        System.out.println(is.toString());
        model.addAttribute("industrys",is);
        return "jsp/statistics/industry.jsp";
    }

    @RequestMapping("querysour.do")
    public String querysour(Model model){
        SourceStatistics sos = ss.querySour();
        System.out.println(sos.toString());
        model.addAttribute("sources",sos);
        return "jsp/statistics/source.jsp";
    }
}
