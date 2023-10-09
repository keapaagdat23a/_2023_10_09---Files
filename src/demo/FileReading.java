package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
  public static void main(String[] args) {
    new FileReading().run();
  }

  private void run() {
    File file = new File("demo//filedemo.txt");
    try {
      Scanner inFile = new Scanner(file);
      while(inFile.hasNextLine()) {
        String s = inFile.nextLine();
        System.out.println("[" + s + "]");
      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
