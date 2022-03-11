package activitat12;

public class MaximoIntentosAlcanzadosExcepcion extends Exception{
    public MaximoIntentosAlcanzadosExcepcion(){
        super("Se ha alcanzado el número máximo de intentos");
    }
}
