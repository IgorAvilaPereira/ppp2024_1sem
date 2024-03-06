package apresentacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import negocio.PaginaEgressos;
import negocio.PaginaHome;
import negocio.PaginaProfessores;

public class Main {
    public static void main(String[] args) throws IOException {
        PaginaHome paginaHome = new PaginaHome("Home");
        paginaHome.gerarPagina();
        PaginaProfessores paginaProfessores = new PaginaProfessores("Professores");
        paginaProfessores.gerarPagina();
        PaginaEgressos paginaEgressos = new PaginaEgressos("Egressos");
        paginaEgressos.gerarPagina();
    }
}