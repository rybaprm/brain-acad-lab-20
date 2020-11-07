package ua.zp.brainacad;
//6. Создать класс Main
//        • Создать psvm
//        • Создать экземпляры классов XmlData, BinaryData, NumericData ()
//        • В качестве id передать инкрементное значение счетчика ID_COUNTER
//        • Подготовить данные для объектов:
//        XmlData – “ <?xml version="1.0"?><Tests>qwerty</Tests>”
//        BinaryData – получить массив байт из тестовой строки «Данные в байтах»
//        NumericData – любое число например Double d = 123.456789;
//        • С помощью метода DocumentProcessorUtil.build() объединить данные с
//        обьектом.
//        • С помощью метода DocumentProcessorUtil. convert(); преобразовать
//        первоначальные объекты в StringData
//        • Вывести данные из всех полученных StringData на экран.
//        7. Добавить абстрактный метод в класс AbstractData - abstract String convertToString();
//        8. Реализовать этот метод во всех дочерних классах. Метод должен правильно
//        преобразовать хранящееся данные в строковый вид.
//        9. В конструкторе класса StringData изменить присвоение данных. Вызывать новый
//        метод convertToString(). Примечание из Generic можно убрать Storable

public class Main {

    public static void main(String[] args) {

        /**
         * Use Storable array to collect instances XmlData, BinaryData, NumericData
         */

        Storable[] storableObjects = {
                new XmlData(DocumentProcessorUtil.ID_COUNTER++),
                new BinaryData(DocumentProcessorUtil.ID_COUNTER++),
                new NumericData(DocumentProcessorUtil.ID_COUNTER++)
        };


        /**
         * Convert byte array to Byte Wrapper array
         */
        byte[] binary = "Данные в байтах".getBytes();
        Byte[] bytes = new Byte[binary.length];
        int i = 0;
        for (byte b : binary) {
            bytes[i++] = b;
        }

        /**
         * Use Object array to collect some data provided to instances XmlData, BinaryData, NumericData
         */
        Object[] datesToInstances = {
                "<?xml version=\"1.0\"?><Tests>qwerty</Tests>",
                bytes,
                Double.valueOf(123.456789)
        };

        /**
         * Use in cycle static methods of DocumentProcessorUtil Class
         */
        for (int j = 0; j < storableObjects.length; j++) {
            DocumentProcessorUtil.build(storableObjects[j], datesToInstances[j]);
            if (storableObjects[j] instanceof XmlData) {
                System.out.println(DocumentProcessorUtil.convert((XmlData) storableObjects[j]));
            }
            if (storableObjects[j] instanceof BinaryData) {
                System.out.println(DocumentProcessorUtil.convert((BinaryData) storableObjects[j]));
            }
            if (storableObjects[j] instanceof NumericData) {
                System.out.println(DocumentProcessorUtil.convert((NumericData) storableObjects[j]));
            }
        }
    }
}
