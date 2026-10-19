public class MembresiaGym {
    private String dniSocio;
    private String nombreCompleto;
    private boolean cuotaAlDia;
    public MembresiaGym(String dniSocio, String nombreCompleto, boolean cuotaAlDia) {
        this.dniSocio = dniSocio;
        this.nombreCompleto = nombreCompleto;
        this.cuotaAlDia = false;
    }
    public void pagarCuota() {
        this.cuotaAlDia = true;
    }
    public void registrarVencimiento() {
        this.cuotaAlDia = false;
    }
    public void mostrarInformacion() {
        System.out.println("DNI del socio: " + dniSocio);
        System.out.println("nombre completo: " + nombreCompleto);
        System.out.println("cuota al día: " + (cuotaAlDia ? "Sí" : "No"));
    }
}
