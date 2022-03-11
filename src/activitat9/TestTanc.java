package activitat9;

public class TestTanc
{
    public static void main(String[] args) {
        Tanque tanque= new Tanque(1000);
        try {
            tanque.agregarCarga(10);
        } catch (TancPleException e) {
            System.out.println(e.getMessage());
        }
        try {
            tanque.retirarCarga(0);
        }catch (TancBuitException e){
            System.out.println(e.getMessage());
        }
    }
}