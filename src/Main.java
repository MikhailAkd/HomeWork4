public class Main {
    public static void main(String[] args) {

        //Задача 1

        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (a = 10 ; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println();

        //Задача 2

        int firstFriday = 5;
        for ( ; firstFriday < 31 ; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        //Задача 3

        int startRange = 1822;
        int endRange = 2122;
        for (int year3 = 0; year3 <= endRange; year3 = year3 + 79) {
            if (year3 >= startRange) {
                System.out.println(year3);
            }
        }
    }
}