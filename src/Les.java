import java.util.Random;

/**
 * Created by java-1-05 on 25.01.2017.
 */
public class Les {
    public static void main(String[] args){
        /*int i[] = new int[10];
        for (int j=0; j<i.length;j++){

        }*/

       int[][] arr = new int[6][7];
        Random random = new Random();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j]=random.nextInt(9-1)+1;
            }

        }
        int sort=0;
        int pos=0;
        for (int i = 0; i <arr.length ; i++,System.out.println()) {
            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]>sort){
                    sort=arr[i][j];

                    //pos=j;
                }
                System.out.print(arr[i][j]+" ");
//                if(pos+1==arr[i].length){
//                    arr[i][0]=sort;
//                }
            }

        }










       /* int[][] a = new int[6][7];
        int max = 9;
        int min = 0;
        Random rnd = new Random();
        for (int i=0;i < a.length;i++) {
            for (int j=0;j < a[i].length;j++) {
                a[i][j]=rnd.nextInt(9) + 1;
            }
        }
        int temp1 = 0;
        int pos1 = 0;
        int temp2 = 0;
        int pos2 = 0;
        for (int i=0;i < a.length;i++,System.out.println()) {
            for (int j=0;j < a[i].length;j++) {
                System.out.print(a[i][j]+" ");

                if(a[i][j]>temp1){
                    temp1 =a[i][j];
                    pos1 = j;
                }
                if(pos1+1==a[i].length){
                    a[i][0] = temp1;

                }
            }
        }*/

    }
}
