public class Cuenta {
    double saldo;
    public void depositar(double cantidad){
        this.saldo = saldo+cantidad;
    }
    public boolean retirar(double cantidad){
        if (saldo >= cantidad){
            this.saldo = this.saldo-cantidad;
        }
        return false;
    }
}
class cuentaCredito extends Cuenta{
    double montoCredito;
    double tasaIntereses;
    double aPagar;
    public cuentaCredito(double credito, double interes){
        this.montoCredito = interes;
        this.saldo=credito;
    }
    public void corte(){
        double deuda = montoCredito - this.saldo+aPagar;
        double intereses = deuda*tasaIntereses/12*deuda;
        aPagar = deuda + intereses;
    }
    public void pagarDeuda(double cantidad){
        depositar(cantidad);
        if(saldo>montoCredito){
            saldo = montoCredito;
            aPagar = aPagar-cantidad;
        }
    }
    public void usarCredito(double cantidad){
        retirar(cantidad);
    }
}
