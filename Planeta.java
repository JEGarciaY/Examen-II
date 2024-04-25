public class Planeta {

    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private double diametro;
    private double distanciaAlSol;
    private boolean observable;


    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaAlSol, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaAlSol = distanciaAlSol;
        this.observable = observable;
    }

    
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa: " + masa + " kg");
        System.out.println("Volumen: " + volumen + " m^3");
        System.out.println("Diámetro: " + diametro + " km");
        System.out.println("Distancia al sol: " + distanciaAlSol + " UA");
        System.out.println("Es observable: " + (observable ? "Sí" : "No"));
    }

    
    public double calcularDensidad() {
        return masa / volumen;
    }

    

    public static void main(String[] args) {
        
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150000000, true);
        Planeta jupiter = new Planeta("Jupiter", 1, 1.899e27, 1.4313e15, 139820, 750000000, true);
        
        System.out.println("Planeta 1");
        tierra.imprimirInformacion();
        System.out.println("La Densidad de la Tierra es: "+ tierra.calcularDensidad() + " kg/m^3");
        System.out.println("");
        System.out.println("Planeta 2");
        jupiter.imprimirInformacion();
        System.out.println("La Densidad de Jupiter es: " + jupiter.calcularDensidad() + " kg/m^3");
    }
}
