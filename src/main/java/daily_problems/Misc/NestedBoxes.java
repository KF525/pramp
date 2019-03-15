package daily_problems.Misc;

import java.util.Arrays;

public class NestedBoxes {

    /*Write a program that outputs nested boxes (like russian dolls) in ASCII art.

A box may have multiple boxes inside of it, which are siblings to each other.
Those children boxes may contain their own children boxes, etc..

Children boxes can stack horizontally or vertically, but not both.

Please provide a solution with a good object-oriented design to support
this functionality. Write an implementation and corresponding client code
which uses the implementation. Client code should be reasonably simple,
and should produce different configurations with trivial changes.

The program should ideally be run via command line and
the output should print on the console when run.

Here is a hint: The client code to make one of the patterns below
might look like this:
box00 = HorizontalBox.new
  box01 = VerticalBox.new
    box03 = HorizontalBox.new
    box03.add(VerticalBox.new)
    box03.add(VerticalBox.new)
  box01.add(box03)
  box01.add(HorizontalBox.new)
  box01.add(HorizontalBox.new)
  box02 = VerticalBox.new
  box02.add(HorizontalBox.new)
  box02.add(HorizontalBox.new)
box00.add(box01)
box00.add(VerticalBox.new)
box00.add(VerticalBox.new)
box00.add(box02)
box00.draw

For aesthetic reasons we have a horizontal padding of one space
character inside and between boxes.

Examples of box configurations:

Smallest box is an empty box with one space character in it:
+-+
| |
+-+

A more complicated example:
+---------------------------------+
| +-------------+ +-+ +-+ +-----+ |
| | +---------+ | | | | | | +-+ | |
| | | +-+ +-+ | | +-+ +-+ | | | | |
| | | | | | | | |         | +-+ | |
| | | +-+ +-+ | |         | +-+ | |
| | +---------+ |         | | | | |
| | +-+         |         | +-+ | |
| | | |         |         +-----+ |
| | +-+         |                 |
| | +-+         |                 |
| | | |         |                 |
| | +-+         |                 |
| +-------------+                 |
+---------------------------------+

Variation of the previous example:
+---------------------+
| +-----------------+ |
| | +-----+ +-+ +-+ | |
| | | +-+ | | | | | | |
| | | | | | +-+ +-+ | |
| | | +-+ |         | |
| | | +-+ |         | |
| | | | | |         | |
| | | +-+ |         | |
| | +-----+         | |
| +-----------------+ |
| +-+                 |
| | |                 |
| +-+                 |
| +-+                 |
| | |                 |
| +-+                 |
| +---------+         |
| | +-+ +-+ |         |
| | | | | | |         |
| | +-+ +-+ |         |
| +---------+         |
+---------------------+

Some simple cases are supported too:
+-----------------+
| +-------------+ |
| | +---------+ | |
| | | +-----+ | | |
| | | | +-+ | | | |
| | | | | | | | | |
| | | | +-+ | | | |
| | | +-----+ | | |
| | +---------+ | |
| +-------------+ |
+-----------------+

Last example:
+-------------------------+
| +-----+ +-----+ +-----+ |
| | +-+ | | +-+ | | +-+ | |
| | | | | | | | | | | | | |
| | +-+ | | +-+ | | +-+ | |
| | +-+ | | +-+ | | +-+ | |
| | | | | | | | | | | | | |
| | +-+ | | +-+ | | +-+ | |
| | +-+ | | +-+ | | +-+ | |
| | | | | | | | | | | | | |
| | +-+ | | +-+ | | +-+ | |
| +-----+ +-----+ +-----+ |
+-------------------------+

*/

         class HorizontalBox {
            final HorizontalBox nestedBox;

            public HorizontalBox() {
                this.nestedBox = null;
            }

            public HorizontalBox(HorizontalBox box) {
                this.nestedBox = box;
            }

             String x(int n, String s) {
                String ret = "";
                for(int i = 0; i < n; i++) {
                    ret += s;
                }
                return ret;
            }


            String renderNestedBoxes() {
                if (this.nestedBox == null) return "+-+\n| |\n+-+\n";
                else {
                    String a = x(this.width(), "-");
                    return "+" + a + this.nestedBox.renderNestedBoxes() + a + "+";
                }
            }

            int width() {
                if (this.nestedBox == null) return 3;
                return 4 + this.nestedBox.width();
            }
        }

        public void main( String args[] ) {
            //renderNestedBoxes creates a leaf box
            HorizontalBox singleBox = new HorizontalBox();
            assert(singleBox.renderNestedBoxes() == ""); //String[]{"+-+", "| |", "+-+"});
            System.out.println("leafbox test passed");

            //I can add a nested box
            HorizontalBox innerBox = new HorizontalBox();
            HorizontalBox outerBox = new HorizontalBox(innerBox);
            assert(outerBox.nestedBox == innerBox);
            System.out.println("simple nested test passed");

            //width handles a simple box
            assert(singleBox.width() == 3);
            System.out.println("width simple box test passed");

            //width handles a nested box
            assert(outerBox.width() == 7);
            assert(innerBox.width() == 3);
            System.out.println("width nexted box test passed");

            //renderNestedBoxes creates a nested box
            //assert(outerbox.renderNestedBoxes() == "+-+\n| |\n+-+\n");
            //System.out.println("leafbox test passed");
        }
}

