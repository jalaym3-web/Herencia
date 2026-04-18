package ejercicios;

public class Cuenta {
	 private String titular;
	    private double saldo;

	    public Cuenta(String titular, double saldoInicial) {
	        setTitular(titular);
	        setSaldo(saldoInicial);
	    }

	    public void setTitular(String titular) {
	        this.titular = (titular != null && !titular.isBlank()) ? titular : "Sin titular";
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = (saldo >= 0) ? saldo : 0;
	    }

	    public String getTitular() { return titular; }
	    public double getSaldo()   { return saldo; }

	    public void depositar(double monto) {
	        if (monto <= 0) {
	            System.out.println("El monto a depositar debe ser mayor a 0.");
	            return;
	        }
	        saldo += monto;
	        System.out.println("Depósito de Q" + monto + " exitoso. Saldo: Q" + saldo);
	    }

	    public void retirar(double monto) {
	        if (monto <= 0) {
	            System.out.println("El monto a retirar debe ser mayor a 0.");
	            return;
	        }
	        if (monto > saldo) {
	            System.out.println("Fondos insuficientes. Saldo disponible: Q" + saldo);
	            return;
	        }
	        saldo -= monto;
	        System.out.println("Retiro de Q" + monto + " exitoso. Saldo: Q" + saldo);
	    }

	    public void mostrar() { //Metodo a sobreescribir
	        System.out.println("Titular: " + titular);
	        System.out.println("Saldo:   Q" + saldo);
	    }
}
