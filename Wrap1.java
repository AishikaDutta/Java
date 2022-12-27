class Wrap1
{
    public static void main(String args[])
    {
        Integer array[]=new Integer[] {12,23,34,45,56};
        Double add=0D;
        for(int n:array)
        {
            add=add+n;
        }
        Double avg=add/array.length;
        System.out.println("\nAverage is:\n");
        System.out.println(avg);
    }
}
