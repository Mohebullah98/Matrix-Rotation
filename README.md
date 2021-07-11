# Matrix-Rotation
Program to rotate nxn matrix by 90 degrees clockwise.

This is an optimal algorithm that rotates an nxn Matrix in O(n^2) time and O(1) space.
What the algorithm does is rotate elements on a layer by layer basis. Starting from the outer layer of the matrix, we store the top value and move the corresponding left side value to the top value and then the bottom value to the left...
Finally we move the stored top value to the right. And continue the process into the next layer, which will be much smaller than the previous layer.
