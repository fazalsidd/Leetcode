class Solution {
ArrayList<Integer> sequentialDigits(int low, int high) {
  ArrayList<Integer> result = new ArrayList<>();

  for (int i = 1; i <= 9; i++) {
    int current = i;

    for (int j = i + 1; j <= 9; j++) {
      current = current * 10 + j;

      if (current >= low && current <= high) {
        result.add(current);
      }
    }
  }
    Collections.sort(result);
  return result;
}
}