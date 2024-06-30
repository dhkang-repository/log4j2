package com.example.log4j2.sync;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Slf4j
public class SyncTest {

    static public void sync() {
        long startTime = System.currentTimeMillis();

        int max = 1_000_000;
        for(int i = 0; i < max; i++) {
            if( i % 20_000 == 0) {
                System.out.println("SyncTest i : " + i);
            }
            log.info("{} logger class : {}, {}", i, log.getClass(), LocalDateTime.now());
        }

        long endTime = System.currentTimeMillis();

        System.out.println("SyncTest Perf Time : " + (endTime - startTime));
    }
}
