package Arrayjava;

public class linearsearch {
    public static int linearsearch(int numbers[],int key) {
        for( int i = 0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = 10;

        int index= linearsearch(numbers,key);
        if( index==-1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index :" + index);
        }
    }
}
