public class SistemaIbge {
    public static void main(String[] args) {

        //CASE 1
        // for(EstadoBrasileiro estado: EstadoBrasileiro.values()){
        //     System.out.println(estado.getSigla() + " - " + estado.getNome());
        // }


        //CASE: 2
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        System.out.println(eb.getNome());
        System.out.println(eb.getIbge());
    }
}
