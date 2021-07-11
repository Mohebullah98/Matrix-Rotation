
class Main {
  public static void RotateMatrix(int [][]Matrix){
    if(Matrix.length!=Matrix[0].length|| Matrix.length<1){
      System.out.print("Conditions for nxn matrix not met");
      return;
    }
    int temp =0;
    int n= Matrix.length;
    for(int i=0;i<n/2;i++){//start from outer layer of matrix
      for(int j=i;j<n-1-i;j++){
        temp=Matrix[i][j]; //Save the top value
        Matrix[i][j]=Matrix[n-1-j][i]; //Move left to Top
        Matrix[n-1-j][i]=Matrix[n-1-i][n-1-j];//Move bottom to left
        Matrix[n-1-i][n-1-j]=Matrix[j][n-1-i];//Move right to bottom
        Matrix[j][n-1-i]=temp; //Move top to right
      }
    }
  }
  public static void printMatrix(int M[][]){
    for(int i=0;i<M.length;i++){
      for(int j=0;j<M[0].length;j++){
        System.out.print(M[i][j]+" ");
      }
      System.out.print("\n");
    }
  }
  public static void main(String[] args) {
    int Matrix[][]= new int[][] {{4,6,7,3}, {3,8,9,4},{1,2,3,4},{4,9,8,7}};
    System.out.print("Original Matrix\n");
    printMatrix(Matrix);
    RotateMatrix(Matrix);
    System.out.print("Rotated Matrix\n");
    printMatrix(Matrix);
  }
}