public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача 1");
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + "" +firstName +""+middleName + "";
        System.out.println("ФИО сотрудника - "+ fullName);

        System.out.println();
        System.out.println("Задача 2");

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);

        System.out.println();
        System.out.println("Задача 3");

        String FullName = "Иванов Семён Семёнович ";
        String FullNameCorrect = FullName.replace( "ё", "е");
        System.out.println("Данные ФИО сотрудника - "+ FullNameCorrect);



    }}

