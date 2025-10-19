class Solution {
    public int addDigits(int num) {
        int result = 0;
        while(num > 9){
            while(num > 0){
            result += num % 10;
            num /= 10;
            }
            num = result;
            result = 0;
        }
        return num;
    }
}
// class Solution {
//     public int addDigits(int num) {
//         int sum=0;
//         while(num>=10){
//             sum=0;
//             while(num>0){
//                 int temp=num%10;
//                 sum+=temp;
//                 num/=10;
//             }
//             num=sum;
//         }
//         return num;
//     }
// }