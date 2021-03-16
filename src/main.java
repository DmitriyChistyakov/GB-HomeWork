public class main {
    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла и условия заменить 0 на 1, 1 на 0;
    2. Задать пустой целочисленный массив размером 8.
       С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
       пройти по нему циклом, и числа меньшие 6 умножить на 2;
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
       и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        граница показана символами ||, эти символы в массив не входят.
    7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        при этом метод должен сместить все элементы массива на n позиций.
        Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
        при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
        При каком n в какую сторону сдвиг можете выбирать сами.  */

    public static void main(String[] args) {
        System.out.println("Задание 1: ");
        doTask1();
        System.out.println();
        System.out.println("Задание 2: ");
        doTask2();
        System.out.println();
        System.out.println("Задание 3: ");
        doTask3();
        System.out.println();
        System.out.println("Задание 4: ");
        doTask4();
        System.out.println();
        System.out.println("Задание 5*: ");
        doTask5();
        System.out.println();
        System.out.println("Задание 6*: ");
        doTask6();
        System.out.println();
    }

    public static void doTask1() {
        System.out.println("1 1 0 0 1 0 1 1 0 0"); /* Вывод начального массива в консоль*/
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = ++array[i];
            } else array[i] = --array[i];
            System.out.print(array[i] + " ");  /*Проверка  с выводом в консоль*/
        }
    }

    public static void doTask2() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
            System.out.print(array[i] + " "); /*Проверка  с выводом в консоль*/
        }
    }

    public static void doTask3() {
        System.out.println("1  5 3 2 11 4  5 2 4 8 9 1"); /* Вывод начального массива в консоль */
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
            System.out.print(array[i] + " "); /*Проверка  с выводом в консоль*/
        }
    }

    public static void doTask4() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {   // Можно вместо array[i] использовать array, т.к. массив квадратный
                if (i == j || i + j == (array.length) - 1) {
                    array[i][j] = 1;
                } else array[i][j] = 0 ;
                System.out.print(array[i][j] + " "); /*Проверка  с выводом в консоль*/
            }
            System.out.println(); /*Для проверки  с выводом в консоль, переход на новую строку*/
        }
    }

    public static void doTask5() {
        int[] array = {3, -1, 100, 5, 48, 0, 78, 6, -5, 0, 150};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("Min = " + min);  /*Проверка min в консоль*/
        System.out.println("Max = " + max);  /*Проверка min в консоль*/
        // Через цикл while
        int i = 0;
        while (i < array.length) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
            i = ++i;
        }
        System.out.println("Min2 = " + min);  /*Проверка min в консоль*/
        System.out.println("Max2 = " + max);  /*Проверка min в консоль*/
    }
/** 6* Написать метод, в который передается не пустой одномерный целочисленный массив,
    *метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    *Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
    *checkBalance([1, 1, 1, || 2, 1]) → true.**/

    public static void doTask6() {
        int[] array = {2, 2, 2, 1, 2, 2, 10, 1} ;
        int a = 0 ;
        for (int i = 0; i < array.length - 1; ++i){
            a = a + array[i] ;
            int b = 0 ;
            for (int j = array.length-1; j > i ; j-- ) {
                b = b + array[j] ;
            }
            System.out.println( a == b );
        }
//        System.out.println(a == b) ;

    }



 /*** 7* Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    при этом метод должен сместить все элементы массива на n позиций.
    Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
            Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    При каком n в какую сторону сдвиг можете выбирать сами.  */

}