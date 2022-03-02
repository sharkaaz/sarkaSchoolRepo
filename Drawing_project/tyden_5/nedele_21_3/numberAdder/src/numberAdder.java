

public class numberAdder {

  public static void main (String[] args) {


      System.out.println(gimmesum(5));
  }
public static int gimmesum (int n){
 System.out.println(n);
      if (n==1)
    { return 1;
    }else{

        return n + gimmesum(n - 1);

    }
    }
}


