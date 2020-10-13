package com.google.shinyay.service

import com.google.shinyay.logger
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Service

@Service
class SimpleService {

    fun justService() {
        logger.info("Start: Service")
        runBlocking {
            (1..5).forEach {
                logger.info("$it:${Thread.currentThread().name}: Service - delaying")
                delay(1000)
                logger.info("$it:${Thread.currentThread().name}: Service - done")
            }
        }
        logger.info("End: Service")
    }
}