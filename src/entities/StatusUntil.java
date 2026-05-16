package entities;

public class StatusUntil {

    // Método para status gerais (Professor, Responsável, Matrícula, AulaPlanejamento)
    public static String getDescricaoGeral(Integer status) {
        if (status == null) return "Desconhecido";

        return switch (status) {
            case 0 -> "Ativo";
            case 1 -> "Inativo";
            case 2 -> "Pendente";
            case 3 -> "Cancelado";
            default -> "Desconhecido";
        };
    }

    // Método específico para a presença de aulas
    public static String getDescricaoPresenca(Integer status) {
        if (status == null) return "Sem Registro";

        return switch (status) {
            case 0 -> "Presente";
            case 1 -> "Falta";
            case 2 -> "Justificado";
            default -> "Sem Registro";
        };
    }

}
