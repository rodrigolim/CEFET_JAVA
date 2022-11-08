package cadastro;

public class Conta {
    
    private int id;
    private double saldo;
    private int numero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Conta{" + "id=" + id + ", saldo=" + saldo + ", numero=" + numero + '}';
    }     
        
}
