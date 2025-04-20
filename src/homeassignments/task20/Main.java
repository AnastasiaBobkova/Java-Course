package homeassignments.task20;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        String filesPath = "C:\\Users\\anastasiya.bobkova\\Documents\\Курс Java\\Урок 20";
        FilesGenerator fileGenerator1 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator2 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator3 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator4 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator5 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator6 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator7 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator8 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator9 = new FilesGenerator(filesPath);
        FilesGenerator fileGenerator10 = new FilesGenerator(filesPath);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Future<Collection<String>> future1 = executorService.submit(fileGenerator1);
        Future<Collection<String>> future2 = executorService.submit(fileGenerator2);
        Future<Collection<String>> future3 = executorService.submit(fileGenerator3);
        Future<Collection<String>> future4 = executorService.submit(fileGenerator4);
        Future<Collection<String>> future5 = executorService.submit(fileGenerator5);
        Future<Collection<String>> future6 = executorService.submit(fileGenerator6);
        Future<Collection<String>> future7 = executorService.submit(fileGenerator7);
        Future<Collection<String>> future8 = executorService.submit(fileGenerator8);
        Future<Collection<String>> future9 = executorService.submit(fileGenerator9);
        Future<Collection<String>> future10 = executorService.submit(fileGenerator10);

        try {
            future1.get();
            future2.get();
            future3.get();
            future4.get();
            future5.get();
            future6.get();
            future7.get();
            future8.get();
            future9.get();
            future10.get();

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}