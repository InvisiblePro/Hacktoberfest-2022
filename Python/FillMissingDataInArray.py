import numpy as np 
nums = np.array([[31, 2, np.nan, 11],
                [10, np.nan, 12, 18],
                [15, np.nan, 10, np.nan]])
print("Original array:") 
print(nums)
print("\nFind the missing data of the said array:")
print(np.isnan(nums))
new=np.isnan(nums)
for i in range (0,len(new)):
    for j in range(0,len(new[i])):
        if(new[i][j]==True):
            nums[i][j]=0
print(nums)