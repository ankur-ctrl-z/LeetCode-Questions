class Solution {
    public boolean isMonotonic(int[] arr) {
      boolean increasing = false;
      boolean decreasing = false;
      int i = 0;
      int j = 1;
while (j < arr.length) {
    if (arr[i] < arr[j]) {
        increasing = true;
    } else if (arr[i] > arr[j]) {
        decreasing = true;
    }
    i++;
    j++;
}

      if(increasing == true && decreasing == true) return false;

      return true;

    }
}