package homeassignments.task20;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.concurrent.Callable;

public class FilesGenerator implements Callable<Collection<String>> {
    private Collection<File> files;
    private String filesPath;

    public FilesGenerator(String filesPath) {
        this.filesPath = filesPath;
        files = new ArrayList<>();
    }

    private File generateFile (String path) {
        String fileName = generateFileName();
        File file = new File(path,fileName);

        try (FileWriter fileWriter = new FileWriter(file)) {
            String fileText = generateFileText();
            fileWriter.write(fileText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return file;
    }

    private void generateFiles (int numOfFiles) {
        for (int i = 0; i < numOfFiles; i++) {
            File file = generateFile(filesPath);
            files.add(file);
        }
    }

    private static String generateFileName() {
        return "file_" + new Random().nextInt(100000) + ".txt";
    }

    private static String generateFileText() {
        return "file_text_" + new Random().nextInt(100000);
    }

    @Override
    public Collection<String> call() throws Exception {
        System.out.println("Start " + Thread.currentThread().getName());
        Thread.sleep(new Random().nextInt(1000,3000));
        generateFiles(10);
        Collection<String> filesNames = files.stream().map(File::getName).toList();
        System.out.println(LocalDateTime.now());
        return filesNames;
    }
}