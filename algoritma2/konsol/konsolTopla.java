public class konsolTopla{

     public static void main(String []args){
        int toplam=0;
        for(int i=0;i<args.length;i++){
            toplam+=Integer.parseInt(args[i]);
        }
        System.out.println("konsoldan girilen sayilarin toplami="+toplam);
     }
}
