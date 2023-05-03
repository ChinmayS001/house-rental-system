package pblkarma;
import java.io.OutputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.lang.*;
public class filevalues implements Serializable
{
    public int adver;
    public int user;
    public int h;
    
    public void load_values() {
        filevalues f = new filevalues();
        f = null;
        try {
            final FileInputStream fileIn = new FileInputStream("fv.ser");
            final ObjectInputStream in = new ObjectInputStream(fileIn);
            f = (filevalues)in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException la) {
            la.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        this.adver = f.adver;
        this.user = f.user;
        this.h = f.h;
    }
    
    public void add_Buyer() {
        filevalues f = new filevalues();
        f = null;
        try {
            final FileInputStream fileIn = new FileInputStream("fv.ser");
            final ObjectInputStream in = new ObjectInputStream(fileIn);
            f = (filevalues)in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException la) {
            la.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        final File file = new File("fv.ser");
        file.delete();
        final filevalues filevalues = f;
        ++filevalues.user;
        try {
            final FileOutputStream fileOut = new FileOutputStream("fv.ser");
            final ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(f);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in fv.ser", new Object[0]);
        }
        catch (IOException i) {
            i.printStackTrace();
        }
        System.out.println(f.user);
    }
    
    public void add_adver() {
        filevalues f = new filevalues();
        f = null;
        try {
            final FileInputStream fileIn = new FileInputStream("fv.ser");
            final ObjectInputStream in = new ObjectInputStream(fileIn);
            f = (filevalues)in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException la) {
            la.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        final File file = new File("fv.ser");
        file.delete();
        final filevalues filevalues = f;
        ++filevalues.adver;
        try {
            final FileOutputStream fileOut = new FileOutputStream("fv.ser");
            final ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(f);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in fv.ser", new Object[0]);
        }
        catch (IOException i) {
            i.printStackTrace();
        }
        System.out.println(f.adver);
    }
    
    public void add_house() {
        filevalues f = new filevalues();
        f = null;
        try {
            final FileInputStream fileIn = new FileInputStream("fv.ser");
            final ObjectInputStream in = new ObjectInputStream(fileIn);
            f = (filevalues)in.readObject();
            in.close();
            fileIn.close();
        }
        catch (IOException la) {
            la.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        final File file = new File("fv.ser");
        file.delete();
        final filevalues filevalues = f;
        ++filevalues.h;
        try {
            final FileOutputStream fileOut = new FileOutputStream("fv.ser");
            final ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(f);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in fv.ser", new Object[0]);
        }
        catch (IOException i) {
            i.printStackTrace();
        }
        System.out.println(f.adver);
    }
}