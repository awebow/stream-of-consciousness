package com.awebow.consciousness

enum class Mbti(
    val attitude: Attitude,
    val perceivingFunction: PerceivingFunction,
    val judgingFunction: JudgingFunction,
    val lifestyle: Lifestyle,
) {
    ESTJ(Attitude.EXTROVERSION, PerceivingFunction.SENSING, JudgingFunction.THINKING, Lifestyle.JUDGING),
    ESTP(Attitude.EXTROVERSION, PerceivingFunction.SENSING, JudgingFunction.THINKING, Lifestyle.PERCEPTION),
    ESFJ(Attitude.EXTROVERSION, PerceivingFunction.SENSING, JudgingFunction.FEELING, Lifestyle.JUDGING),
    ESFP(Attitude.EXTROVERSION, PerceivingFunction.SENSING, JudgingFunction.FEELING, Lifestyle.PERCEPTION),
    ENTJ(Attitude.EXTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.THINKING, Lifestyle.JUDGING),
    ENTP(Attitude.EXTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.THINKING, Lifestyle.PERCEPTION),
    ENFJ(Attitude.EXTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.FEELING, Lifestyle.JUDGING),
    ENFP(Attitude.EXTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.FEELING, Lifestyle.PERCEPTION),
    ISTJ(Attitude.INTROVERSION, PerceivingFunction.SENSING, JudgingFunction.THINKING, Lifestyle.JUDGING),
    ISTP(Attitude.INTROVERSION, PerceivingFunction.SENSING, JudgingFunction.THINKING, Lifestyle.PERCEPTION),
    ISFJ(Attitude.INTROVERSION, PerceivingFunction.SENSING, JudgingFunction.FEELING, Lifestyle.JUDGING),
    ISFP(Attitude.INTROVERSION, PerceivingFunction.SENSING, JudgingFunction.FEELING, Lifestyle.PERCEPTION),
    INTJ(Attitude.INTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.THINKING, Lifestyle.JUDGING),
    INTP(Attitude.INTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.THINKING, Lifestyle.PERCEPTION),
    INFJ(Attitude.INTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.FEELING, Lifestyle.JUDGING),
    INFP(Attitude.INTROVERSION, PerceivingFunction.INTUITION, JudgingFunction.FEELING, Lifestyle.PERCEPTION);

    enum class Attitude { EXTROVERSION, INTROVERSION }
    enum class PerceivingFunction { SENSING, INTUITION }
    enum class JudgingFunction { THINKING, FEELING }
    enum class Lifestyle { JUDGING, PERCEPTION }
}
