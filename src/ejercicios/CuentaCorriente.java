package ejercicios;

public class CuentaCorriente extends Cuenta {
    private double limiteSobregiro;

    public CuentaCorriente(String titular, double saldoInicial, double limiteSobregiro) {
        super(titular, saldoInicial);  // atributos heredados
        setLimiteSobregiro(limiteSobregiro);
    }

    public void setLimiteSobregiro(double limite) {
        this.limiteSobregiro = (limite >= 0) ? limite : 0;
    }

    public double getLimiteSobregiro() { return limiteSobregiro; }

    @Override
    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a retirar debe ser mayor a 0.");
            return;
        }
        if (monto > getSaldo() + limiteSobregiro) {
            System.out.println("Retiro denegado. Límite disponible: Q" + (getSaldo() + limiteSobregiro));
            return;
        }
        setSaldo(getSaldo() - monto);  // puede quedar negativo dentro del límite
        System.out.println("Retiro de Q" + monto + " exitoso. Saldo: Q" + getSaldo());
    }

    @Override
    public void mostrar() { // se sobreescribe
        super.mostrar();
        System.out.println("Límite de sobregiro: Q" + limiteSobregiro);
    }
}