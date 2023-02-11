public class MarcaPagina {
    int numPagina;
    String infoUltPagina;

    public MarcaPagina (){
        this.numPagina = 0;
        this.infoUltPagina = "";
    }

    public void incrementarNumPagina (){
        numPagina++;
    }

    public String obtenerInfoUltPagina(){
        return infoUltPagina;
    }

    public void comenzarInicio(){
        numPagina = 0;
    }

}
