package ua.zp.brainacad;
//1. Создать абстрактный класс AbstractData
//        • Добавить в него поле: long id;
//        • Создать конструктор с параметром
//        • Создать геттер для ID
//        • Никаких абстрактных методов пока не нужно.

public abstract class AbstractData {
    private long id;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    abstract String convertToString();
}
