public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 300;
        System.out.println("Saldo da Primeira conta: " + primeiraConta.saldo);

        Conta segundaConta = primeiraConta;
        System.out.println("Saldo da Segunda conta: " +segundaConta.saldo);

        segundaConta.saldo +=100;
        System.out.println("Saldo da Segunda conta: " +segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if(primeiraConta == segundaConta){ //Compara referência
            System.out.println("Mesma conta");
        } else{
            System.out.println("Conta diferente");
        }
    }
}
