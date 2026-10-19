public class Main {

    public static void main(String[] args) {

        // Crear tres objetos
        Cupon cupon1 = new Cupon();
        Cupon cupon2 = new Cupon();
        Cupon cupon3 = new Cupon();

        // Cupon 1
        cupon1.codigo = "VERANO20";
        cupon1.porcentajeDescuento = 20;
        cupon1.descripcion = "Descuento de verano";
        cupon1.activo = true;

        // Cupon 2
        cupon2.codigo = "TECNO10";
        cupon2.porcentajeDescuento = 10;
        cupon2.descripcion = "Descuento en tecnologia";
        cupon2.activo = false;

        // Cupon 3
        cupon3.codigo = "BLACK30";
        cupon3.porcentajeDescuento = 30;
        cupon3.descripcion = "Descuento Black Friday";
        cupon3.activo = true;

        // Mostrar informacion
        cupon1.mostrarInformacion();
        cupon1.mostrarDescuento();
        cupon1.mostrarResumen();

        System.out.println();

        cupon2.mostrarInformacion();
        cupon2.mostrarDescuento();
        cupon2.mostrarResumen();

        System.out.println();

        cupon3.mostrarInformacion();
        cupon3.mostrarDescuento();
        cupon3.mostrarResumen();

        // Activar solamente el cupon 2
        cupon2.activar();

        System.out.println("\nDespues de activar el cupon 2:");
        cupon2.mostrarInformacion();

        // Desactivar solamente el cupon 1
        cupon1.desactivar();

        System.out.println("\nDespues de desactivar el cupon 1:");
        cupon1.mostrarInformacion();
    }
}