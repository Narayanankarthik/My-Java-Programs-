import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

import java.util.StringTokenizer;


/*
 * Created on Aug 4, 2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author pranavam.s
 *
 * TODO To change the template for this generated type comment go to Window -
 * Preferences - Java - Code Style - Code Templates
 */
public class Application{
 public static void main(String[] args) throws IOException {
  
  //String sourceFileDirectory = "D:/SVN SOURCE/K3-BOI/Source/";
  //String targetJavaDirectory = "D:/workspace/EQUITY/EQUITY SRC/src/";
  //String targetWebDirectory = "D:/workspace/EQUITY/EQUITY JSP/WebContent/";
	 
//	String sourceFileDirectory = "C:/Users/kesavan.gopal/Desktop/Alrajhi/Source/Source/";
//	String targetJavaDirectory = "D:/PYMNTS_DEV/ALTRAJHI_CON/src/";
//	String targetWebDirectory = "D:/PYMNTS_DEV/ALTRAJHI_WEB/WebContent/";
	 
	// C:\Users\kesavan.gopal\Desktop\Alrajhi\K1K3\Merged\Merged\Source
	 //C:\\Users\\kesavan.gopal\\Desktop\\Alrajhi\\Alrajhi3\\Source\\
	String sourceFileDirectory = "D:\\K1K3\\Merged\\Merged\\Source";
	//C:\Users\kesavan.gopal\Desktop\Alrajhi\Alrajhi_Rpp\Source
	//Alrajhi\SVN - Alrajhi2\Source
	String targetJavaDirectory = "D:\\PYMNTS_DEV\\Alrajhi_Rpp1\\src\\";
	String targetWebDirectory = "D:\\PYMNTS_DEV\\Alrajhi_Rpp1\\WebContent\\";
  /*String sourceFileDirectory1 = "D:/SVN SOURCE/K1-NEW/Source/";
 String targetJavaDirectory1 = "D:/workspace/EQUITY/K1 SRC/src/";
  String targetWebDirectory1 = "D:/workspace/EQUITY/K1 JSP/WebContent/";
  String sourceFileDirectory2 = "D:/SVN SOURCE/EQUITY-K4/Source/";
  String targetJavaDirectory2 = "D:/workspace/EQUITY/K4 EQUITY/src/";
  String targetWebDirectory2 = "D:/workspace/EQUITY/K4 JSP/WebContent/";*/
  String exceptionJavaDirectory = "";
  String exceptionWebDirectory = "";
  
  
  //String sourceFileDirectory = "D:/Projects/BCA/BCA Source/Source/";
  //String targetFileDirectory = "C:/Documents and Settings/boobathi.ayyasamy/My Documents/ECLIP_PROJ/NBAD_FULL/src/";
  //String targetFileDirectory = "D:\\Projects\\workspace\\BCACoreJava\\src\\";
  //String coreJavaTargetFileDirectory = "D:/Projects/BCA/BCA Source/CoreJava/";
  //String coreRITargetFileDirectory = "D:/Projects/BCA/BCA Source/CoreRI/";
  //String targetWebDirectory = "D:\\Projects\\BCA\\BCA Web\\";
  
  
  
  copyJavaFiles(sourceFileDirectory, targetJavaDirectory, getFilesList(exceptionJavaDirectory));
  copyWebFiles(sourceFileDirectory, targetWebDirectory, getFilesList(exceptionWebDirectory));
  //copyCoreJavaFiles(sourceFileDirectory, coreJavaTargetFileDirectory);
  //copyCoreRIFiles(sourceFileDirectory, coreRITargetFileDirectory);
  /*copyJavaFiles(sourceFileDirectory1, targetJavaDirectory1, getFilesList(exceptionJavaDirectory));
  copyWebFiles(sourceFileDirectory1, targetWebDirectory1, getFilesList(exceptionWebDirectory));
  copyJavaFiles(sourceFileDirectory2, targetJavaDirectory2, getFilesList(exceptionJavaDirectory));
  copyWebFiles(sourceFileDirectory2, targetWebDirectory2, getFilesList(exceptionWebDirectory));
  */
 }
 
