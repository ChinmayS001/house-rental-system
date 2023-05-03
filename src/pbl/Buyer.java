package pblkarma;
import java.io.*;
import java.lang.*;
public class Buyer implements Serializable{
            public String username;
            public String pss;
            public String phno;
            public String ocn;
            public String othspecs;
            int age;
            		Buyer(){}
            Buyer(String username,String pss, String phno, String ocn,String othspecs, int age){
            	this.username = username;
            	this.pss = pss;
            	this.phno = phno;
            	this.ocn = ocn;
            	this.age = age;
            }
}
