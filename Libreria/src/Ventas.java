import java.util.ArrayList;

public class Ventas {

    private ArrayList<Publicacion> listaVendidos;

    public Ventas(){
        this.listaVendidos=new ArrayList<>();
    }

    public void agregarVenta(Publicacion publicacion){
        this.listaVendidos.add(publicacion);
    }

    public void mostraVentas(){
        for(Publicacion publicacion :this.listaVendidos )
         {
              publicacion.mostrar();
         }    
    }

    public ArrayList<Publicacion> getListaVendidos() {
        return listaVendidos;
    }

    public void setListaVendidos(ArrayList<Publicacion> listaVendidos) {
        this.listaVendidos = listaVendidos;
    }    
    
}
