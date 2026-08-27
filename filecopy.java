Import java.io.*;
Public class FileCopy
{
Public static void main(String[] args) 
{
String source = “source.txt”;
String destination = “Destination.txt”;
Try 
{
FileInputStream fin = new FileInputStream(source);
FileOutputStream fos = new FileOutputStream(destination);
Int data;
While ((data = fin.read()) != -1) 
{
Fos.write(data);
}
Fin.close();
Fos.close();
System.out.println(“File copied Successfully!!!”);
} 
Catch (FileNotFoundException e) 
{
System.out.println(“Error File Not Found!!!”);
}
Catch (IOException e)
{
System.out.println(“Error while copying File”);
}
}
}