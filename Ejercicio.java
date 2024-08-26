public class Ejercicio {
    public static void main(String[] args) {
        var frutas = "Mandarinas";
        var cantidad = 33;
        var precio = 3550;
        var precioapagarsiniva = cantidad * precio;
        System.out.println("El Total a pagar sin IVA es de :$ " + precioapagarsiniva);
        var iva = 0.19;
        System.out.println("El porcentaje del IVA de la compra es del 19%");
        var costomasiva = precioapagarsiniva * iva;
        System.out.println("El IVA de la compra es:$ " + costomasiva);
        var totalapagar = precioapagarsiniva + costomasiva;
        System.out.println("El precio a pagar de las:"+ frutas +" " + "es de: $ " + totalapagar);
    }
}
