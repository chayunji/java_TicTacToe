package tictactoe;

import java.util.Scanner;

public class InputClass {
   //char �迭�� �ƴ϶� int �迭�̶� �Ķ���� �����ϰڽ��ϴ�!
	//static ���� �Ƚᵵ �ɰŰ��ƿ�
   public int input(int[][] user, int[][] com) {
      
      Scanner kb = new Scanner(System.in);
      int number;
      
      do {
         System.out.println("<<Input number>>");
         number = kb.nextInt();
         //close�߰��߽��ϴ�.
         kb.close();
      }while(check(number, user, com) == false);
      kb.close();
      return number;
      
   }
   //int�迭�� �����ϰڽ��ϴ�
   //static ���� �Ƚᵵ �ɰŰ��ƿ�
   private boolean check (int num, int[][] user, int[][] com) {

      int row ;
      int column ;
      
      switch(num) {
      case 1:
         row = 0;
         column = 0;
         break;
      case 2:
         row = 0;
         column = 1;
         break;
      case 3:
         row = 0;
         column = 2;
         break;
      case 4:
         row = 1;
         column = 0;
         break;
      case 5:
         row = 1;
         column = 1;
         break;
      case 6:
         row = 1;
         column = 2;
         break;
      case 7:
         row = 2;
         column = 0;
         break;
      case 8:
         row = 2;
         column = 1;
         break;
      case 9:
         row = 2;
         column = 2;
         break;
      default:
         row = -1;
         column = -1;   
      }
      //..?���⹺��..�̻��ѰŰ��ƿ� 
      if(row < 0) {
         System.out.println(num + ": NO Number!!");
         return false;
      }else {
    	  if(1==user[row][column]) {
    		  System.out.println("It's already exist-user");
    		  return false;
    	  }
    	  else if(1==com[row][column]) {
    		  System.out.println("It's already exist-com");
    		  return false;
    	  }
    	  else
    		  return true;
  
         
      }
   }
   


}
