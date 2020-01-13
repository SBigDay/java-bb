package com.program.shop.test;

import com.program.shop.util.HttpUtil;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ScheduledTest {
    private int i=0;
    @Scheduled(cron = "0 0/1 * * * ?")
    public void comeon() throws IOException {
        String url="https://user.qzone.qq.com/815333900";
        HttpUtil.doGet(url);
        i++;
        System.out.println(i);
    }
}
