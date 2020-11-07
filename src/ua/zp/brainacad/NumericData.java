package ua.zp.brainacad;
//4. Создать классы NumericData, BinaryData, XmlData.
//        • Отнаследовать классы от AbstractData
//        • Для всех классов создать константное значение с типом (из enum-а Type)
//        • Для всех классов добавить поля data (но для каждого с разным типом)
//        • XmlData – строка с xml
//        • BinaryData – массив байтов
//        • NumericData – абстрактный числовой тип (Number)
//        • Реализовать интерфейс Storable<класс>

public class NumericData extends AbstractData implements Storable<Number> {
    private static Type type = Type.NUM;
    private Number data;

    public NumericData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return String.valueOf(data);
    }

    @Override
    public Number read() {
        return data;
    }

    @Override
    public void write(Number data) {
        this.data = data;
    }

    @Override
    public Type getType() {
        return type;
    }
}
