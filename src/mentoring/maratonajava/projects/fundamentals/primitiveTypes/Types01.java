package mentoring.maratonajava.projects.fundamentals.primitiveTypes;

public class Types01 {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, boolean
        int age = 25;
        double salary = 1525.63;
        float weather = 15.6F;
        char sex = 'M';
        char caractere = '\u0059';//ASCII ou Unicode
        byte shoppingRoom = 127;
        short colaboratorId = 32767;
        boolean isOn = false;

        System.out.printf("\nTenho mais de %d anos e ganho na media de %4.2f e trabalho no shopping na sala %d\n\n", age, salary, shoppingRoom);

        //----------------------------------------------------------------------//
        //Casting
        int ageSpace = (int) 10000000000L;
        long monthSalary = (long)25365.58;

        System.out.println(ageSpace);
        System.out.println(monthSalary);
    }
}