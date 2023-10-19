public class CriaConta {

    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        segundaConta.agencia=146;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);
        System.out.println(primeiraConta);

        if(primeiraConta == segundaConta){ //Compara referência
            System.out.println("Mesma conta");
        } else{
            System.out.println("Conta diferente");
        }
    }
}
