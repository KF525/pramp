package daily_problems.Problem61;

public class IntegerExponentiation {
/*
Implement integer exponentiation. That is, implement the pow(x, y) function, where x and y are integers and returns x^y.

Do this faster than the naive method of repeated multiplication.

For example, pow(2, 10) should return 1024.
*/

    public int pow(int x, int y) {
        if (y == 0) return 1;
        if (y == 1) return x;
        if (y % 2 == 0 ) { //even
            return pow(x, y/2) * pow(x, y/2);
        } else {
            return x * pow(x, y/2) * pow(x, y/2);
        }
    }
}

/*
static int count = 0;
  static int startingY = 0;

  static int powNaive(int x, int y) {
    if (y == 0) return 1;
    return x * powNaive(x, y-1);
  }

  static int pow(int x, int y) {
    if (startingY < y) {
      startingY = y;
    }

    if(y == 0)
      return 1;
    if (y == 1) {
      return x;
    }
    if(y % 2 == 0) { // y is even
      int halfy = pow(x, y / 2);
      count++;
      if (y == startingY) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("count: " + count);
        count = 0;
        startingY = 0;
      }
      return halfy * halfy;
    } else { //y is odd
      int halfy = pow(x, y / 2);
      count += 2;
      if (y == startingY) {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("count: " + count);
        count = 0;
        startingY = 0;
      }
      return halfy * halfy * x;
    }
  }

  static public void main( String args[] ) {
    assert(pow(2,10) == 1024); // pow(2,10) => 6 multiplications
    assert(pow(2,3) == 8);
    assert(pow(3,5) == 243);
    pow(3,20);

    //assert(powNaive(2,10) == 1024);
    //assert(powNaive(2,3) == 8);
    //assert(powNaive(3,5) == 243);

    System.out.println("success!");
  }
 */