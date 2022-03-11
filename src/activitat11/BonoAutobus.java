package activitat11;

public class BonoAutobus {

    private int saldo;

    public BonoAutobus() {
        this.saldo = 10;
    }
    public void fichar() throws SalgoAgotadoException {
 if (saldo > 0) {
     saldo = saldo -1;
     System.out.println("Saldo usado");
 } else {
     throw new SalgoAgotadoException();
 }
    }
}
