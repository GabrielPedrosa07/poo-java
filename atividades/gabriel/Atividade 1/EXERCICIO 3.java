// Exercício 3
// Nome: Gabriel Pedrosa
// Período: 3º Período

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("Saldo nao pode ser negativo");
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depositado: " + valor);
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Nao pode depositar valor negativo");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo = saldo - valor;
                System.out.println("Sacado: " + valor);
                System.out.println("Saldo atual: " + saldo);
            } else {
                System.out.println("Sem saldo suficiente");
            }
        } else {
            System.out.println("Nao pode sacar valor negativo");
        }
    }
}

class Exercicio3 {
    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria(100.0);
        System.out.println("Saldo: " + c.getSaldo());
        
        c.depositar(50.0);
        c.depositar(-10.0);
        c.sacar(20.0);
        c.sacar(500.0);
    }
}
