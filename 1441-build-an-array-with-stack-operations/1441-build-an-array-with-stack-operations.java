class Solution {
    public List<String> buildArray(int[] target, int n) {
    List<String> newStack = new ArrayList<>();
    int aradChuckon = 0;
    for (int i = 1; i <= n && aradChuckon < target.length; i++) {
        newStack.add("Push");
        if (target[aradChuckon] != i)
            newStack.add("Pop");
        else
            aradChuckon++;
    }
    return newStack;
    }
}