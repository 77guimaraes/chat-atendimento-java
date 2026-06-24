package br.com.iran.principal;

import java.util.Scanner;

public class PrincipalChat {
    public static void main (String [] args){

        //Variáveis SERVIÇO JURÍDICO
        String menuJuridico = """
                Nosso jurídico possui uma equipe grande e pronta para lhe atender.
                Escolha uma das opções abaixo:
                
                1 - CONSULTA DE PROCESSOS
                2 - ATENDIMENTO COM ADVOGADO(A)
                3 - ENTREGA DE DOCUMENTOS
                4 - 
                """;

        String menuClube = """
                        """;

        int opcao;
        String saudacao = """
                Olá!
                @Usuario! , Seja bem Vindo(a)!\s
                
                Associação dos Militares Estaduais do Pará - AME/PARÁ!
                """;

        String menu = """
                Escolha a opção desejada:
                
                1 - SERVIÇO JURÍDICO
                2 - UTILIZAÇÃO DO CLUBE DO ICUÍ
                3 - ASSISTÊNCIA SOCIAL
                4 - HOTEL DE TRÂNSITO
                4 - CLÍNICA GERAL
                5 - NUTRICIONISTA
                6 - ODONTOLOGIA
                7 - PSICOLOGIA
                8 - SECRETARIA
                9 - FINANCEIRO
                10 - CONVÊNIOS AME/PARÁ
                11 - SEJA ASSOCIADO DA AME/PARÁ
                12 - Outros assuntos
                13 - Encerrar Atendimento!
                """;

        System.out.println(saudacao);

        Scanner leitura = new Scanner(System.in);
        System.out.println(menu);

        opcao = leitura.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Entre em contato com o numero: ...");
                break;

            case 2:
                System.out.println("Informe a data ");
        }


    }
}
