package hw_2_1;

import com.sun.webkit.dom.DocumentFragmentImpl;

public class Main {

    /**
     * 1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
     * Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
     * <p>
     * 2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
     * участники должны выполнять соответствующие действия (бежать или прыгать),
     * результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
     * <p>
     * 3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
     * <p>
     * 4. * У препятствий есть длина (для дорожки) или высота (для стены),
     * а участников ограничения на бег и прыжки. Если участник не смог пройти одно из препятствий,
     * то дальше по списку он препятствий не идет.
     * <p>
     * 5. ** Задание с enum, в материалах к уроку
     */
    public static void main(String[] args) {


        RunJump[] runJump = {
                new Human(10, 2),
                new Cat(15, 1),
                new Robot(20, 3),
        };

        Obstacles[] obstacles = {
                new RunRode(5),
                new Wall(1),
                new RunRode(15),
                new Wall(2),
                new RunRode(25),
                new Wall(2),
        };

        for (int i = 0; i < runJump.length; i++) {
            runJump[i].jump();
            runJump[i].run();
            for (int j = 0; j < obstacles.length; j++) {
               if ( obstacles[j].getJump() != 0 ){
                   obstacles[j].can(runJump[i].getJump());

                   if (!obstacles[j].getCanDoIt()){
                       break;
                   }

               }else {
                    obstacles[j].can(runJump[i].getRun());

                   if (!obstacles[j].getCanDoIt()){
                       break;
                   }

                }

            }
        }

    }
}
