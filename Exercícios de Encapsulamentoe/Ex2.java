class Funcionario {
    private String nome;
    private String matricula;
    private String cargo;
    private double salarioBase;
    private double beneficios;

    public Funcionario(String nome, String matricula, String cargo, double salarioBase, double beneficios) {
        this.nome = nome;
        this.matricula = matricula;
        setCargo(cargo);
        setSalarioBase(salarioBase);
        setBeneficios(beneficios);
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase >= 0) {
            this.salarioBase = salarioBase;
        } else {
            System.out.println("O salário base não pode ser negativo.");
        }
    }

    public void setBeneficios(double beneficios) {
        if (beneficios >= 0) {
            this.beneficios = beneficios;
        } else {
            System.out.println("Os benefícios não podem ser negativos.");
        }
    }
    
    public void setCargo(String cargo) {
        if (cargo != null && !cargo.trim().isEmpty()) {
            this.cargo = cargo;
        } else {
            System.out.println("Erro: Cargo não pode ser nulo ou vazio.");
        }
    }

    public void aplicarAjuste(double percentual) {
        double novoSalarioBase = this.salarioBase + (this.salarioBase * percentual);
        if (novoSalarioBase >= 0) {
            this.salarioBase = novoSalarioBase;
        } else {
            System.out.println("O ajuste resultaria em um salário negativo.");
        }
    }

    public void promover(String novoCargo, double aumentoPercentual) {
        setCargo(novoCargo);
        aplicarAjuste(aumentoPercentual);
        System.out.println("Novo salário base: R$ " + String.format("%.2f", this.salarioBase));
    }

    public double salarioBruto() {
        return this.salarioBase + this.beneficios;
    }
}

class FolhaPagamento {
    private static final double INSS = 0.10;
    private static final double TAXA_SINDICAL = 0.03;

    public double calcularDescontos(Funcionario f) {
        double salarioBruto = f.salarioBruto();
        double descontoINSS = salarioBruto * INSS;
        double taxaSindical = salarioBruto * TAXA_SINDICAL;
        return descontoINSS + taxaSindical;
    }

    public double salarioLiquido(Funcionario f) {
        return f.salarioBruto() - calcularDescontos(f);
    }

    public String gerarHolerite(Funcionario f) {
        double salarioBruto = f.salarioBruto();
        double descontos = calcularDescontos(f);
        double salarioLiquido = salarioLiquido(f);

        StringBuilder holerite = new StringBuilder();
        holerite.append("Funcionário: ").append(f.getNome()).append("\n");
        holerite.append("Matrícula: ").append(f.getMatricula()).append("\n");
        holerite.append("Cargo: ").append(f.getCargo()).append("\n");
        holerite.append("------------------------------------------\n");
        holerite.append(String.format("Salário Bruto: R$ %.2f\n", salarioBruto));
        holerite.append(String.format("Total de Descontos: R$ %.2f\n", descontos));
        holerite.append(String.format("Salário Líquido: R$ %.2f\n", salarioLiquido));
        return holerite.toString();
    }
}

public class RHApp {

    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Ana Silva", "001", "Desenvolvedor Júnior", 3500.00, 500.00);
        Funcionario f2 = new Funcionario("Bruno Costa", "002", "Analista de RH", 4200.00, 300.00);
        Funcionario f3 = new Funcionario("Carlos Souza", "003", "Gerente de Projetos", 8000.00, 1500.00);
        
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        FolhaPagamento folha = new FolhaPagamento();

        System.out.println("--- Holerites Iniciais ---");
        System.out.println(folha.gerarHolerite(f1));
        System.out.println(folha.gerarHolerite(f2));
        System.out.println(folha.gerarHolerite(f3));
        
        f1.promover("Desenvolvedor Pleno", 0.20); 
        
        System.out.println("\n--- Holerite Após a Promoção ---");
        System.out.println(folha.gerarHolerite(f1));
        
        System.out.println("\n--- Aplicação de Ajuste Negativo ---");
        f2.aplicarAjuste(-0.05); 
        System.out.println("\n--- Holerite Após o Ajuste ---");
        System.out.println(folha.gerarHolerite(f2));

        System.out.println("\n--- Tentativa de Ajuste Inválido ---");
        f2.setSalarioBase(100); 
        f2.aplicarAjuste(-0.50); 
        f2.setSalarioBase(100);
        f2.aplicarAjuste(-1.10); 
        
        System.out.println("\n--- Top 1 do Mês (Maior Salário Líquido) ---");
        Funcionario top1 = encontrarMaiorSalarioLiquido(funcionarios, folha);
        if (top1 != null) {
            System.out.println("O funcionário com o maior salário líquido é: " + top1.getNome());
            System.out.println(folha.gerarHolerite(top1));
        }
    }
    
    public static Funcionario encontrarMaiorSalarioLiquido(List<Funcionario> funcionarios, FolhaPagamento folha) {
        if (funcionarios.size() == 0) {
            System.out.println("A lista de funcionários está vazia.");
            return null;
        }
        
        Funcionario maior = funcionarios.get(0);
        for (Funcionario f : funcionarios) {
            if (folha.salarioLiquido(f) > folha.salarioLiquido(maior)) {
                maior = f;
            }
        }
        return maior;
    }
}
