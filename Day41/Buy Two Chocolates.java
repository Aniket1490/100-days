class Solution {
    public int buyChoco(int[] prices, int money) {
        int cost=0;
       Arrays.sort(prices);
       int firstmin=prices[0];
       int secondmin=prices[1];
         if((firstmin+secondmin)==money){
                return 0;
            }
            else if((firstmin+secondmin)>money){
                return money;
            }
        else{
            cost = money-(firstmin+secondmin);
        }
        return cost;
        }
        
    }


// class Solution {
//     public int buyChoco(int[] prices, int money) {
//         int minleftover = money;
//         int firstmin=Integer.MAX_VALUE;
//         int secondmin = Integer.MAX_VALUE;
//         int cost =0;
       
//            for(int i=0;i<prices.length;i++){
//             if(firstmin > prices[i]){
//                 secondmin=firstmin;
//                 firstmin=prices[i];
//             }
//             else if(secondmin > prices[i]){
//                 secondmin=prices[i];
//             }
//             }
           
//              if((firstmin+secondmin)==money){
//                 return 0;
//             }
//             else if((firstmin+secondmin)>money){
//                 return money;
//             }
//         else{
//             cost = money-(firstmin+secondmin);
//         }
    
//   return cost ;
// }
// }
