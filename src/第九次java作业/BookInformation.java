package 第九次java作业;
import java.util.*;

public class BookInformation {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> bookInfo = new HashMap<>();
        bookInfo.put("ID001", new ArrayList<>(Arrays.asList("ID001", "毛泽东思想和中国特色社会主义理论体系概论", "25.00", "高等教育出版社")));
        bookInfo.put("ID002", new ArrayList<>(Arrays.asList("ID002", "matlab程序设计教程", "42.00", "中国水利水电出版社")));
        bookInfo.put("ID003", new ArrayList<>(Arrays.asList("ID003", "汪曾祺的写作课", "39.80", "江苏文艺凤凰出版社")));
        bookInfo.put("ID004", new ArrayList<>(Arrays.asList("ID004", "意林合订本 70卷", "35.00", "意林杂志社")));
        for (String keys : bookInfo.keySet()) {
            for (String val : bookInfo.get(keys)) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
