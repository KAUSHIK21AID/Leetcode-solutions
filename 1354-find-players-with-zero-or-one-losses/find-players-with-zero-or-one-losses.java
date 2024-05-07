class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> players = new HashSet<>();
        for(int i=0;i<matches.length;i++)
        {
            players.add(matches[i][0]);
            if(hm.containsKey(matches[i][1]))
            {
                hm.put(matches[i][1],hm.get(matches[i][1])+1);
            }
            else
            {
                hm.put(matches[i][1],1);
            }
        }

        for(int i:hm.keySet())
        {
            if(players.contains(i))
                players.remove(i);
        }

        List<List<Integer>> l = new ArrayList<>();
        List<Integer>l1 = new ArrayList<>(players);

        Collections.sort(l1);

        l.add(l1);

        List<Integer> ll = new ArrayList<>();

        for(int i:hm.keySet())
        {
            if(hm.get(i)==1)
            {
                ll.add(i);
            }
        }
        Collections.sort(ll);
        l.add(ll);

        return l;
    }
}