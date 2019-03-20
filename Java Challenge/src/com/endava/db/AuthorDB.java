package com.endava.db;

import com.endava.model.Author;
import com.endava.utils.DataBase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AuthorDB {
    public static  ArrayList<Author> findAuthor(int id, String name, String birthDate){
        ArrayList<Author> result = new ArrayList<Author>();
        try {
            Connection conn = DataBase.getConnection();
            Statement statement = null;
            ResultSet reg;
            String sentence = "select * from author where ";

            if (id>=0){
                sentence+=" id ="+id+" AND ";
            }

            if (!(name.equals(null)||name.equals(""))){
                sentence+=" name = '"+name+"' AND";
            }

            sentence+=" 1=1";

            statement = conn.createStatement();
            System.out.println(sentence);
            reg = statement.executeQuery(sentence);

            while (reg.next()){
                Author a = new Author(reg.findColumn("id"));
                a.setName(reg.getString(reg.findColumn("name")));
                a.setBirthDate(reg.getString(reg.findColumn("birthdate")));
                result.add(a);
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
