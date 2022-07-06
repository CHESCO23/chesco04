package orientacao_a_objetos_2_objeto_this.topicosAvancados.desafioTopicos;


    public class MegaSena {

        public static final int NUMERO_MAXIMO = 60;
        public static final int QUANTIDADE_NUMEROS = 6;

        private int[] numerosSorteados;

        public void sortear() {
            numerosSorteados = new int[QUANTIDADE_NUMEROS];

            for (int i = 1; i <= QUANTIDADE_NUMEROS; i++){
                //gera número aleatório, arredonda e converte para inteiro
                int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);

                //verifica se número ainda não foi sorteado e não é 0
                if (!jaFoiSorteado(numeroSorteado) && numeroSorteado != 0){
                    //adiciona o número sorteado no array de números sorteados
                    numerosSorteados[i-1] = numeroSorteado;
                } else {
                    //decrementa i para refazer o sorteio da mesma posição
                    i--;
                }
            }
        }

        private boolean jaFoiSorteado(int numero) {
            boolean resultado = false;
            for (int i = 0; i < numerosSorteados.length; i++) {
                if (numerosSorteados[i] == numero){
                    resultado = true;
                    break;
                }
            }
            return resultado;
        }

        public void exibirNumeros() {
            for (int numeroSorteado : numerosSorteados){
                System.out.println(numeroSorteado + " ");
            }
            //quebra de linha
            System.out.println();
        }
    }

