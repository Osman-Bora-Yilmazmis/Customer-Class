/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fikre
 */
public class Stack {
    
    //LISTEMIZ VE CONSTANTLAR TANIMLANIYOR
    Object[ ] array;
    int index;
    int kapasite;
    
    public Stack(int kapasite)
    {
        this.kapasite = kapasite;
        array = new Object[kapasite];
    }
    //IS EMPTY METODU OLUSTURULUR
    boolean isEmpty()
    {
        return (index < 0);
    }
    
    //PUSH METODU OLUSTURULUR
    boolean push(Object x)
    {
        if (index >= (kapasite-1)) 
        {
            System.out.println("Stack Overflow hatasi");
            return false;
        }
        else
        {
            array[++index] = x;
            System.out.println(x + " ID ve Ad Soyada sahip olan kişi Listeye eklendi");
            return true;
        }
    }
    //POP METODU OLUSUTURULUR
    Object pop()
    {
        if (index < 0) 
        {
            System.out.println("Stack Underflow hatasi");
            return 0;
        }
        else 
        {
            Object x = array[index--];
            return x;
        }
    }
       
}
