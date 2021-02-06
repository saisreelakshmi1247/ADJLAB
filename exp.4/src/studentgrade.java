package studentgrades;
import java.io.FileReader;
import java.util.ArrayList;
import au.com.bytecode.opencsv.CSVReader;
public class CSVreading {

public static void main(String[] args) {
// TODO Auto-generated method stub
CSVReader reader;
ArrayList<CSVobjects> usersList = new ArrayList<CSVobjects>();
try {
reader = new CSVReader(new FileReader("D:\\Book.csv"));
String[] newSt;
String name = null;
while ((newSt = reader.readNext()) != null) {
CSVobjects user = new CSVobjects();
user.setRedgno(newSt[0]);
user.setGrade(newSt[1]);
usersList.add(user);      
}
for (CSVobjects usr : usersList) {
String str2 = usr.getRedgno().toString();
String str1 = usr.getGrade().toString();
int count = 0;
ArrayList <String> flist=new ArrayList<String>();

for (int i = 0; i < str1.length(); i++) {
if (str1.charAt(i) == 'F') {
count++;

if(i == 6) {
flist.add(str1.substring(0,5));
}
else if(i == 14) {
flist.add(str1.substring(8,13));
}
else if(i == 22) {
flist.add(str1.substring(16,21));
}
}


}



if(count>0) {
   System.out.println("The failed subjects count of" + str2 + ":" + count);
System.out.println("The failed subjects are:");
System.out.println(flist);
}
}

} catch (Exception e) {
System.out.println(e);

}

}

}