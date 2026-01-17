import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) return result;

        // First row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // Build remaining rows
        for (int i = 1; i < numRows; i++) {

            List<Integer> prevRow = result.get(i - 1);
            List<Integer> row = new ArrayList<>();

            row.add(1); // first element

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1); // last element
            result.add(row);
        }

        return result;
    }
}
