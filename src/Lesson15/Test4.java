package Lesson15;

public class Test4 {
    public static void main(String[] args) {
        int a = 5;//++a = 6(сначала увеличиваем, потом сравниваем)
        while(++a > 10){
            a++;
        }
        System.out.println(a);
    }
}

class Test41 {
        public static void main(String[] args) {
            int a = 5;//a = 5 < 10 потом увеличиваем на 1, затем идем в тело цикла
            while(a++ < 10){
                a++;
            }
            System.out.println(a);//в итоге предпоследнее значение будет 9 < 10, увеличиваем на 1 и входим в цикл, получаем 11, 11 проверку не проходит но в увеличивается по условию и результат 12
        }
    }