 /**
  * Copies all the Java files that are in java directory of each module in the given source directory
  * @param sourceFileDirectory
  * @param targetFileDirectory
  * @throws IOException
  */
 public static void copyCoreJavaFiles(String sourceFileDirectory, String targetFileDirectory) throws IOException {
  File sourceFile = new File(sourceFileDirectory);
  for (File file : sourceFile.listFiles()) {
   //System.out.println("$$$$"+file.getName());
   if (file.isDirectory()) {
    for (File subFile : file.listFiles()) {
     //System.out.println("####"+subFile.getName());
     if (subFile.isDirectory() && subFile.getName().equalsIgnoreCase("java")) {
      System.out.println("Moving Java Files from "+file.getName());
      copyJavaFiles(subFile.getAbsolutePath()+"\\", targetFileDirectory, null);
     }
    }
   }
  }
 }
 
 /**
  * Copies all the Java files that are in ejb directory of each module from the given source directory
  * @param sourceFileDirectory
  * @param targetFileDirectory
  * @throws IOException
  */
 public static void copyCoreRIFiles(String sourceFileDirectory, String targetFileDirectory) throws IOException {
  File sourceFile = new File(sourceFileDirectory);
  for (File file : sourceFile.listFiles()) {
   //System.out.println("$$$$"+file.getName());
   if (file.isDirectory()) {
    for (File subFile : file.listFiles()) {
     //System.out.println("####"+subFile.getName());
     if (subFile.isDirectory() && subFile.getName().equalsIgnoreCase("ejb")) {
      System.out.println("Moving Java Files from "+file.getName());
      copyJavaFiles(subFile.getAbsolutePath()+"\\", targetFileDirectory, null);
     }
    }
   }
  }
 }
 
 /**
  * Copies all the Java Files from the given source directory
  * @param sourceFileDirectory
  * @param targetFileDirectory
  * @param exceptionFiles - The files that need to be excluded from copying
  * @throws IOException
  */
 public static void copyJavaFiles(String sourceFileDirectory, String targetFileDirectory, List<String> exceptionFiles) throws IOException {
  long startTime = new Date().getTime();
  int totalFiles = 0;
  File testFile = new File(sourceFileDirectory);
  File arrayFile[] = null;
  Stack stack = new Stack();
  stack.add(testFile);
  
  System.err.println("Copying Java Files from " + sourceFileDirectory+" to "+targetFileDirectory);
  while (!stack.isEmpty()) {
   testFile = (File) stack.pop();
   if (testFile.isFile()) {
    if (testFile.getName().indexOf(".java") >= 0 && testFile.getName().indexOf(".bak") == -1) {
     if (exceptionFiles!=null && exceptionFiles.contains(testFile.getName())) {
      System.err.println(testFile.getName()+" ignored.");
      continue;
     }
     System.out.print("File " + testFile.getAbsoluteFile());
     totalFiles ++;
     moveFile(testFile, targetFileDirectory);
     System.out.println();
    }
   } else if (testFile.isDirectory()) {
    arrayFile = testFile.listFiles();
    for (int i = 0; i < arrayFile.length; i++) {
     stack.add(arrayFile[i]);
    }
   }
  }
  long endTime = new Date().getTime();
  System.err.println("Total Files " + totalFiles);
  System.err.println("Processing Time " + ((endTime - startTime) / 1000) + " Seconds.");
 }
 
 

 /**
  * Moves file from source directory to target directory
  * @param fileName
  * @param sourceFileDirectory
  * @param targetDirectory
  * @throws IOException
  */
 private static void moveFile(File file, String targetDirectory) throws IOException {
  Reader reader = null;
  BufferedReader dis = null;
  String strTmp = null;
  boolean st = false;
  File fle = null;
  String sourceFile = file.getAbsolutePath();
  String fileName = file.getName();
  reader = new FileReader(sourceFile);
  dis = new BufferedReader(reader);
  BufferedWriter dos = null;
  String buffer = null;
  st = false;
  int semiColon = 0;
  while (true) {
   strTmp = dis.readLine();
   if (strTmp == null)
    break;
   if (strTmp.indexOf("//package") != -1)
    continue;
   if (strTmp.indexOf("package") != -1&&strTmp.indexOf(";") != -1) {
    strTmp = strTmp.trim();
    semiColon = strTmp.indexOf(";");
    if (semiColon >= 0) {
     strTmp = strTmp.substring(0, semiColon);
     strTmp = strTmp.trim();
    }
    strTmp = findPackageName(strTmp);
    System.out.print(" : " + strTmp);
    st = true;
    break;
   }
  }
  String tDir = null;
  tDir = targetDirectory;
  if (st) {
   List lst = getTokens(strTmp, ".");
   fle = null;
   Iterator it = lst.listIterator();
   String tmp;
   while (it.hasNext()) {
    tmp = it.next().toString();
    tDir = tDir.concat(tmp + "/");
    fle = new File(tDir);
    fle.mkdir();
   }
  }
  dis.close();
  
  dis = new BufferedReader(new FileReader(file));
  dos = new BufferedWriter(new FileWriter(tDir + "/" + fileName));

  while (true) {
   buffer = dis.readLine();
   if (buffer == null) {
    break;
   }
   buffer += "\n";
   dos.write(buffer);
  }
  dis.close();
  dos.close();
 }

