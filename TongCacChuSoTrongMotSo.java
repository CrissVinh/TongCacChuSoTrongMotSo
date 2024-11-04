
package While;

import java.util.Scanner;

public class TongCacChuSoTrongMotSo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhap mot so nguyen: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int tongphu = n;
        
        // nếu tongphu != 0 thì chia lấy dư cho 10 để lấy số cuối - cộng số cuối vào tổng - bỏ số cuối ra khỏi tổng phụ.
        while(tongphu != 0){
            // chia lấy dư cho 10 để lấy chữ số cuối cùng.
            int  number = tongphu % 10;
            
            // cộng số cuối cùng vào tổng.
            sum = sum + number;
            
            // bỏ số cuối ra khỏi tongphu.
            tongphu = tongphu / 10;
        }
        System.out.println(" tong cac chu so cua so nguyen  " + n + " la: " + sum );
        
               
    }
    
}
