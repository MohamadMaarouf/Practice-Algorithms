"""Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice."""


class Solution(object):
    def twoSum(nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        list=[]
        i=0
        while i<len(nums):
            j=0
            while j<len(nums) and i!=j:
                print(i)
                print(j)
                if(nums[i]+nums[j]==target):
                    list=[i,j]
                j+=1
            i+=1
        return list
    nums=[3, 3]
    target=6
    result=twoSum(nums,target)
    print(result)
    