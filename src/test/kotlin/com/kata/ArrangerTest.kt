package com.kata

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class ArrangerTest {

    val arranger = Arranger()

    @Test
    fun `returnTwo should return 2`() {
        val result = Arranger().returnTwo()
        result shouldBe 2
    }

}

