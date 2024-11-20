package tema4;

public class principalCuenta {
    public static void main(String[] args){
        try {
            Cuenta c1 = new Cuenta("1234", "Emilio",10);
        } catch (CuentaException e) {
            System.out.println(e.getMessage());
        }
    }
}
