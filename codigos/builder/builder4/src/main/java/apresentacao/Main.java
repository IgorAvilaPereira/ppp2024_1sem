package apresentacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tables = new ArrayList<String>();
        tables.add("pessoa");
        Query q =  Query.builder().tables(tables).where(" id = 1").build();
        System.out.println(q);

        tables.add("dependente");

        Query q2 = Query.builder().tables(tables).tipoJoin("inner join").build();
        System.out.println(q2);

    }
}