package com.google.shinyay.controller

import com.google.shinyay.logger
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleController {

    @GetMapping("/")
    fun justController() {
        logger.info("Start: Controller")
        logger.info("End: Controller")
    }
}