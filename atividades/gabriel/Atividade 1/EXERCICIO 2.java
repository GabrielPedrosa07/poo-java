// Exercício 2
// Nome: Gabriel Pedrosa
// Período: 3º Período

class Aluno {
    private String nome;
    private String matricula;
    private double notaFinal;

    public Aluno(String nome, String matricula, double notaFinal) {
        this.nome = nome;
        
        if (matricula.length() >= 5) {
            this.matricula = matricula;
        } else {
            System.out.println("Matricula invalida. Precisa ter 5 ou mais letras.");
            this.matricula = "00000";
        }
        
        if (notaFinal >= 0 && notaFinal <= 10) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("Nota invalida. Tem que ser entre 0 e 10.");
            this.notaFinal = 0;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void exibirDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota: " + notaFinal);
    }
}

class Exercicio2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel", "12345", 8.0);
        a1.exibirDados();
        
        Aluno a2 = new Aluno("Lucas", "123", 9.0);
        a2.exibirDados();
        
        Aluno a3 = new Aluno("Ana", "98765", 15.0);
        a3.exibirDados();
    }
}
