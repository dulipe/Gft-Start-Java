public class main {
    public static void main(String[] args){
        Filme filme1 = new Filme("Harry Poter", 120, "12:30");
        Filme filme2 = new Filme("Animais fantasticos", 130, "14:30");
        Cinema cinema = new Cinema("CinePoter", "Rua da Grifinoria");

        //adicionando filmes
        cinema.adicionarFilme(filme1);
        cinema.adicionarFilme(filme2);

        //removendo filme
        cinema.removerFilme(filme1);

        //
        filme1.calcularDuracaoEmHoras();
        filme1.retornarHoraQueAcaba();

    }
}