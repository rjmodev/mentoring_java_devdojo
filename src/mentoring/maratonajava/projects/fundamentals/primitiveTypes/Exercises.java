package mentoring.maratonajava.projects.fundamentals.primitiveTypes;

/*
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, na data <data>.

 */
public class Exercises {
    public static void main(String[] args){
        String name  = "Reginaldo";
        String adress = "Manuel Caetano Rocha, 125";
        Float salary = 3568.95F;
        String dateSalary = "04/03/2025";

        System.out.printf("Eu %s, morando no endereço %s, " +
                "confirmo que recebi o salário de R$%.2f, na data %s", name, adress, salary, dateSalary);

    }
}
