import java.util.Scanner;

class Automovel {
    String marca, modelo, cor, matricula;
    int cilindrada, ano;
    double valorDia;
}

class Cliente {
    String nome, morada, cc, carta;
}

public class RentCar {

    static Scanner sc = new Scanner(System.in);

    static Automovel[] automoveis = new Automovel[100];
    static Cliente[] clientes = new Cliente[100];

    static int totalAutomoveis = 0;
    static int totalClientes = 0;

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1 - Gerir Automóveis");
            System.out.println("2 - Gerir Clientes");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    menuAutomoveis();
                    break;
                case 2:
                    menuClientes();
                    break;
            }

        } while (opcao != 0);
    }

    // ================= AUTOMÓVEIS =================

    static void menuAutomoveis() {
        int op;
        do {
            System.out.println("\n--- AUTOMÓVEIS ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Eliminar");
            System.out.println("0 - Voltar");
            op = sc.nextInt();

            switch (op) {
                case 1: inserirAutomovel(); break;
                case 2: listarAutomoveis(); break;
                case 3: pesquisarAutomovel(); break;
                case 4: eliminarAutomovel(); break;
            }

        } while (op != 0);
    }

    static void inserirAutomovel() {
        sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();

        if (existeMatricula(matricula)) {
            System.out.println("ERRO: Matrícula já existe!");
            return;
        }

        Automovel a = new Automovel();
        a.matricula = matricula;

        System.out.print("Marca: ");
        a.marca = sc.nextLine();

        System.out.print("Modelo: ");
        a.modelo = sc.nextLine();

        System.out.print("Cor: ");
        a.cor = sc.nextLine();

        System.out.print("Cilindrada: ");
        a.cilindrada = sc.nextInt();

        System.out.print("Ano: ");
        a.ano = sc.nextInt();

        System.out.print("Valor por dia: ");
        a.valorDia = sc.nextDouble();

        automoveis[totalAutomoveis++] = a;

        System.out.println("Automóvel inserido com sucesso!");
    }

    static boolean existeMatricula(String matricula) {
        for (int i = 0; i < totalAutomoveis; i++) {
            if (automoveis[i].matricula.equalsIgnoreCase(matricula)) {
                return true;
            }
        }
        return false;
    }

    static void listarAutomoveis() {
        for (int i = 0; i < totalAutomoveis; i++) {
            Automovel a = automoveis[i];
            System.out.println(a.matricula + " | " + a.marca + " " + a.modelo + " | " + a.valorDia + "€/dia");
        }
    }

    static void pesquisarAutomovel() {
        sc.nextLine();
        System.out.print("Matrícula: ");
        String m = sc.nextLine();

        for (int i = 0; i < totalAutomoveis; i++) {
            if (automoveis[i].matricula.equalsIgnoreCase(m)) {
                System.out.println("Encontrado: " + automoveis[i].marca + " " + automoveis[i].modelo);
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    static void eliminarAutomovel() {
        sc.nextLine();
        System.out.print("Matrícula: ");
        String m = sc.nextLine();

        for (int i = 0; i < totalAutomoveis; i++) {
            if (automoveis[i].matricula.equalsIgnoreCase(m)) {
                automoveis[i] = automoveis[totalAutomoveis - 1];
                totalAutomoveis--;
                System.out.println("Removido.");
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    // ================= CLIENTES =================

    static void menuClientes() {
        int op;
        do {
            System.out.println("\n--- CLIENTES ---");
            System.out.println("1 - Inserir");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar");
            System.out.println("4 - Eliminar");
            System.out.println("0 - Voltar");
            op = sc.nextInt();

            switch (op) {
                case 1: inserirCliente(); break;
                case 2: listarClientes(); break;
                case 3: pesquisarCliente(); break;
                case 4: eliminarCliente(); break;
            }

        } while (op != 0);
    }

    static void inserirCliente() {
        sc.nextLine();

        System.out.print("Carta de condução: ");
        String carta = sc.nextLine();

        if (existeCarta(carta)) {
            System.out.println("ERRO: Cliente já existe!");
            return;
        }

        Cliente c = new Cliente();
        c.carta = carta;

        System.out.print("Nome: ");
        c.nome = sc.nextLine();

        System.out.print("Morada: ");
        c.morada = sc.nextLine();

        System.out.print("CC: ");
        c.cc = sc.nextLine();

        clientes[totalClientes++] = c;

        System.out.println("Cliente inserido com sucesso!");
    }

    static boolean existeCarta(String carta) {
        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].carta.equalsIgnoreCase(carta)) {
                return true;
            }
        }
        return false;
    }

    static void listarClientes() {
        for (int i = 0; i < totalClientes; i++) {
            Cliente c = clientes[i];
            System.out.println(c.nome + " | Carta: " + c.carta);
        }
    }

    static void pesquisarCliente() {
        sc.nextLine();
        System.out.print("Carta: ");
        String carta = sc.nextLine();

        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].carta.equalsIgnoreCase(carta)) {
                System.out.println("Encontrado: " + clientes[i].nome);
                return;
            }
        }
        System.out.println("Não encontrado.");
    }

    static void eliminarCliente() {
        sc.nextLine();
        System.out.print("Carta: ");
        String carta = sc.nextLine();

        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i].carta.equalsIgnoreCase(carta)) {
                clientes[i] = clientes[totalClientes - 1];
                totalClientes--;
                System.out.println("Removido.");
                return;
            }
        }
        System.out.println("Não encontrado.");
    }
}