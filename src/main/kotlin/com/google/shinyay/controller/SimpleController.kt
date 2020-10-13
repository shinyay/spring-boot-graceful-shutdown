package com.google.shinyay.controller

import com.google.shinyay.logger
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @GetMapping("/")
    fun justController() {
        logger.info("Start: Controller")
        runBlocking {
            (1..5).forEach {
                logger.info("$it:${Thread.currentThread().name}: delaying")
                delay(1000)
                logger.info("$it:${Thread.currentThread().name}: done")
            }
        }
        logger.info("End: Controller")
    }
}