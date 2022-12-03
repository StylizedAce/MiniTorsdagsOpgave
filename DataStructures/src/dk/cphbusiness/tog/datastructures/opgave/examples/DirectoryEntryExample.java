package dk.cphbusiness.tog.datastructures.opgave.examples;

import dk.cphbusiness.tog.datastructures.opgave.*;

import java.util.Scanner;

public class DirectoryEntryExample {
    DirectoryImpl aDirectory = new DirectoryImpl("root");
    DirectoryEntryImpl dir = new DirectoryImpl("bruh");
    FileImpl aFile;


    String[] opt = {"create file", "create directory (folder)", "choose file"};

    public void opgaveFlow() {
        options(opt);

        int choice = Integer.parseInt(getUserInput("What would you like to do? "));

        switch (choice){
            case 1: {
                aDirectory.addChild(createFile());
                opgaveFlow();
                break;

            }
            case 2: {
                String folderName = getUserInput("What should the folder be called?");
                DirectoryImpl newFolder = new DirectoryImpl(folderName);
                String fileName = getUserInput("You have to at least create a file inside this folder to make it. Name a file: ");
                DirectoryEntry newFile = new FileImpl(fileName, "bruh");
                newFolder.addChild(newFile);
                aDirectory.addChild(newFolder);
                opgaveFlow();
                break;
            }

            case 3: {
                int i = 1;
                for (DirectoryEntry d: aDirectory.getChildren()) {
                    System.out.println(i + ". " + d.getName());
                    i++;
                }
                int chooseint = Integer.parseInt(getUserInput("Choose one of these files"));
                chooseFile(chooseint);
                getUserInput("press enter to return from this file: ");
                opgaveFlow();
                break;


            }



        }
    }



    public void options(String[] opt) {
        int i = 1;
        for(String s : opt) {

            System.out.println(i + ". " + s);
            i++;
        }
    }


    public String getUserInput(String msg) {
        System.out.println(msg);
        Scanner userInput = new Scanner(System.in);
        String line = userInput.nextLine();
        return line;
    }


    public String getUserInput() {
        Scanner userInput = new Scanner(System.in);
        String line = userInput.nextLine();
        return line;
    }

public File createFile () {
    String extension="";
    String name = getUserInput("choose a filename");
    if (!(name.contains(".txt") || name.contains(".csv"))) {

        while (!(extension.equals(".txt")) || !(extension.equals(".csv"))) {
            extension = getUserInput("should the file be .txt or .csv?");
            if (extension.equals(".txt")) {
                extension = ".txt";
                break;
            }
            if (extension.equals(".csv")) {
                extension = ".csv";
                break;
            }

            getUserInput("filetype is not valid");
        }
    }

    String content = getUserInput("what should " + name + " contain?");
    return new FileImpl(name + extension, content);

}
public void chooseFile(int index) {
        // choose a file
    System.out.println("-------------------------------");
    System.out.println(aDirectory.getChildren(index-1));
    System.out.println("-------------------------------");
}

}

/*
Method {
    presents options to user
            1. choose filedirectory (name)
            2. create file (with name)
            3. browse directories (?)

}

 */
