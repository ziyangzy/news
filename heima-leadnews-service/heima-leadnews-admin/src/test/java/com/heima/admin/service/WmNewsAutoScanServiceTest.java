
package com.heima.admin.service;

import com.heima.admin.WemediaApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@SpringBootTest(classes = WemediaApplication.class)
@RunWith(SpringRunner.class)
@Slf4j
public class WmNewsAutoScanServiceTest {

    @Autowired
    private WmNewsAutoScanService wmNewsAutoScanService;

    @Test
    public void autoScanWmNews() {

        wmNewsAutoScanService.autoScanWmNews(6233);
    }
}
