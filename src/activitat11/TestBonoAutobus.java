package activitat11;
public class TestBonoAutobus {
    public static void main(String[] args) {
        BonoAutobus bonoAutobus = new BonoAutobus();

        try{
            for (int i = 0; i <12 ; i++) {
                bonoAutobus.fichar();
            }}catch(SalgoAgotadoException ex){
            System.out.println(ex.getMessage());
        }

    }


}
