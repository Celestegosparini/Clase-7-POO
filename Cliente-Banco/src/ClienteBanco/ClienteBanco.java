package ClienteBanco;

public class ClienteBanco {

    public static void main(String[] args) {
        Cliente aliem = new Cliente();
        aliem.setApellido("ET Casa");
        aliem.setNombre("ET");
        aliem.setEdad(200);
        Cliente c1 = new Cliente();
        c1.setApellido("Yakimiuk");
        c1.setNombre("Flavia");
        c1.setEdad(34);
        Cliente c2 = new Cliente();
        c2.setApellido("Gosparini");
        c2.setNombre("Celeste");
        c2.setEdad(26);

        //Crear Cuentas Corrientes
        CuentaCorriente cc1 = new CuentaCorriente(c1, 6000);
        CuentaCorriente cc2 = new CuentaCorriente(c2, 6003, 5637.96);
        CuentaCorriente cc3 = new CuentaCorriente(aliem, 6004, 537.96);
        //Crear Cajas de Ahorro
        CuentaAhorro ca1 = new CuentaAhorro(c1, 6000);
        CuentaAhorro ca2 = new CuentaAhorro(c2, 6003, 0.7);
        CuentaAhorro ca3 = new CuentaAhorro(c1, 6011, 345.24, 1.2);
        CuentaAhorro ca4 = new CuentaAhorro(aliem, 601, 45.24, 1.2);
        //Imprimir datos
        System.out.println("DATOS CUENTAS CORRIENTES");
        System.out.println(cc1.toString());
        System.out.println(cc2.toString());
        System.out.println(cc3.toString());
        System.out.println("DATOS CAJAS DE AHORRO");
        System.out.println(ca1.toString());
        System.out.println(ca2.toString());
        System.out.println(ca3.toString());
        System.out.println(ca4.toString());
CuentaAhorro ca5 = new CuentaAhorro(aliem, 601, 45.24, 1.2);
        if (ca4.equals(ca5)) {
            System.out.println("Son iguales ");
        } else {
            System.out.println("Son distintas ");
        }
    }
}
