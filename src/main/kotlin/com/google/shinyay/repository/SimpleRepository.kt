package com.google.shinyay.repository

import com.google.shinyay.logger
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import org.springframework.stereotype.Repository

@Repository
class SimpleRepository {

    fun justRepository() {
        logger.info("Start: Repository")
        runBlocking {
            (1..5).forEach {
                logger.info("$it:${Thread.currentThread().name}: Repository - delaying")
                delay(1000)
                logger.info("$it:${Thread.currentThread().name}: Repository - done")
            }
        }
        logger.info("End: Repository")
    }
}