/*
/*Write a program that outputs nested boxes (like russian dolls) in ASCII art.

A box may have multiple boxes inside of it, which are siblings to each other.
Those children boxes may contain their own children boxes, etc..

Children boxes can stack horizontally or vertically, but not both.

Please provide a solution with a good object-oriented design to support
this functionality. Write an implementation and corresponding client code
which uses the implementation. Client code should be reasonably simple,
and should produce different configurations with trivial changes.

The program should ideally be run via command line and
the output should print on the console when run.

Here is a hint: The client code to make one of the patterns below
might look like this:
box00 = HorizontalBox.new
  box01 = VerticalBox.new
    box03 = HorizontalBox.new
    box03.add(VerticalBox.new)
    box03.add(VerticalBox.new)
  box01.add(box03)
  box01.add(HorizontalBox.new)
  box01.add(HorizontalBox.new)
  box02 = VerticalBox.new
  box02.add(HorizontalBox.new)
  box02.add(HorizontalBox.new)
box00.add(box01)
box00.add(VerticalBox.new)
box00.add(VerticalBox.new)
box00.add(box02)
box00.draw

For aesthetic reasons we have a horizontal padding of one space
character inside and between boxes.

Examples of box configurations:

Smallest box is an empty box with one space character in it:
+-+
| |
+-+

A more complicated example:
+---------------------------------+
| +-------------+ +-+ +-+ +-----+ |
| | +---------+ | | | | | | +-+ | |
| | | +-+ +-+ | | +-+ +-+ | | | | |
| | | | | | | | |         | +-+ | |
| | | +-+ +-+ | |         | +-+ | |
| | +---------+ |         | | | | |
| | +-+         |         | +-+ | |
| | | |         |         +-----+ |
| | +-+         |                 |
| | +-+         |                 |
| | | |         |                 |
| | +-+         |                 |
| +-------------+                 |
+---------------------------------+

Variation of the previous example:
+---------------------+
| +-----------------+ |
| | +-----+ +-+ +-+ | |
| | | +-+ | | | | | | |
| | | | | | +-+ +-+ | |
| | | +-+ |         | |
| | | +-+ |         | |
| | | | | |         | |
| | | +-+ |         | |
| | +-----+         | |
| +-----------------+ |
| +-+                 |
| | |                 |
| +-+                 |
| +-+                 |
| | |                 |
| +-+                 |
| +---------+         |
| | +-+ +-+ |         |
| | | | | | |         |
| | +-+ +-+ |         |
| +---------+         |
+---------------------+

Some simple cases are supported too:
+-----------------+
| +-------------+ |
| | +---------+ | |
| | | +-----+ | | |
| | | | +-+ | | | |
| | | | | | | | | |
| | | | +-+ | | | |
| | | +-----+ | | |
| | +---------+ | |
| +-------------+ |
+-----------------+

Last example:
+-------------------------+
| +-----+ +-----+ +-----+ |
| | +-+ | | +-+ | | +-+ | |
| | | | | | | | | | | | | |
| | +-+ | | +-+ | | +-+ | |
| | +-+ | | +-+ | | +-+ | |
| | | | | | | | | | | | | |
| | +-+ | | +-+ | | +-+ | |
| | +-+ | | +-+ | | +-+ | |
| | | | | | | | | | | | | |
| | +-+ | | +-+ | | +-+ | |
| +-----+ +-----+ +-----+ |
+-------------------------+


        import java.util.*;

class Main {

    static class HorizontalBox {
        final HorizontalBox nestedBox;

        public HorizontalBox() {
            this.nestedBox = null;
        }

        public HorizontalBox(HorizontalBox box) {
            this.nestedBox = box;
        }

        static String x(int n, String s) {
            String ret = "";
            for(int i = 0; i < n; i++) {
                ret += s;
            }
            return ret;
        }


        String renderNestedBoxes() {
            if (this.nestedBox == null) return "+-+\n| |\n+-+\n";
            else {
                String a = x(this.width, "-");
                return "+" + a + this.nestedBox.renderNestedBoxes() + a + "+";
            }
        }


        int width() {
            if (this.nestedBox == null) return 3;
            return 4 + this.nestedBox.width();
        }
    }

    static public void main( String args[] ) {
        //renderNestedBoxes creates a leaf box
        HorizontalBox singleBox = new HorizontalBox();
        assert(singleBox.renderNestedBoxes() == Arrays.list("+-+","| |","+-+"));
        System.out.println("leafbox test passed");

        //I can add a nested box
        HorizontalBox innerBox = new HorizontalBox();
        HorizontalBox outerBox = new HorizontalBox(innerBox);
        assert(outerBox.nestedBox == innerBox);
        System.out.println("simple nested test passed");

        //width handles a simple box
        assert(singleBox.width() == 3);
        System.out.println("width simple box test passed");

        //width handles a nested box
        assert(outerBox.width() == 7);
        assert(innerBox.width() == 3);
        System.out.println("width nexted box test passed");

        //renderNestedBoxes creates a nested box
        //assert(outerbox.renderNestedBoxes() == "+-+\n| |\n+-+\n");
        //System.out.println("leafbox test passed");
    }
}
*/
