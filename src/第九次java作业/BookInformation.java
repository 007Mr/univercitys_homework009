package �ھŴ�java��ҵ;
import java.util.*;

public class BookInformation {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> bookInfo = new HashMap<>();
        bookInfo.put("ID001", new ArrayList<>(Arrays.asList("ID001", "ë��˼����й���ɫ�������������ϵ����", "25.00", "�ߵȽ���������")));
        bookInfo.put("ID002", new ArrayList<>(Arrays.asList("ID002", "matlab������ƽ̳�", "42.00", "�й�ˮ��ˮ�������")));
        bookInfo.put("ID003", new ArrayList<>(Arrays.asList("ID003", "��������д����", "39.80", "�������շ�˳�����")));
        bookInfo.put("ID004", new ArrayList<>(Arrays.asList("ID004", "���ֺ϶��� 70��", "35.00", "������־��")));
        for (String keys : bookInfo.keySet()) {
            for (String val : bookInfo.get(keys)) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

    }
}
