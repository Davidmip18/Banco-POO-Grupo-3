public class Cuenta implements Interfaz()
{
    private String id;
    private double saldo;
    private Cliente propietario;

    public Cuenta(String id, double saldo, Cliente propietario) {
        this id = id;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getdueño() {
        return propietario;
    }

    public void setdueño(Cliente propietario) {
        this.propietario = propietario;
    }
}