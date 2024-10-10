public class App {
    public static void main(String[] args) throws Exception {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.err.println("数字を入力");
        int n = scan.nextInt();
        fb(n);
    }
    public static void fb(int a){
        for(int i=1;i<=a;i++){
            int Fizz = i % 3;
            int Bazz = i % 5;
            
            if (Fizz==0 && Bazz==0){
                System.err.println("Fizz Bazz");        
            }else if(Fizz==0){
                System.err.println("Fizz");
        
            }else if (Bazz==0) {
                System.err.println("Bazz");
            }else{
                System.err.println(i);
            }

        }

    }
}
