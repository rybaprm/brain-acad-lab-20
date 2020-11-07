package ua.zp.brainacad;
//3. Jeneric в конструкторе.
//        • Создать класс StringData наследующий AbstractData
//        • В классе создать 2 поля:
//        Type type; // создать enum c типами (XML,BIN,NUM)
//        String data; // данные файла в виде строки
//        • Создать конструктор с полями long id, Type type, T data
//        • Указать Generic для конструктора <T extends AbstractData & Storable>
//• В конструкторе выполнить присвоение полей, а для поля сохранить строковое
//        представление пришедшего объекта (toString();)

public class StringData extends AbstractData {
    public Type type;
    public String data;

    //public <T extends AbstractData & Storable> StringData(long id, Type type, T data) {
    public <T extends AbstractData> StringData(long id, Type type, T data) {
        super(id);
        this.type = type;
        this.data = data.convertToString();
    }

    @Override
    String convertToString() {
        return data;
    }

    @Override
    public String toString() {
        return "StringData{" +
                "id=" + getId() +
                ", type=" + type +
                ", data=\"" + data +
                "\"}";
    }
}