 /**
  *
  * @param token
  * @param sep
  * @return
  */
 public static List getTokens(String token, String sep) {
  List myList = new ArrayList();

  StringTokenizer stk = new StringTokenizer(token, sep);

  while (stk.hasMoreTokens()) {
   myList.add(stk.nextToken());
  }
  return myList;
 }

 /**
  *
  * @param packageName
  * @return
  */
 private static String findPackageName(String packageName) {
  int index = packageName.indexOf("package") + 8;
  packageName = packageName.substring(index);
  packageName = packageName.substring(0, packageName.length());
  return packageName.trim();
 }
  
 /**
  * Lists all the Java files in the given source directory
  * @param sourceFileDirectory
  * @return
  * @throws IOException
  */
 private static List<String> getFilesList(String sourceFileDirectory) throws IOException {
  int totalFiles = 0;
  File testFile = new File(sourceFileDirectory);
  File arrayFile[] = null;
  Stack stack = new Stack();
  stack.add(testFile);
  List<String> filesList = new ArrayList<String>();
  while (!stack.isEmpty()) {
   testFile = (File) stack.pop();
   if (testFile.isFile()) {
    if (testFile.getName().indexOf(".bak") == -1) {
     //System.out.print("File " + testFile.getAbsoluteFile());
     totalFiles ++;
     System.out.println(testFile.getName());
     filesList.add(testFile.getName());
    }
   } else if (testFile.isDirectory()) {
    arrayFile = testFile.listFiles();
    for (int i = 0; i < arrayFile.length; i++) {
     stack.add(arrayFile[i]);
    }
   }
  }
  return filesList;
 }
 
 public static void copyFolder(File src, File dest, List<String> exceptionFiles)
  throws IOException{
 
  if(src.isDirectory()){
 
   //if directory not exists, create it
   if(!dest.exists()){
      dest.mkdir();
      System.out.println("Directory copied from "
                           + src + "  to " + dest);
   }
 
   //list all the directory contents
   String files[] = src.list();
 
   for (String file : files) {
      //construct the src and dest file structure
      File srcFile = new File(src, file);
      File destFile = new File(dest, file);
      //recursive copy
      copyFolder(srcFile,destFile,exceptionFiles);
   }
 
  }else{
   
   if (exceptionFiles!=null && exceptionFiles.contains(src.getName())) {
    System.out.println("Ignoring file "+src.getName());
    return;
   }
   
   //if file, then copy it
   //Use bytes stream to support all file types
   InputStream in = new FileInputStream(src);
          OutputStream out = new FileOutputStream(dest);
 
          byte[] buffer = new byte[1024];
 
          int length;
          //copy the file content in bytes
          while ((length = in.read(buffer)) > 0){
          out.write(buffer, 0, length);
          }
 
          in.close();
          out.close();
          System.out.println("File copied from " + src + " to " + dest);
  }
 }

 public static void copyWebFiles(String sourceFileDirectory, String targetFileDirectory, List<String> exceptionFiles) throws IOException {

  File srcFolder = new File(sourceFileDirectory);
  File destFolder = new File(targetFileDirectory);
  //list all the directory contents
  String files[] = srcFolder.list();
  
  for (String file : files) {
   //construct the src and dest file structure
   File srcFile = new File(srcFolder, file+"/web");
   //File destFile = new File(destFolder, "web");
   if (srcFile.exists()) {
    //recursive copy
    copyFolder(srcFile,destFolder,exceptionFiles);
    System.out.println("Directory copied from "
                     + file + "  to " + destFolder);
   }
   
  }
 }
}
