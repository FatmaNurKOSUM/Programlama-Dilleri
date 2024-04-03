package bagli_sirala;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bagli_Sirala {
    public static void main(String[] args) {
        List<Node> dizi1 = new ArrayList<>();
         List<Node> dizi2 = new ArrayList<>();
        List<Node> dizi3 = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Bagli_Sirala\\src\\bagli_sirala\\dosya.txt"))) {
            String line;
            int adres = 0;
            while ((line = br.readLine()) != null) {
                int data = Integer.parseInt(line.trim());
                dizi1.add(new Node(data, adres));
                dizi2.add(new Node(data,adres));
                dizi3.add(new Node(data,adres++));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

       dizi1= bubbleSort(dizi1);

        for (int i = 0; i < dizi1.size(); i++) {
            
           for(int j=0;j<dizi1.size() ;j++){
               if(dizi1.get(i).data== dizi3.get(j).data){
                   dizi3.get(j).adres= dizi1.get(i).adres;
               }
               
           }
        }
       
             System.out.println("Siralanmamis Bagli Liste\tSiralanmis Bagli Liste");
            System.out.println("data\tAdres\t\t\tdata\tAdres");
            for (int i = 0; i < dizi3.size(); i++) {
                Node node = dizi3.get(i);
                Node ilk= dizi2.get(i);
                System.out.println(ilk.data + "\t" + ilk.adres+ "\t\t\t" +  node.data + "\t" + node.adres );
            }
    }

    // Bubble sort algoritması
    public static List<Node> bubbleSort(List<Node> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
            
                if (list.get(j).data < list.get(minIndex).data) {
                    minIndex = j;
                }
            }
            // Swap işlemi sadece adresler için
            int tempAddress = list.get(minIndex).adres;
            list.get(minIndex).adres = list.get(i).adres;
            list.get(i).adres = tempAddress;

            // Verileri dağınık hale getirmek için swap işlemi yapalım
            Node temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
}


