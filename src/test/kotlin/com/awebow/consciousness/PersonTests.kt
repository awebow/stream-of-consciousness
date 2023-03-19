package com.awebow.consciousness

import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.mockkStatic
import io.mockk.unmockkStatic
import java.time.LocalDate

class PersonTests : FreeSpec({

    "나이 계산 테스트" - {
        withData(
            nameFn = { (now, birthday) -> "현재: $now, 생일: $birthday" },
            row(LocalDate.of(2022, 7, 11), LocalDate.of(1997, 7, 12), 24),
            row(LocalDate.of(2022, 7, 12), LocalDate.of(1997, 7, 12), 25),
        ) { (now, birthday, expectedAge) ->
            mockkStatic(LocalDate::class)
            every { LocalDate.now() } returns now
            mockk<Person>().also {
                every { it.birthday } returns birthday
                every { it.age } answers { callOriginal() }
                it.age shouldBe expectedAge
            }
            unmockkStatic(LocalDate::class)
        }
    }

})