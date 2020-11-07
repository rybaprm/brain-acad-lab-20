package ua.zp.brainacad;
//2. Создать интерфейс Storable
//        • В интерфейс добавить обобщения <S>, где S – внутренний тип для поля data;
//        • Описать методы:
//        S read();
//        void write(S data);
//        Type getType();

public interface Storable<S> {
    S read();

   void write(S data);

    Type getType();


}
