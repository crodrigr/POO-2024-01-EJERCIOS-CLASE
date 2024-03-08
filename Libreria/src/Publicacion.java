public class Publicacion {

    private String titulo;
    private float  precio;

    public Publicacion(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Titulo:"+this.titulo+" "+"Precio:"+this.precio;
    }

    public void mostrar(){
        System.out.println("Datos de la publicación");
        System.out.println(this.toString());
    }

    

    
    
}
