class Main {
  public static void main(String[] args) {
    int n1 = 0, n2= 0, n3 = 0;
    n1 = 55; //Número a ser procurado
    while (n3 <= n1)
    {
      n3 = fibo(n2);
      if (n3 == n1) {
        System.out.println("Pertence a sequência");
        return;
      }
      else if(n3 > n1)
      {
        System.out.println("Não pertence a sequência");
        return;
      }
      n2 = n2 + 1;
    }
    System.out.println("Não pertence a sequência");
    return;
  }

  public static int fibo(int n)
  {
    if (n == 1 || n == 0)
      {
        return n;
      }
    else
      {
      return fibo(n - 1) + fibo(n - 2);
      }
  }
}
