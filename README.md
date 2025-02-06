# Make your DSA life simpler with GitHubt Solutions
# DSA_Sol_Pivot_Index
This is the complete guide to solve the Pivot Index Question of an Array on LeetCode.
# Approach
First, we should take two empty integers, sum and temp.

Run a _**for loop**_ which terminates at the length of the array and calculate the sum of all the elements of the array in the sum variable.

Now, take another **for loop** which runs for the length of the array and remove a single element each time from the loop.

Add this element to the **temp** variable created before.

After every addition, check the equality between (**temp and sum**) variable, return the **index** of the element for which the equality satisfies.
