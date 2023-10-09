package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriting {
  public static void main(String[] args) {
    new FileWriting().run();
  }

  private void run() {
    File file = new File("demo//filedemo.txt");
    try {
      PrintStream ps = new PrintStream(file);
      ps.println("File package version");
      ps.println("Bigger file2");
      ps.println();
      ps.println("Biggest file - the one to rule them all");
      ps.close();
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
