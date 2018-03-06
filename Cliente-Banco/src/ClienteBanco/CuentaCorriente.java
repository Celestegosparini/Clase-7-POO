package ClienteBanco;

public class CuentaCorriente {

    private Cliente titular;
    private int nroCuenta;
    private double saldo;

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente tutilar) {
        this.titular = tutilar;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCenta) {
        this.nroCuenta = nroCenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void Cuntacoriente(Cliente titular, int nroCuenta) {

    }

    public void Cuntacoriente(Cliente titular, int nroCuenta, double saldo) {

    }

    public double depositar(double monto) {
        saldo = saldo + monto;
        return saldo;
    }

    public double extraer(double monto) {
        saldo = saldo - monto;
        return saldo;
    }

    @Override
    public String toString() {
        return this.titular.toString() + " numero de cuenta : " + this.nroCuenta + " Saldo : " + this.saldo;
    }

    @Override
    public boolean equals(Object cuenta) {
        if (cuenta == null || (cuenta instanceof CuentaCorriente)) {
            return false;
        }

        CuentaCorriente otraCuenta = (CuentaCorriente)cuenta;
        if (otraCuenta.getNroCuenta() == this.nroCuenta) {
            return true;

        }
        else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.nroCuenta;
        return hash;
    }
}
