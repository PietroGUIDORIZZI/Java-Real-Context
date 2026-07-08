package Chapter2;

public class RefatoracaoVar {
    public static void main(String[] args) {
        // Uso do var: o compilador infere os tipos automaticamente
        var name = "Pietro";               // String
        var age = 31;                      // int
        var careerPercentage = 0.01;       // double
        var hasWorth = true;               // boolean

        // Exibindo os valores e seus tipos inferidos
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Tipo de 'name': %s\n", name.getClass().getSimpleName());

        System.out.printf("Idade: %d\n", age);
        // Nota: age é int (primitivo), por isso precisamos convertê-lo para Object para chamar getClass()
        System.out.printf("Tipo de 'age': %s\n", ((Object) age).getClass().getSimpleName());

        System.out.printf("Percentual do percurso: %.2f\n", careerPercentage);
        // Nota: careerPercentage (primitivo), por isso precisamos convertê-lo para Object para chamar getClass()
        System.out.printf("Tipo de 'careerPercentage': %s\n", ((Object) careerPercentage).getClass().getSimpleName());


        System.out.printf("Tem valor? %b\n", hasWorth);
        // Nota: hasWorth é bool (primitivo), por isso precisamos convertê-lo para Object para chamar getClass()
        System.out.printf("Tipo de 'hasWorth': %s\n", ((Object) hasWorth).getClass().getSimpleName());
    }
}
