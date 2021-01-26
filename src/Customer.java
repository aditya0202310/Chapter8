public class Customer {
    private static int nextAccNum = 1;
    private String name;
    private int currAccNum;

    public Customer(String n) {
        name = n;
        currAccNum = nextAccNum;
        nextAccNum++;
    }

    public String toString(double s){
        return name + ", " + "account number" + nextAccNum + ", " + "please pay" + s;
    }
    public static int getNextAccNum(){
        return nextAccNum;
    }
    public void updateName(String name){
        this.name = name;
    }
    public static void main(String[] args){
        Customer new1 = new Customer("Jacob");
        System.out.println(Customer.getNextAccNum());
    }
}


