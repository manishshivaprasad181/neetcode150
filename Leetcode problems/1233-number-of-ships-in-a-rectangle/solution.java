/**
 * // This is Sea's API interface.
 * // You should not implement it, or speculate about its implementation
 * class Sea {
 *     public boolean hasShips(int[] topRight, int[] bottomLeft);
 * }
 */

class Solution {
    public int countShips(Sea sea, int[] topRight, int[] bottomLeft) {
        // Base case: If the rectangle has no area, return 0.
        if (topRight[0] < bottomLeft[0] || topRight[1] < bottomLeft[1] || !sea.hasShips(topRight, bottomLeft)) {
            return 0;
        }

        // Base case: If the rectangle contains only one point, return 1 if there is a ship, else return 0.
        if (topRight[0] == bottomLeft[0] && topRight[1] == bottomLeft[1]) {
            return sea.hasShips(topRight, bottomLeft) ? 1 : 0;
        }

        // Divide the rectangle into four sub-rectangles and count the ships in each sub-rectangle.
        int midX = (bottomLeft[0] + topRight[0]) / 2;
        int midY = (bottomLeft[1] + topRight[1]) / 2;

        int count = 0;

        count += countShips(sea, new int[]{midX, midY}, bottomLeft); // Bottom-left sub-rectangle
        count += countShips(sea, topRight, new int[]{midX + 1, midY + 1}); // Top-right sub-rectangle

        count += countShips(sea, new int[]{midX, topRight[1]}, new int[]{bottomLeft[0], midY + 1}); // Top-left sub-rectangle
        count += countShips(sea, new int[]{topRight[0], midY}, new int[]{midX + 1, bottomLeft[1]}); // Bottom-right sub-rectangle

        return count;
        
    }
}
