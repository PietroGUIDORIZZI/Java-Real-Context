package Chapter1;


public class E1 {


        static void main(String[] args) {
            String welcome = "Bem-vindo(a)";
            String prep = "à";
            String space = " ";
            String comma = ",";
            String enterpriseName = "TechNova Sistemas";
            String name = "Pietro";
            String surname = "Guidorizzi";
            StringBuilder sb = new StringBuilder();
            sb.append(welcome);
            sb.append(space);
            sb.append(prep);
            sb.append(space);
            sb.append(enterpriseName);
            sb.append(space);
            sb.append(name);
            sb.append(space);
            sb.append(surname);
            sb.append("!");
            System.out.println(sb);
            sb.reverse();

            System.out.println(sb);
        }
    }

