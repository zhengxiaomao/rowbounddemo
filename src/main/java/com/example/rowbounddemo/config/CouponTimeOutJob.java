package com.example.rowbounddemo.config;


import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.quartz.QuartzJobBean;

@Slf4j
public class CouponTimeOutJob extends QuartzJobBean {

    //最大线程数控制
    private static int MAX_THREADS = 5;
    //跑批分页大小
    private static int EXPIRED_PAGE_SIZE = 50;

    @Value("${coupon.timeout.switch}")
    private Integer couponTimeoutSwitch;

//    @Autowired
//    private CouponService couponService;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        //这里写业务代码
        System.out.println("定时任务执行了..........");
    }

}

