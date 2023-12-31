package enteties;

public class Aluno {

    private final Double  Media  = 6.00;
    private String name;
    private Integer age;
    private String curse;
    private Double mediaAluno;
    private Double notaAtividadeComplementar;
    private Double notaTrabalhoGrupo;
    private Double notaProva;


    public Aluno() {
    }

    public Aluno(String name, Integer age, String curse) {
        this.name = name;
        this.age = age;
        this.curse = curse;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCurse() {
        return curse;
    }

    @Override
    public String toString() {
        return "Aluno [name=" + name + ", age=" + age + ", curse=" + curse + "]";
    }

    public void calculoMedia(){

        mediaAluno = (notaAtividadeComplementar + notaTrabalhoGrupo + notaProva) /3;


    }

    
}
