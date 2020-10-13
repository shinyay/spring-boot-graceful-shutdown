package com.google.shinyay.controller

import com.google.shinyay.logger
import com.google.shinyay.service.SimpleService
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController(val service: SimpleService) {

    @GetMapping("/")
    fun justController() {
        logger.info("Start: Controller")
        runBlocking {
            (1..5).forEach {
                logger.info("$it:${Thread.currentThread().name}: Controller - delaying")
                delay(1000)
                logger.info("$it:${Thread.currentThread().name}: Controller - done")
            }
            service.justService()
        }
        logger.info("End: Controller")
    }
}