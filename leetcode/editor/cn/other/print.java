package other;

public class print {

    static   Node  header = null;
    public static Node creat(int[] in){



        for (int i=0;i<in.length;i++){
           Node  newnode = new Node();
           newnode.setData(in[i]);
            if (header == null){
                header = newnode;
            }else {
                newnode.setNext(header);
                header = newnode;
            }
        }
        return header;
    }

   public static void print(Node node){
        if(node != null ){
            System.out.println(header.getData());
           if (header.getNext() != null) {
               header = header.getNext();
               print(header);
           }
        }

   }

    public static void main(String[] args) {
        int[] in = {1,2,3,4};
        print(creat(in));
    }


}
