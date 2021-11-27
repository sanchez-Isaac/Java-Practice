package client;

//To make this class completely generic, we need to specify the type of data
//That this class will have
public class Container <i1, i2> {
    i1 item1;
    i2 item2;
    public Container(i1 item1, i2 item2) {
        super();
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems() {
        System.out.println("Printing items Container");
        System.out.println("Item1: " + item1);
        System.out.println("Item2: " + item2);
    }

    public i1 getItem1() {return item1;}
    public void setItem1(i1 item1) {this.item1 = item1;}
    public i2 getItem2() {return item2;}
    public void setItem2(i2 item2) {this.item2 = item2;	}


}
