
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gino
 */
public interface CRUDInterface {
     
    /**
     * 
     */
    public abstract ArrayList getAllTable(String name_table);
    
    
    
    /**
     * 
     */
    public abstract ArrayList getAllTableDependency(int id_dependency, String name_table, String name_table_dependency);
    
    
    /**
     * 
     */
    public abstract ArrayList getOneByIdTable(int id, String name_table);
    
    
    /**
     * @param  String
     * @return void
     * this function delete a ligne in a table of our DB
     */
    public abstract void deleteTable(int id, String name_table) ;

    
    /**
     * @param  String, String, String, int
     * @return void
     * this function delete a ligne in a table of our DB
     */
    public abstract void setTable(String name_table, String[] values);
    
    
    /**
     * @param  String, String, String, int
     * @return void
     * this function delete a ligne in a table of our DB
     */
    public abstract void updateTable(String name_table, String[] values, int id_row);
    
    
    /**
     * @param  String
     * @return void
     * this function delete a ligne in a table of our DB
     */
    public abstract void deleteTableWithDependency(int id_dependency, String name_table, String name_table_dependency) ;
}

}
