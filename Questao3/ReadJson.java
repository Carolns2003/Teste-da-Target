import java.io.BufferedReader;

import org.json.JSONArray;
import org.json.JSONObject;
 
public class ReadJson {
    
    JSONObject js = null;
    JSONArray ja = null;
    
    public ReadJson(Dados dados[]) {
        try {         
                java.io.FileReader fr = new java.io.FileReader("./dados.json");
                java.io.BufferedReader br = new BufferedReader(fr);
                StringBuilder sb = new StringBuilder(); 
                String line;
                while((line = br.readLine()) != null){
                    sb = sb.append(line);
                }
           
              br.close();
              fr.close();
            
            ja = new JSONArray(sb.toString());
            
            for( int x=0; x < ja.length(); x++)  {
               JSONObject ob = ja.getJSONObject(x);
               long dia = ob.getLong("dia");
               double valor = ob.getDouble("valor");          
               
               dados[x] = new Dados();
               dados[x].dia = dia;
               dados[x].valor = valor;
               System.out.println(
                   "Dia = " + dados[x].getDia() + "\n" +
                   "Valor = " +  dados[x].getValor()
               );
               System.out.println("*****************************************************");          
            }
        }catch(Exception e) {
            e.printStackTrace();
        }    
    }
}
