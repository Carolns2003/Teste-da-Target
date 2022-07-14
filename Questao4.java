class Main {
  public static void main(String[] args) {
    double sp = 67836.43, rj= 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53, total;
    
  total = sp + rj + mg + es + outros;

  System.out.printf("Porcertagem SP: %s %%", (sp/total)*100);
  System.out.printf("\nPorcertagem RJ: %s %%", (rj/total)*100);
  System.out.printf("\nPorcertagem MG: %s %%", (mg/total)*100);
  System.out.printf("\nPorcertagem ES: %s %%", (es/total)*100);
  System.out.printf("\nPorcertagem outros: %s %%", (outros/total)*100);
  }
}
