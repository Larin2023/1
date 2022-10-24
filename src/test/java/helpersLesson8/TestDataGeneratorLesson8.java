package helpersLesson8;

import org.apache.commons.lang3.RandomStringUtils;
    // 1) генерировать случайную строку
public class TestDataGeneratorLesson8 {
    // я хочу эту функцию сделать статик.
    //почему? я не хочу создавать объект test data generator.
    public static String getRandomStringLesson8(int length) {

        // int length = 10 --- I don't need this. It will come from an argument.
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers); // decided (String generatedString =)
        // and make "return"
    }
}