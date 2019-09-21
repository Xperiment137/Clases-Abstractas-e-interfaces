
public class ABombero extends Persona {
    private int dinero;
public ABombero(int edad, String nombre, double altura, char sexo, int dinero){
    super(edad,nombre,altura,sexo);
    this.dinero=dinero;

    }
    public void Horas()
    {
        int horas = (int)(Math.random()*9);
        setDinero(horas*100);
    }

    public void setDinero(int dinero)
    {
        this.dinero=dinero;
    }
    public int getDinero()
    {
        return dinero;
    }

}

