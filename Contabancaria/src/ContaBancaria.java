
public class ContaBancaria {
    
    private String nomeCliente;
    private int numeroConta;
    private char tipoConta; 
    private double saldo;


    public ContaBancaria() {
        this.nomeCliente = "";
        this.numeroConta = 0;
        this.tipoConta = 'C'; 
        this.saldo = 0.0;
    }


    public ContaBancaria(String nomeCliente, int numeroConta, char tipoConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;

        if (tipoConta == 'P' || tipoConta == 'C') {
            this.tipoConta = tipoConta;
        } else {
            this.tipoConta = 'C'; 
        }

        this.saldo = saldo;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public char getTipoConta() {
        return tipoConta;
    }


    public void setTipoConta(char tipoConta) {
        if (tipoConta == 'P' || tipoConta == 'C') {
            this.tipoConta = tipoConta;
        }
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString() {
        String tipoConta = (this.tipoConta == 'P') ? "Poupança" : "Corrente";

        return "Conta Bancária:" +
                "\nNome do Cliente: " + nomeCliente +
                "\nNúmero da Conta: " + numeroConta +
                "\nTipo da Conta: " + tipoConta +
                "\nSaldo: R$ " + String.format("%.2f", saldo);
    }
}
