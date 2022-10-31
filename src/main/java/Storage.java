import java.util.ArrayList;

public class Storage {
    private ArrayList<String> quoteList;
    Storage()
    {
        quoteList = new ArrayList<>();
        quoteList.add("Здравствуй, сотрудник детского технопарка Кванториум! Чем могу помочь?");
        quoteList.add("Хорошего тебе дня! Тебе нужна моя помощь?");
        quoteList.add("Не падай духом, боец! Хорошего дня! Могу чем-то помочь?");
    }

    String getRandQuote()
    {
        //получаем случайное значение в интервале от 0 до самого большого индекса
        int randValue = (int)(Math.random() * quoteList.size());
        //Из коллекции получаем цитату со случайным индексом и возвращаем ее
        return quoteList.get(randValue);
    }
}

