package comunicacion;

public class Alfabeto extends Pictograma {
    private String[] letras;
    private String interpretacion;

    public String[] getLetras() {
        return letras;
    }

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras() {
        return letras.length;
    }

    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        String cadena = this.getOrigen() + "\n";
        for (int i = 0; i < letras.length; i++) {
            cadena += letras[i];
            if(i != letras.length - 1)
                cadena += ", ";
        }
        return  cadena;
    }
}
