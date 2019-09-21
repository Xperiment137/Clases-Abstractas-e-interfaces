public class ArranqueInterfaz {
    public static void main(String[] args) {
        ABombero Mercedes = new ABombero(56, "Mercedes", 1.60, 'M',10);
        ABombero Paca = new ABombero(34, "Mercedes", 1.60, 'M',10);
Paca.Mostrar();
Mercedes.Horas();
System.out.println(Paca.ToString());
System.out.println(Mercedes.equals(Paca));
System.out.println(Mercedes.getDinero());
    }
}
