class Main {
    public static void main(String[] args) { 
        double n1 = 0, n2 = 0, media = 0;
        long d1 = 0, d2 = 0, d3 = 0, d4 = 0;
        Dados dados[];
        dados = new Dados[30];
        ReadJson rj = new ReadJson(dados);

        for (int x=0; x < dados.length; x++) {
            if(n1 == 0){
                n1 = dados[x].valor;
                d1 = dados[x].dia;
                n2 = dados[x].valor;
                d2 = dados[x].dia;
            }

            if(dados[x].valor < n1 && dados[x].valor != 0){
                n1 = dados[x].valor;
                d1 = dados[x].dia;
            }

            if(dados[x].valor > n2){
                n2 = dados[x].valor;
                d2 = dados[x].dia;
            }
            
            if(dados[x].valor != 0){
                media = media + dados[x].valor;
                d3 = d3 + 1;
            }
            
        }

        media = media / d3;

        for (int x=0; x < dados.length; x++) {
                    
            if(dados[x].valor < media){
                d4 = d4 + 1;
            }
