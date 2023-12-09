public enum Cidades {

    FELIZ,
    VALE_REAL,
    S_S_DO_CAI,
    ALTO_FELIZ,
    BOM_PRINCIPIO,
    TUPANDI,
    SAO_VEDELINO;

    public static String getCidade(int num){
        if (num == 0){
            return "Feliz";
        }else if (num == 1){
            return "Vale Real";
        }
        else if (num == 2){
            return "São Sebastião do Caí";
        }else if (num == 3){
            return "Alto Feliz";
        }else if (num == 4){
            return "Bom Principio";
        }else if (num == 5){
            return "Tupandi";
        }else if (num == 6){
            return "São Vedelino";
        }
        return "";
    }

}
