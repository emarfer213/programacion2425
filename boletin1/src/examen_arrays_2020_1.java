public class examen_arrays_2020_1 {
    public static void main(String[] args) {
        String[] estados = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Carolina del Norte", "Carolina del Sur", "Colorado", "Connecticut", "Dakota del Norte", "Dakota del Sur", "Delaware", "Distrito de Columbia", "Florida", "Georgia", "Hawái", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Luisiana", "Maine", "Maryland", "Massachusetts", "Míchigan", "Minnesota", "Mississippi", "Misuri", "Montana", "Nebraska", "Nevada", "Nueva Jersey", "Nueva York", "Nuevo Hampshire", "Nuevo México", "Ohio", "Oklahoma", "Oregón", "Pensilvania", "Rhode Island", "Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Virginia Occidental", "Washington", "Wisconsin", "Wyoming"};
        int[] electores = {9, 3, 11, 6, 55, 15, 9, 9, 7, 3, 3, 3, 3, 29, 16, 4, 4, 20, 11, 6, 6, 8, 8, 4, 10, 11, 16, 10, 6, 10, 3, 5, 6, 14, 29, 4, 5, 18, 7, 7, 20, 4, 11, 38, 6, 3, 13, 5, 12, 10, 3};
        int[] votosDemocratas = {729547, 116454, 1161167, 380494, 8753788, 1338870, 897572, 235603, 282830, 4504975, 1877963, 266891, 189765, 3090729, 1033126, 653669, 427005, 628854, 780154, 715326, 1677928, 1995196, 2268839, 1367716, 485131, 1071068, 177709, 568988, 539260, 348526, 2148278, 385234, 4556124, 2189316, 93758, 2394164, 420375, 1002106, 2926441, 252525, 855373, 117458, 870695, 3877868, 310676, 178573, 1981473, 1742718, 188794, 1382536, 55973};
        int[] votosRepublicanos = {1318255, 163387, 1252401, 684872, 4483810, 1202484, 673215, 185127, 12723, 4617886, 2089104, 128847, 409055, 2146015, 1557286, 800983, 671018, 1202971, 1178638, 671154, 943169, 1090893, 2279543, 1322951, 700714, 1594511, 279240, 991922, 512058, 345790, 1601933, 319667, 2819534, 2362631, 216794, 2841005, 949136, 782403, 2970733, 180543, 1155389, 227721, 1522925, 4685047, 515231, 95369, 1769443, 1221747, 489371, 1405284, 174419};

        quienGana(estados, electores, votosDemocratas, votosRepublicanos);
    }

    public static void quienGana(String[] estados, int[] electores, int[] votosDemocratas, int[] votosRepublicanos){

        int recuentoDemocrata=0;
        int recuentoRepublicanos=0;
        int sumaVotosDemocratas=0;
        int sumaVotosRepublicanos=0;
        int estadosDemocratas=0;
        int estadosRepublicanos=0;
        int aportaDemocratas=0;
        int aportaRepublicanos=0;
        int indiceApotaDemocratas=0;
        int indiceAportaRepublicano=0;


        for (int i = 0; i < estados.length; i++) {
            sumaVotosDemocratas += votosDemocratas[i];
            sumaVotosRepublicanos += votosRepublicanos[i];

            if (votosDemocratas[i] < votosRepublicanos[i]){
                recuentoRepublicanos += electores[i];
                estadosRepublicanos ++;
                if (aportaRepublicanos < electores[i]){
                    aportaRepublicanos=electores[i];
                    indiceAportaRepublicano=i;
                }
            } else {
                recuentoDemocrata += electores[i];
                estadosDemocratas ++;
                if (aportaDemocratas < electores[i]){
                    aportaDemocratas=electores[i];
                    indiceApotaDemocratas=i;
                }
            }
        }

        System.out.printf("los republicanos suman %d electores y los democratas suman %d electores \n", recuentoRepublicanos, recuentoDemocrata);
        System.out.printf("los estados republicanos son %d y los estados democratas son %d \n", estadosRepublicanos, estadosDemocratas);

        if (sumaVotosDemocratas > sumaVotosRepublicanos){
            System.out.printf("el partido mas votado por el numero de votos es el democrata con %d votos \n", sumaVotosDemocratas);
        } else {
            System.out.printf("el partido mas votado por el numero de votos es el republicanos con %d votos \n", sumaVotosRepublicanos);
        }

        if (recuentoDemocrata < recuentoRepublicanos){
            System.out.println("el presidente ganador es del partido republicano");
        } else {
            System.out.println("el presidenete ganador es del partido democrata");
        }
        System.out.printf("el estado republicano que mas aportan es %s con %d electores y el estado democrata que mas aportan es %s con %d electores \n",estados[indiceAportaRepublicano],aportaRepublicanos, estados[indiceApotaDemocratas], aportaDemocratas);
    }
}
