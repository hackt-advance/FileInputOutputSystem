import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Launch{
       public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);


            while(true){
                System.out.println("Create new File - 1");
                System.out.println("Show All Files - 2");
                System.out.println("Show Files By Name - 3");
                System.out.println("Open Files By Name - 4");
                System.out.println("Delete File By Name - 5");
                System.out.println("Restore File - 6");
                System.out.println("Delete All Files - 7");
                System.out.println("Exit - 8");

                int option = sc.nextInt();
                sc.nextLine();
                
               


                switch(option){
                      case 1:
                        String string = sc.nextLine();
                        File f0 = new File("/Users/tinkusharma/FileI:0Project.java/FileFolder"+File.separator+string);
                        f0.createNewFile();
                        continue;

                       case 2:
                        //show all files inside a directory
                        File folder = new File("/Users/tinkusharma/FileI:0Project.java/FileFolder");
                        File[] files = folder.listFiles();
                         for(File file:files){
                             System.out.println(file.getName());
                         }
                         continue;

                        case 3:
                        // show all files by name
                          String str = sc.nextLine();
                          File f2 = new File("/Users/tinkusharma/FileI:0Project.java/FileFolder"+File.separator+str);
                          if(f2.exists()){
                             System.out.println("File found "+f2.getName());
                          }else{
                            System.out.println("File Not Found");
                          }
                          continue;

                        case 4:
                            //open file By name
                            String userFile = sc.nextLine();
                            File f3 = new File("/Users/tinkusharma/FileI:0Project.java/FileFolder"+File.separator+userFile);
                            if(f3.exists()){
                                FileInputStream f1 = new FileInputStream("/Users/tinkusharma/FileI:0Project.java/FileFolder"+File.separator+userFile);
                                    int i;
                                    while((i=f1.read())!=-1){
                                        System.out.print((char)i);
                                    }
                                    System.out.println();
                                    f1.close();
                            }else{
                                System.out.println("File Not Found");
                            }

                            continue;
                            // for(File fileInsideFolder:files){
                            //     String fileName = fileInsideFolder.getName();
                            //     String fileNameAfterRemExt = fileName.split(".")[0];
                            //     if(fileNameAfterRemExt.equals(userFile)){
                            //         FileInputStream f1 = new FileInputStream("/Users/tinkusharma/FileI:0Project.java/FileFolder/userFile"+".txt");
                            //         int i;
                            //         while((i=f1.read())!=-1){
                            //             System.out.println((char)i);
                            //         }
                            //         f1.close();
                            //     }
                            // }


                        case 5:
                            //delete file by name and store in the Recycle Bin
                            //copy karo aur phir paste kar do baad main file ko delete kar do file ko file ke naam se
                            String fileName = sc.nextLine();
                            //read files
                            File f4 = new File("/Users/tinkusharma/FileI:0Project.java/FileFolder"+File.separator+fileName);
                            if(f4.exists()){
                               FileInputStream  f5 = new FileInputStream(f4.getAbsolutePath());
                               byte[] b = f5.readAllBytes();
                               f5.close();
                               f4.delete();
                              

                               //same name ke sath file toh banao na
                               File file = new File("/Users/tinkusharma/FileI:0Project.java/RecycleBin"+File.separator+fileName);
                               file.createNewFile();

                               FileOutputStream f6 = new FileOutputStream("/Users/tinkusharma/FileI:0Project.java/RecycleBin"+File.separator+fileName);
                               f6.write(b);
                               f6.close();

                            }else{
                                System.out.println("File not Found");
                            }

                            continue;

                        case 6:
                            //restoring the File 

                            String fileName1 = sc.nextLine();

                            File f7 = new File("/Users/tinkusharma/FileI:0Project.java/RecycleBin"+File.separator+fileName1);
                            if(f7.exists()){
                                FileInputStream f8 = new FileInputStream(f7.getAbsolutePath());
                                byte[] b = f8.readAllBytes();
                                f8.close();
                                f7.delete();

                                File file = new File("/Users/tinkusharma/FileI:0Project.java/FileFolder"+File.separator+fileName1);
                                file.createNewFile();

                                FileOutputStream f9 = new FileOutputStream("/Users/tinkusharma/FileI:0Project.java/FileFolder"+File.separator+fileName1);
                                f9.write(b);
                                f9.close();

                            }else{
                                System.out.println("File Not Found");
                            }

                            continue;


                        case 7:
                                //delete all the files 
                                File folder1 = new File("/Users/tinkusharma/FileI:0Project.java/FileFolder");
                                File[] files1 = folder1.listFiles();

                                for(File file1:files1){
                                    file1.delete();
                                }
                                continue;
                        case 8:
                            sc.close();
                            break;
                        
                }
            }
       }
}