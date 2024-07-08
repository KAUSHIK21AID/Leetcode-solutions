class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> friends = new ArrayList<>();
        int start = 0;

        for (int i = 1; i <= n; i++) {
            friends.add(i);
        }

        while (friends.size() > 1) {
            start = (start + k - 1) % friends.size();
            friends.remove(start);
        }

        return friends.get(0);
    }

//     class Solution {
//     int ans = 0;
//     int start = 0;
//     List<Integer> l = new ArrayList<>();
//     public void removeguys(int k){
//         if (start + k - 1 >= l.size()) {
//             l.remove((start + k - 1) % l.size());
//             start = 0;
//         }
//         else{
//             l.remove(start+k-1);
//             start = start + k-1;
//         }
//     }
//     public int findTheWinner(int n, int k) {
//         for(int i=1;i<=n;i++){
//             l.add(i);
//         }
//         while(l.size()!=1){
//             removeguys(k);
//             System.out.print(l.size());
//             System.out.println(l.get(0));
//             if(l.size()==1)
//                 ans = l.get(0);
//             if(ans!=0){
//                 break;
//             }
//         }

//         return ans;
//     }
// }
}