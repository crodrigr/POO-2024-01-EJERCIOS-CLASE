import java.util.ArrayList;
import java.util.Scanner;

public class App {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();
    static Ventas ventas=new Ventas();

    public static void main(String[] args) throws Exception {


        int opcion = 0;

        Disco disco=new Disco("Mujer",23000,120);
        Libro libro=new Libro("Cocina",43000,300,2024);
        listaPublicaciones.add(libro);
        listaPublicaciones.add(disco);

        do {
            opcion = menu();
            switch (opcion) {
                case 1:
                    crearPublicacion();
                    break;
                case 2:
                    listarPublicaciones();
                    break;
                case 3:
                    venderPublicacion();
                    break;
                case 4:
                    System.out.println("Listado publicaciones vendidas");
                    ventas.mostraVentas();
                    break;
            }

        } while (opcion >= 1 && opcion < 5);

    }

    private static int menu() {
        int op = 0;
        System.out.println("____MENU_____");
        System.out.println("1. Crear publicación");
        System.out.println("2. Mostrar publicaciones");
        System.out.println("3. Vender publicación");
        System.out.println("4. Mostrar publicaciones vendidas");
        System.out.println("5. Salir");
        return leer.nextInt();
    }

    private static void crearPublicacion() {
        int op = 0;
        Publicacion publicacion = null;
        System.out.println("Ingrese el titulo:");
        String titulo = leer.next();
        leer.nextLine();
        System.out.println("Ingrese el precio:");
        float precio = leer.nextFloat();
        leer.nextLine();

        do {
            System.out.println("Ingrese la opción de tipo publicación (1. Disco o 2. Libro)");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingrese duración del disco:");
                    float duracion = leer.nextFloat();
                    publicacion = new Disco(titulo, precio, duracion);
                    break;
                case 2:
                    System.out.println("Ingrese año de publicación del libro:");
                    int anoPublicacion = leer.nextInt();
                    System.out.println("Ingrese el número de paginas:");
                    int numeroPaginas = leer.nextInt();
                    publicacion = new Libro(titulo, precio, numeroPaginas, anoPublicacion);
                    break;
            }

        } while (op <= 0 || op >= 3);

        listaPublicaciones.add(publicacion);

    }

    private static void listarPublicaciones() {
        System.out.println("Lista de publicaciones");
        for (Publicacion publicacion : listaPublicaciones) {
            publicacion.mostrar();
        }
    }

    public static void venderPublicacion(){
          leer.nextLine();
          System.out.println("Ingrese el nombre de la publicacion (libro o disco):");
          String nombrePublicacion=leer.nextLine();
          boolean seHizoVenta=false;

          for(Publicacion publicacion   : listaPublicaciones   ){
                if(publicacion.getTitulo().equalsIgnoreCase(nombrePublicacion)){
                     ventas.agregarVenta(publicacion);
                     seHizoVenta=true;
                     break;
                }
          }
          if(seHizoVenta){
            System.out.println("Se hizo la venta con exito!");
          }else{
            System.out.println("No está esa publicación disponible");
          }

         
    }





}
