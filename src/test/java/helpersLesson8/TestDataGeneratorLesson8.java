package helpersLesson8;

import org.apache.commons.lang3.RandomStringUtils;
    // 1) генерировать случайную строку для создания плейлиста
public class TestDataGeneratorLesson8 {
    // я хочу эту функцию сделать статик.
    //почему? я не хочу создавать объект я хочу создавать строку.
    public static String getRandomStringLesson8(int length) {
        // from the website: https://www.baeldung.com/java-random-string
        // я копирую функцию Generate Bounded Random String With Apache Commons Lang

        // int length = 10 --- I don't need this. я удаляю потому что It will come from an argument.
        boolean useLetters = true;
        boolean useNumbers = false;
        return RandomStringUtils.random(length, useLetters, useNumbers); // decided (String generatedString =)
        // and make "return"

        //моя функция getRandomStringLesson8 будет в
        //качестве аргумента брать какую-то длинную и будет возвращать строку
        // а вот этой длины RandomStringUtils.random(length, useLetters, useNumbers);

        // GO TO --------> PlaylistTestsLesson8
    }
}