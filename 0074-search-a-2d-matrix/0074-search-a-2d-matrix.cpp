class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row = matrix.size();
        int col = matrix[0].size();
        int i=0;
        int j=col-1;
        int a=0;
        while(a<row)
        {
        if(matrix[a][j]>=target)
        {
            int st =0;
            int end = col-1;
            int mid = (st+end)/2;
            while(st<=end)
            {
                mid = (st+end)/2;
                
                if(matrix[a][mid] == target)
                    return true;
            
            else if(target>matrix[a][mid])
            {
                st=mid+1;
            }
            else
                {
                     end=mid-1;
                }
                }
            
            break;
        }
            a++;
    }
       return false;
    }
};