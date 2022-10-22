/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fikre
 */
public class Quiz4 {
    public static void main(String[] args){
        
        //STACK OLUSTURULUYOR
        Stack stack = new Stack(6);
        
        
        //CUSTOMERLAR TANIMLANIYOR
        Customer customer1 = new Customer( 35 ,"Osman Bora Yılmazmış");
        Customer customer2 = new Customer( 109 ,"Ege Ozan ");
        Customer customer3 = new Customer( 121 ,"Ahmet Mert");
        Customer customer4 = new Customer( 2 ,"Fatma Günseven");
        Customer customer5 = new Customer( 61 ,"Cem Akkaya");
        
        //CUSTOMERLAR STACKLERİMİZE YERLESTİRİLİYOR
        stack.push(customer1);
        stack.push(customer2);
        stack.push(customer3);
        stack.push(customer4);
        stack.push(customer5);
        
        System.out.println();
        System.out.println();
        
        //CUSTOMERLAR STACK LİSTEMİZDEN ÇIKARILIYOR
        System.out.println(stack.pop() + " ID ve Ad Soyada sahip olan kişi Listeden çıkarıldı");
        System.out.println(stack.pop() + " ID ve Ad Soyada sahip olan kişi Listeden çıkarıldı");
        System.out.println(stack.pop() + " ID ve Ad Soyada sahip olan kişi Listeden çıkarıldı");
        System.out.println(stack.pop() + " ID ve Ad Soyada sahip olan kişi Listeden çıkarıldı");
        System.out.println(stack.pop() + " ID ve Ad Soyada sahip olan kişi Listeden çıkarıldı");
        
 
        
        
         
        
        

        
        


        
        
        
        
    }
    
}
