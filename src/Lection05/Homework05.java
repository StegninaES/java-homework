package Lection05;

public class Homework05 {


    public static void main(String[] args) {
        printCollegue();
        Colleague[] c = createCollegesArray();
        filterColleges(c);
    }

    private static Colleague[] createCollegesArray() {
        Colleague[] colleagues = new Colleague[5];
        Colleague colleague1 = new Colleague("DSA", "engineer", "a@a.ru", "+79344545377",
                100000, 41);
        Colleague colleague2 = new Colleague("BMB", "engineer", "a@a.ru", "+79344545377",
                100000, 35);
        Colleague colleague3 = new Colleague("Ivanon Ivan Ivanovich", "engineer", "a@a.ru", "+79344545377",
                100000, 41);
        Colleague colleague4 = new Colleague("Ivanon Ivan Ivanovich", "engineer", "a@a.ru", "+79344545377",
                100000, 35);
        Colleague colleague5 = new Colleague("Ivanon Ivan Ivanovich", "engineer", "a@a.ru", "+79344545377",
                100000, 35);

        colleagues[0] = colleague1;
        colleagues[1] = colleague2;
        colleagues[2] = colleague3;
        colleagues[3] = colleague4;
        colleagues[4] = colleague5;

        return colleagues;
    }


    private static void printCollegue() {
        Colleague colleague = new Colleague("Ivanon Ivan Ivanovich", "engineer", "a@a.ru", "+79344545377",
                100000, 35);
        colleague.print();
    }

    private static void filterColleges(Colleague[] colleagues) {
        for (int i = 0; i < colleagues.length; i++) {
            Colleague colleague = colleagues[i];
            if (colleague.getAge() > 40) {
                System.out.println(colleague);
            }
        }
    }
}