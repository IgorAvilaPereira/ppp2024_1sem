package apresentacao;

import java.util.ArrayList;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Query {
    private ArrayList<String> tables;
    private String where;
    private String tipoJoin;

    @Override
    public String toString() {
        if (tipoJoin == null) return "select * from " + tables.get(0) + " where " + where + ";";
        
        String sql = "select * from ";
        for(int i = 0; i < this.tables.size(); i++){
            if (i < this.tables.size() - 1) {
                sql += tables.get(i) + " "+tipoJoin+" ";
            } else {
                sql += tables.get(i) + " ";   
            }
        }
        return sql  + ((where != null) ? " where " + where + ";" : ";");
    }  


    

}
