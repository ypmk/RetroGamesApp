package app.test.retrogamesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank{

    private static List<QuestionsList> firstLayoutQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Как звали первого космонавта?", "Юрий Алексеевич Гагарин", "Алексей Леонов", "Илон Маск", "Нил Армстронг", "Юрий Алексеевич Гагарин", "");
        final QuestionsList question2 = new QuestionsList("Какого числа человек впервые полетел в космос?", "12.04.1968", "12.04.1961", "15.01.1962", "12.04.1963", "12.04.1961", "");
        final QuestionsList question3 = new QuestionsList("Как назывался корабль Ю.А.Гагарина?", "Восход-1", "Союз", "Буран", "Аполлон", "Восход-1", "");
        final QuestionsList question4 = new QuestionsList("Кто первым вышел из корабля в открытый космос?", "Ю.А.Гагарин", "Герман Титов", "Алексей Леонов", "Валентина Терешкова", "Алексей Леонов", "");
        final QuestionsList question5 = new QuestionsList("Имя человека, который впервые оказался на поверхности Луны", "Нил Армстронг", "Герман Титов", "Андриан Николаев", "Владимир Комаров", "Нил Армстронг", "");
        final QuestionsList question6 = new QuestionsList("Ю.А.Гагарин во время старта произнес?", "Вперед!", "Поехали!", "До свидания!", "Встречай, синева!", "Поехали!", "");
        final QuestionsList question7 = new QuestionsList("Какой позывной был у Терешковой?", "Чайка", "Алмаз", "Стрела", "Сокол", "Чайка", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);

        return questionsLists;
    }

    private static List<QuestionsList> secondLayoutQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Именно там находился первый в СССР Центр дальней космической связи", "Королев", "Крым", "Звездный городок", "Куйбышев", "Крым", "");
        final QuestionsList question2 = new QuestionsList("Во время первого полета многоместного коробля этого типа космонавты впервые были без скафандров", "Салют", "Восход", "Союз", "Дружба", "Восход", "");
        final QuestionsList question3 = new QuestionsList("Кто является изобретателем первых советских кораблей?", "Королев", "Хруничев", "Циолковский", "Басов", "Королев", "");
        final QuestionsList question4 = new QuestionsList("Именно такое название получила орбитальная станция \"Салют-8\" ", "Буран", "Звезда", "Мир", "Дружба", "Мир", "");
        final QuestionsList question5 = new QuestionsList("Какой позывной был у Гагарина?", "Кедр", "Орел", "Сокол", "Лист", "Кедр", "");
        final QuestionsList question6 = new QuestionsList("На месте посадки Гагарину за его полет в космос была вручена медаль:", "Золотая звезда", "За освоение целинных земель", "За освоение космического океана", "Героя труда", "За освоение целинных земель", "");
        final QuestionsList question7 = new QuestionsList("Назовите русского ученого, основоположника космонавтики:", "Королев", "Циолковский", "Тихонравов", "Басов", "Циолковский", "");



        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);

        return questionsLists;
    }

    private static List<QuestionsList> thirdLayoutQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Как называется самая близкая к Земле звезда?", "Солнце", "Альфа Центавра", "Сириус", "Альдебаран", "Солнце", "");
        final QuestionsList question2 = new QuestionsList("Вблизи какой звезды проходит ось земного вращения?", "Антарес", "Сириус", "Альдебаран", "Полярная", "Полярная", "");
        final QuestionsList question3 = new QuestionsList("Как называется самая близкая к Земле звезда?", "Солнце", "Альфа Центавра", "Сириус", "Орион", "Солнце", "");
        final QuestionsList question4 = new QuestionsList("Как называется наука, изучающая звезды?", "Астрология", "Астрономия", "Геология", "Эзотерика", "Астрономия", "");
        final QuestionsList question5 = new QuestionsList("В какой цвет окрашены самые яркие и горячие звезды?", "Оранжевый", "Красный", "Синий", "Белый", "Синий", "");
        final QuestionsList question6 = new QuestionsList("В каком созвездии расположена Полярная звезда?", "Кассиопея", "Большая Медведица", "Малая Медведица", "Орион", "Малая Медведица", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> fourthLayoutQuestions() {
        final List<QuestionsList> questionsLists = new ArrayList<>();


        final QuestionsList question1 = new QuestionsList("Сколько планет в солнечной системе?", "8", "9", "4", "1", "8", "");
        final QuestionsList question2 = new QuestionsList("Самая большая планета солнечной системы?", "Сатурн", "Юпитер", "Марс", "Нептун", "Юпитер", "");
        final QuestionsList question3 = new QuestionsList("Самая ближайшая к Солнцу планета?", "Венера", "Юпитер", "Меркурий", "Нептун", "Меркурий", "");
        final QuestionsList question4 = new QuestionsList("В каком направлении вращается наша Земля?", "по часовой стрелке", "против часовой стрелки", "с севера на юг", "с юга на север", "против часовой стрелки", "");
        final QuestionsList question5 = new QuestionsList("Что означает слово \"Планета\"?", "вращающаяся", "холодная", "блуждающая", "шарообразная", "блуждающая", "");
        final QuestionsList question6 = new QuestionsList("Как называют систему мира, созданную Коперником?", "геоцентрическая", "планетарная", "гелиоцентрическая", "универсальная", "гелиоцентрическая", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);


        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Космонавты":
                return firstLayoutQuestions();
            case "История":
                return secondLayoutQuestions();
            case "Созвездия":
                return thirdLayoutQuestions();
            default:
                return fourthLayoutQuestions();
        }
    }
}