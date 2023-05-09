package airportManagement.src.main.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import airportManagement.src.main.exceptions.*;

public class FileHandler {

    private List<String> lines;

    public FileHandler() {
        this.lines = new ArrayList<>();
    }

    public List<String> loadFileContent(String path) throws EmptyException {
        if (isPathEmpty(path)) {
            throw new EmptyException();
        }

        File file = new File(path);
        if (!file.exists()) {
            System.err.println("File not found");
            return null;
        }

        return readFileContent(path);

    }

    private boolean isPathEmpty(String path) {
        return path.isEmpty();
    }

    private List<String> readFileContent(String path) {
        BufferedReader input = null;
        try {
            input = new BufferedReader(new FileReader(path));
            try {
                String line;
                int lineNumber = 0;
                while ((line = input.readLine()) != null) {
                    this.lines.add(line);
                    System.out.printf("%s %d %s %s %s", "Content of Line", lineNumber, ":", line,
                            System.lineSeparator());
                    lineNumber++;
                }
            } catch (IOException e) {
                System.err.println("Error reading file");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.err.println("Error closing file");
                }
            }
        }
        return this.lines;
    }
}
