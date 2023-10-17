class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
      Set<Integer> s = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        if(n == 1)
            return true;
            int root = findRoot(n, leftChild,rightChild);
         if(root == -1) return false;
        q.add(root);
        while(!q.isEmpty()) {
            int parent = q.poll();
            if(s.contains(parent)) {
                return false;
            } else {
                s.add(parent);
                if(leftChild[parent] != -1) {
                    q.add(leftChild[parent]);
                }
                if(rightChild[parent] != -1) {
                    q.add(rightChild[parent]);
                }
            }
        }
        return s.size() == n;
}
 static int findRoot(int n, int[] leftChild, int[] rightChild)
    {
        int count = 0;
        int[] ind = new int[n];
        int root = -1;
         for(int i=0;i<n;i++)
        {
           if(rightChild[i] != -1)
           {
               ind[rightChild[i]]++;
           }
           if(leftChild[i] != -1)
           {
               ind[leftChild[i]]++;
           }
        }
        for(int i=0;i<n;i++)
        { 
            if(ind[i] == 0)
            {
                count++;
                root = i;
            }
        }
        return count == 1?root:-1;
    } 
}