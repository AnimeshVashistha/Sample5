import java.awt.image.SampleModel;

class Test
{
    static int x = 25;
    static int y;

    //static block
    static {
        System.out.println("Inside Static block");
        y=x*4;
    }

    public static void main(String[] args)
    {
        System.out.println("Value of x:" +x);
        System.out.println("Value of y:" +y);
    }
}
