import java.util.*;


class string{
    private String ar;

    string (String ar)
    {
        this.ar=ar;
    }
    String getvalue()
    {
        return ar;
    }

}


public class Ass4 {
    public static void main(String[] args) {
        String s1="abcd";
        string s2=new string(s1);
        System.out.println(s2.getvalue());

        Integer i=25;
        int i2=i;
        System.out.println(i);

    }
}
