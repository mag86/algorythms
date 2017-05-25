import java.io.*;
import java.util.logging.Logger;

/**
 * Created by admin on 24.05.2017.
 */
public class FileOperations1 {
    static Logger logger = Logger.getLogger(FileOperations1.class.getName());

    public static void createFile(String fileName){
        try {
            File file = new File(fileName);
            boolean isCreate = file.createNewFile();
            if (isCreate) {
                System.out.println("File has been created");
                logger.info("File has been created");
            } else {
                System.out.println("File is already presented at specified location");
                logger.info("File is alredy presented in specified location");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void deleteFile(String fileName){

            File file = new File(fileName);
            boolean isDeleted = file.delete();
            if (isDeleted) {
                System.out.println("File has been deleted");
                logger.info("File has been deleted");
            } else {
                System.out.println("File wasn't deleted");
                logger.info("File wasn't deleted");
            }




    }

    public static void copyFile(String fileName, String copyFile) {
        try (FileInputStream inputStream = new FileInputStream(fileName);
             FileOutputStream outputStream = new FileOutputStream(copyFile)) {

            if (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }
            logger.info("File " + fileName + "was copied to " + copyFile);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moveFile(String fileName, String newDestination){
        try{
            copyFile(fileName, newDestination);
            deleteFile(fileName);
        }
        catch (Exception e){
            e.printStackTrace();
            logger.info(e.getMessage());
        }


    }
    public static void showFolder(String path) {

        File f = new File(path);

        if (f.isDirectory()) {
            File[] files = f.listFiles();


            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    System.out.println("-D " + files[i]);
                }
            }
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    System.out.println("-f " + files[i]);
                }
            }
        } else {
            logger.info("This fold doesn't exist");
        }
    }


    public static void main(String[] args) {
        //FileOperations1.createFile("C:\\Users\\admin\\Downloads\\a.txt");
        //FileOperations1.deleteFile("C:\\Users\\admin\\Downloads\\a.txt");
        //FileOperations1.copyFile("C:\\Users\\admin\\Downloads\\a.txt", "C:\\Users\\admin\\Downloads\\b.txt");
        //FileOperations1.moveFile("C:\\Users\\admin\\Downloads\\a.txt", "C:\\Users\\admin\\Downloads\\newdir\\a.txt");
        FileOperations1.showFolder("C:\\Users\\admin\\Downloads\\");

    }
}
