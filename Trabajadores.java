public class Trabajadores 
{
    private int patata;

    public Trabajadores(int patata)
    {
        this.patata=patata;
    }

    public void precioPatata(){
         patata=patata*2;
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "patata=" + patata +
                '}';
    }
}
