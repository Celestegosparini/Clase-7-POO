package ClienteBanco;

public class CuentaAhorro extends CuentaCorriente {

    private double interes = 2.5;

    public CuentaAhorro(Cliente titular, int nroCuenta, double saldo, double interes) {
        super(titular, nroCuenta, saldo);
        this.interes = interes;
    }

    public CuentaAhorro(Cliente cuenta, int nroCuenta, double interes) {
        super(cuenta, nroCuenta);
        this.interes = interes;
    }

    public CuentaAhorro(Cliente cuenta, int nroCuenta) {
        super(cuenta, nroCuenta);
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getInteres() {
        return this.interes;
    }

    public double calcularIntereses() {
        return super.getSaldo() * (1 + this.interes / 100);
    }

    public double calcularIntereses(double interes) {
        return super.getSaldo() * (1 + interes / 100);
    }

}
