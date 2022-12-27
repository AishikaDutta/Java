public class Wrap2
{
    public static void main(String args[])
    {
        Double P=2000.0D;
        Double R=10.0D;
        Double T=3.5D;
        Double n=3.0D;
        Double SI=0D;
        Double CI=0D;
        SI=(P*R*T)/100;
        System.out.println("Simple interest on "+P+" at the rate of "+R+"% pa for "+T+"years ="+SI);
        CI=P*Math.pow((1+(R/(100*n))),(n*T));
        System.out.println("Compound interest on "+P+" at the rate of "+R+"% pa for "+T+"years ="+CI);
    }
}
