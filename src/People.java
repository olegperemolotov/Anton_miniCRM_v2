import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.io.*;
import java.util.*;

public class People implements Serializable{
    private String name;
    private String lastname;
    static ArrayList<People> peoplelist = new ArrayList<People>();
    static ObjectOutputStream out;

    @Override
    public int hashCode(){
        return name.hashCode()+lastname.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean res=false;
        if (obj == this) {
            res = true;
            return res;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            res = false;
            return res;
        }
        if (obj.getClass() == this.getClass()) {
            People p = (People) obj;
            if (this.name.equals(p.name) && this.lastname.equals(p.lastname)) {
                res = true;
                return res;
            } else {
                res = false;
                return res;
            }
        }
        return res;
    }


    static {
        try {
            out = new ObjectOutputStream(new FileOutputStream("objects2.dat"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    People(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
        peoplelist.add(peoplelist.size(), this);
    }


    public void setnameLastname(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public void getnameLastname(){
        System.out.println(" Имя:"+this.name+" Фамилия"+this.lastname+" является элементом:"+peoplelist.indexOf(this));

    }

    public void serialize() throws IOException {
        out.writeObject(this);
    }



    public static void showpeoplelist(){
        System.out.println(peoplelist.size());
    }
}
