public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        byte age = 14;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }
        //Задача 2
        System.out.println("Задача 2");
        byte temperature = 8;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        }
        if (temperature > 5) {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
        //Задача 3
        System.out.println("Задача 3");
        byte speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется платить штраф.");
        }
        if (speed < 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
        //Задача 4
        System.out.println("Задача 4");
        byte ageTask4 = 19;
        if (ageTask4 >= 2 && ageTask4 <= 6) {
            System.out.println("Если возраст человека равен " + ageTask4 + ", то ему нужно ходить в детский сад.");
        }
        if (ageTask4 >= 7 && ageTask4 <= 17) {
            System.out.println("Если возраст человека равен " + ageTask4 + ", то ему нужно ходить в школу.");
        }
        if (ageTask4 >= 18 && ageTask4 <= 24) {
            System.out.println("Если возраст человека равен " + ageTask4 + ", то ему нужно ходить в университет.");
        }
        //Задача 5
        System.out.println("Задача 5");
        byte ageTask5 = 6;
        if (ageTask5 < 5) {
            System.out.println("Если возраст ребенка " + ageTask5 + ", то ему нельзя кататься на аттракционе");
        }
        if (ageTask5 > 5 && ageTask5 < 14) {
            System.out.println("Если возраст ребенка " + ageTask5 + ", то ему можно кататься на аттракционе, но в сопровождении взрослого. Если взрослого нет кататься нельзя.");
        }
        if (ageTask5 >14) {
            System.out.println("Если возраст ребенка " + ageTask5 + ", то ему можно кататься на аттракционне без сопровождения взрослого.");
        }
        //Задача 6
        System.out.println("Задача 6");
        byte people = 102;
        if (people < 60) {
            System.out.println("В вагоне поезда занято " + people + " сидячих мест, в вагоне еще остались свободные сидячие места");
        } else if (people >= 60 && people < 102){
            System.out.println("В вагоне поезда заняты сидячие места, но есть еще стоячие места.");
        } else {
            System.out.println("Вагон полностью забит");
        }
        //Задача 7
        System.out.println("Задача 7");
        byte one = 5;
        byte two = 8;
        byte three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " больше чисел " + two + " и " + three);
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " больше чисел " + one + " и " + three);
        } else {
            System.out.println("Число " + three + " больше чисел " + two + " и " + one);
        }
    }
}