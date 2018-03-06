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

    public void Cuentatacoriente(Cliente titular, int nroCuenta) {
        this.titular = titular;
        this.nroCuenta= nroCuenta;

    }

    public void Cuentacoriente(Cliente titular, int nroCuenta, double saldo) {
        this.titular = titular;
        this.nroCuenta= nroCuenta;
        this.saldo =saldo;
    }

    public double depositar(double monto){
        saldo = saldo + monto;
        return saldo;
    }

    public double extraer(double monto) {
        if (saldo < monto){
            saldo=0;
            System.out.println ("Saldo insuficiente");
              return this.saldo;
        }   else {
            System.out.println ("Saldo insuficiente");
            return this.saldo - monto;
        }   
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

   
}
