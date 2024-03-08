public class Libro extends Publicacion {

    private int numeroPaginas;
    private int anoPublicacion;

    public Libro(String titulo, float precio, int numeroPaginas, int anoPublicacion) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anoPublicacion = anoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    @Override
    public String toString(){
        return "Año de publicación:"+this.anoPublicacion+" "+"Paginas:"+this.numeroPaginas;
    }


    @Override
    public void mostrar(){
         System.out.println("Datos del Libros");
         System.out.println(super.toString());
         System.out.println(this.toString());

    }

    

    


    
}
