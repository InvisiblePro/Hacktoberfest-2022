//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.


class Solution {
public:
    bool search1d(int matrix[],int target){
        int start=0;
        int end=n-1;
        while(start<=end){
        mid=(start+end)/2;
        if(matrix[mid]==target) return true;
        if(target < matrix[mid]) high=mid-1;
        else low=mid+1;
        }
        return false
    }
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
     int m=matrix.length;
     int n=matrix[i].length;
     int low=0;
     int high=m-1;
     while(low<=high){
     int mid=(low+high)/2;
     if(k>= matrix[mid][0] && k<=matrix[mid][n-1]) return search1d(martix[mid],k);
     if(k>matrix[mid][0]) {
        low=mid+1;
     }   
     else{
         high=mid-1;
     }
     }   
    }
};
