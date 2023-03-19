package com.awebow.consciousness

import java.time.LocalDate
import java.time.MonthDay

class Person(
    val name: String,
    val birthday: LocalDate,
    val gender: Gender,
    val bloodType: BloodType.RhAbo,
    val heightInCentimeters: Int,
    val weightInKilograms: Int,
    val mbti: Mbti,
) {
    val age get() = LocalDate.now().let { now ->
        if (MonthDay.from(now) < MonthDay.from(birthday)) {
            now.year - birthday.year - 1
        } else {
            now.year - birthday.year
        }
    }
}
