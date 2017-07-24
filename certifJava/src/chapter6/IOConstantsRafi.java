package chapter6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by EBR3556 on 11/07/2017.
 */
public class IOConstantsRafi {

    private static Pattern pattern = Pattern.compile("[\"](.)*[{}]+[\"]");
    private static Matcher matcher;

    public static void main(String[] args) {
        // write your code here
        if(args.length == 0){
            System.out.print("Arguments list cannot be empty");
            System.exit(0);
        }

        String path = args[0];
        System.out.println(path);

        File directoyBase = new File(path);

        doSomethingWithDirectoryFiles(directoyBase);
    }

    private static void doSomethingWithDirectoryFiles(File directory) {
        for(File inDirectory : directory.listFiles()){
            if(inDirectory.isDirectory()){
                doSomethingWithDirectoryFiles(inDirectory);
            } else {
                doSomethingWithFile(inDirectory);
            }

        }
    }

    private static void doSomethingWithFile(File file){
        if(file.getName().toLowerCase().contains("controller") && !file.getName().toLowerCase().contains("test") && !file.getName().toLowerCase().contains(".class")){
            System.out.println(file.getName());
            try {
                getRequestMappingValues(file);
            } catch (FileNotFoundException e) {
                System.out.println("ERROR " + file.getName());
                System.out.println(e.getMessage() + file);
            }
        }
    }

    private static List<String> getRequestMappingValues(File file) throws FileNotFoundException {
        System.out.println("------ request mappings ------");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
//        Pattern pattern = Pattern.compile("[\"](.)*[{}]+[\"]");
//        Pattern pattern = Pattern.compile("[\"][a-z A-Z 0-9/{}]+[\"]");
        List<String> requestMappingList = new ArrayList<>();
        String line;
        try {
            while((line = br.readLine()) != null){
                if(line.contains("@RequestMapping") //
                        && !line.startsWith("//")){ // It is not a commented line
                    matcher = pattern.matcher(line);
//                    Matcher matcher = pattern.matcher(line);
                    if(matcher.find()){
                        requestMappingList.add(matcher.group(0).replace("\"", ""));
                        System.out.println(requestMappingList.get(requestMappingList.size()-1));
                    }
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return requestMappingList;
    }
}
