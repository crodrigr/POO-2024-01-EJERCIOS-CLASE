public class Disco extends Publicacion {

    private float duracionMinutos;

    public Disco(String titulo, float precio, float duracionMinutos) {
        super(titulo, precio);
        this.duracionMinutos = duracionMinutos;
    }

    public float getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(float duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString(){
        return "Duración en mintuos del disco:"+this.duracionMinutos;
    }


    @Override
    public void mostrar(){
         System.out.println("Datos del Disco");
         System.out.println(super.toString());
         System.out.println(this.toString());

    }


    
    
}
