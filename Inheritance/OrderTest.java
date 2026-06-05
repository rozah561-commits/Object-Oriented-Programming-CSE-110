/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
class Order{
    int id;
    int quantity;
    double price;
    Order(int a,int b,double p){
        id=a;
        quantity =b;
        price = p;
    }
    double CalcTotal(){
        return quantity*price;
    }
    public String toString(){
        return id + "" + quantity +"" + price;
    }
}
class OnlineOrder extends Order{
    private double shippingfee;
    OnlineOrder (int a,int b, double p,double s){
        super(a,b,p);
        shippingfee = s;       
    }
    double CalcTotal(){
        return super.CalcTotal()+shippingfee;
    }
    double gets(){
        return shippingfee;
    }  
}
 class StoreOrder extends Order{
     private double discount;
     StoreOrder(int a,int b,double p, double s){
      super(a,b,p);
     discount = s;   
     }
    double CalcTotal() {
        return super.CalcTotal()-(discount/100)*super.CalcTotal();
    }
   double getD() {
       return discount;
   }
 }
public class OrderTest {
    public static void main(String[] args) {
    OnlineOrder on=new OnlineOrder(1,6,300,100);
    System.out.println(on.toString()+""+on.gets()+""+on.CalcTotal())  ;
    
    StoreOrder s=new StoreOrder(2,2,500,10);
    System.out.println(s.toString()+""+s.getD()+""+s.CalcTotal())  ;
 }
}
