package sec02.ex05;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToStreamTest {
	public static void main(String[] args) throws Exception {
//		System.out.println(FileToStreamTest.class.getResource("student.txt").toURI()); 파일의 절대경로를 얻습니다.
		Path path = Paths.get(FileToStreamTest.class.getResource("student.txt").toURI());  //파일의 절대경로를 얻은 후, Path 객체를 얻습니다.
		Stream<String> fileStream = Files.lines(path, Charset.defaultCharset());
		fileStream.forEach(System.out::println);

	}

}
