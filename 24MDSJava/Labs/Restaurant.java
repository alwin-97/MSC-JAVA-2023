public class Restaurant {
    private String[][] menu;
    private int[][] orders;
    public Restaurant(){
        this.menu=new String[][]{{"Idli","30"},{"Tea","10"},{"Coffee","20"},{"Sandwich","50"},{"Dosa","40"},{"Pasta","60"},{"Pizza","80"},{"Burger","70"},{"Soup","40"},{"Salad","35"}};
        this.orders = new int[100][10];

    }
    public void addOrder(int orderNumber,int[] items){
        if(orderNumber<1 ||orderNumber > 100 ){
            System.out.println("Invalid order number.Order number should be between 1 and 100.");
            return;

        }
        if(items.length >10){
            System.out.println("Maximum 10 items allowed per order.");

        }
        orders[orderNumber-1]=items;
        System.out.println("Order"+orderNumber+"added successfully.");
        
    }
}
