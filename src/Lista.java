public class Lista {
  NoLista inicio;


  public Lista(String lista) {
    Construir(lista);
  }

  private void Construir(String lista) {
    lista = lista.trim();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < lista.length(); i++) {


      if(lista.charAt(i) == '[')
      {
        System.out.println("é [");
        continue;
      }

      if(lista.charAt(i) == ']')
      {
        System.out.println("é ]");
        continue;
      }

      if(lista.charAt(i) == ',')
      {
        System.out.println("é ,");
        continue;
      }

      sb.append(lista.charAt(i));
    }
    System.out.println();
  }
}
