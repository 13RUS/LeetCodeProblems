#include <iostream>
#include <vector>

class Solution {
public:
    std::vector<int> twoSum(std::vector<int>& nums, int target) {
        std::vector<int> indices;
        bool founded = false;
        int firstindex = 0;
        int secondindex = 0;

        for (int i = 0; i < nums.size(); i++) {
            int current = nums[i];
            firstindex = i;
            //std::cout << "firstindex: " << firstindex;
            int delta = target - current;

            for (int j=0; j<nums.size(); j++) {
                if (j == firstindex) {
                    j++;
                }
                if (nums[j] == delta) {
                    secondindex = j;
                    founded = true;
                    break;
                }
            }

            if (founded == true) { break; }
        }
        indices.push_back(firstindex);
        indices.push_back(secondindex);
        return indices;
    }
};

void VectorPrint (std::vector<int>& result){
    std::cout << "\nResult: ";

    for (int i = 0; i < result.size(); i++) {
        std::cout << result[i] << " ";
    }
}

int main() {

    Solution inidices;
    std::vector<int> nums;
    int target;
    std::vector<int> result;

    nums = {2,7,11,15};
    target = 9;
    result = inidices.twoSum(nums, target);
    VectorPrint(result);


    nums = {3,2,4};
    target = 6;
    result = inidices.twoSum(nums, target);
    VectorPrint(result);

    nums = {3,3};
    target = 6;
    result = inidices.twoSum(nums, target);
    VectorPrint(result);

}