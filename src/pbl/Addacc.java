package pblkarma;
import java.io.*;
import java.lang.*;
public class Addacc {  
	int n=0;
	public void addBuyer(Buyer B){
		if(n==1) {
Buyer[] Bb = new Buyer[1000];
filevalues f = new filevalues();
f.load_values();
if (f.user != 0) {
    try {
        FileInputStream fileIn = new FileInputStream("Buyer.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        for (int i = 0; i < f.user; ++i) {
            Bb[i] = new Buyer();
            Bb[i] = (Buyer)in.readObject();
        }
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
    final File fl = new File("Buyer.ser");
    fl.delete();
}
System.out.printf("Serialized data is saved in /tmp/employee.ser", new Object[0]);
try {
    final FileOutputStream fileOut = new FileOutputStream("Buyer.ser");
    final ObjectOutputStream out = new ObjectOutputStream(fileOut);
    for (int i = 0; i < f.user; ++i) {
        out.writeObject(Bb[i]);
    }
    out.writeObject(B);
    out.close();
    fileOut.close();
    System.out.printf("Serialized data is saved in /tmp/employee.ser", new Object[0]);
}
catch (IOException j) {
    j.printStackTrace();
}
final filevalues f2 = new filevalues();
f2.add_Buyer();
System.out.println(f2.user);
}}

public void addAdver(Adver B) {

	if(n==1) {Adver[] Bb = new Adver[1000];
final filevalues f = new filevalues();
f.load_values();
if (f.adver > 0) {
    try {
        final FileInputStream fileIn = new FileInputStream("adver.ser");
        final ObjectInputStream in = new ObjectInputStream(fileIn);
        for (int i = 0; i < f.adver; ++i) {
            Bb[i] = new Adver();
            Bb[i] = (Adver)in.readObject();
        }
        in.close();
        fileIn.close();
    }
    catch (IOException la) {
        la.printStackTrace();
        return;
    }
    catch (ClassNotFoundException c) {
        System.out.println("adver class not found");
        c.printStackTrace();
    }
    final File fl = new File("Adver.ser");
    if (fl.delete()) {
        System.out.println("true");
    }
}
System.out.printf("Serialized data is saved in adver.ser", new Object[0]);
try {
    final FileOutputStream fileOut = new FileOutputStream("adver.ser");
    final ObjectOutputStream out = new ObjectOutputStream(fileOut);
    for (int i = 0; i < f.adver; ++i) {
        out.writeObject(Bb[i]);
    }
    out.writeObject(B);
    out.close();
    fileOut.close();
    System.out.printf("Serialized data is saved in adver.ser", new Object[0]);
}
catch (IOException j) {
    j.printStackTrace();
}
final filevalues f2 = new filevalues();
f2.add_adver();
}}
}
