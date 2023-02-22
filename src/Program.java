public class Program {
    public static void main(String[] args){
        System.out.println("Hello World!");

        int cislo = cislo(5, 6);
    }
    
    
    public static int cislo(int first, int second){

        if (first > second)
        {
            return 1;  
        }
        
        else if (second > first)
        {
            return -1;
        }
        
       else {
            return 0;
        }
        
        

    }

}
