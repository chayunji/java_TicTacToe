package tictactoe;

import java.util.Random;

public class Computer {
	private int level;
	
	Random random = new Random();
	
	public Computer(){
		this.level = 1;
	}
	
	public Computer(int level){
		this.level = level;
	}
	
	public void computerInput(int[][] map){
		// 1���� �¸��� �� �ִ� ��ȸ�� �ִ��� ���� Ȯ���Ѵ�. 
		if(chkChance(map) != 9 && chkOvrlap(map, chkChance(map)/3, chkChance(map)%3) == false){
			map[chkChance(map)/3][chkChance(map)%3] = -1;
		 }
		 
		 else{
		      // 3���� �����Ұ� �ϳ��� ���� ���, ���� ���� �߰��� �д�. �������� �� �������� �ΰ�, ������ �������� �д�. 
		       if(chkDanger(map) == 9){
		    	   // �߰�
		    	   if(chkOvrlap(map, 1, 1) == false){
		    		   map[1][1] = -1;
		    	   }
		    	   // ������
		    	   else if(chkOvrlap(map, 0, 0) == false){
		    		   map[0][0] = -1;
		    	   }
		    	   else if(chkOvrlap(map, 2, 2) == false){
		    		   map[2][2] = -1;
		    	   }
		    	   else if(chkOvrlap(map, 0, 2) == false){
		    		   map[0][2] = -1;
		    	   }
		    	   else if(chkOvrlap(map, 2, 0) == false){
		    		   map[2][0] = -1;
		    	   }
		    	   // ����
		    	   else{
		    		   while(true){
		    			   int computer = random.nextInt();
		    			   int i = Math.abs(computer % 3);
		    			   computer = Math.abs(random.nextInt());
		    			   int j = Math.abs(computer % 3);
		    			   if(chkOvrlap(map, i, j) == false){
		    				   map[i][j] = -1;
		    				   break;
		    			   }
		    		   }
		    	   }
		       	}
		       
		       // 2���� �����Ұ� �ִ� ���. �����Ҹ� �����ϴ� �������� ���´�. ��, �ڸ��� ��� á�� ���� �ٸ� ���� ����Ѵ�. 
		       else{
		           if(chkOvrlap(map, chkDanger(map)/3, chkDanger(map)%3) == false){
		        	   map[chkDanger(map)/3][chkDanger(map)%3] = -1;
		           }
		           else{
		               while(true){
		               int computer = Math.abs(random.nextInt());
			           int i = computer % 3;
			           computer = Math.abs(random.nextInt());
			           int j = computer % 3;
		                if(chkOvrlap(map, i, j) == false){
		                    map[i][j] = -1;
		                    break;
		                 }
		               }
		           }
		       }
		       
		   }
		 	 
	}
	
	//��ǻ�Ͱ� �����Ȳ�� ���� 
	int chkDanger(int map[][]){
		 if((map[0][0] == 1 && map[0][1] == 1) || (map[0][0] == 1 && map[0][2] == 1) || (map[0][1] == 1 && map[0][2] == 1)){
		        for(int j = 0; j < 3; j++){
		        	int i = 0;
		            if(chkOvrlap(map, i, j) == false){
		                return 3*i+j;
		            }
		        }
		    }
		    if((map[1][0] == 1 && map[1][1] == 1) || (map[1][0] == 1 && map[1][2] == 1) || (map[1][1] == 1 && map[1][2] == 1)){
		    	for(int j = 0; j < 3; j++){
		    		int i = 1;
		            if(chkOvrlap(map, i, j) == false){
		                return 3*i+j;
		            }
		        }
		    }
		    if((map[2][0] == 1 && map[2][1] == 1) || (map[2][0] == 1 && map[2][2] == 1) || (map[2][1] == 1 && map[2][2] == 1)){
		        for(int j = 0; j < 3; j++){
		        	int i = 2;
		            if(chkOvrlap(map, i, j) == false){
		                return 3*i+j;
		            }
		        }
		    }
		    if((map[0][0] == 1 && map[1][0] == 1) || (map[0][0] == 1 && map[2][0] == 1) || (map[1][0] == 1 && map[2][0] == 1)){
		        for(int i = 0; i < 3; i++){
		        	int j = 0;
		            if(chkOvrlap(map, i, j) == false){
		                return 3*i+j;
		            }
		        }
		    }
		    if((map[0][1] == 1 && map[1][1] == 1) || (map[0][1] == 1 && map[2][1] == 1) || (map[1][1] == 1 && map[2][1] == 1)){
		        for(int i = 0; i < 3; i++){
		        	int j = 1;
		            if(chkOvrlap(map, i, j) == false){
		                return 3*i+j;
		            }
		        }
		    }
		    if((map[0][2] == 1 && map[1][2] == 1) || (map[0][2] == 1 && map[2][2] == 1) || (map[1][2] == 1 && map[2][2] == 1)){
		        for(int i = 0; i < 3; i++){
		        	int j = 2;
		            if(chkOvrlap(map, i, j) == false){
		                return 3*i+j;
		            }
		        }
		    }
		    if((map[0][0] == 1 && map[1][1] == 1) || (map[0][0] == 1 && map[2][2] == 1) || (map[1][1] == 1 && map[2][2] == 1)){
		        for(int i = 0; i < 3; i++){
		        	int j = i;
		            if(chkOvrlap(map, i, j) == false){
		                return 3*i+j;
		            }
		        }
		    }
		    if((map[0][2] == 1 && map[1][1] == 1) || (map[0][2] == 1 && map[2][0] == 1) || (map[1][1] == 1 && map[2][0] == 1)){
		    	if(chkOvrlap(map, 0, 2) == false){
		    		return 2;
		    	}
		    	else if(chkOvrlap(map, 1, 1) == false){
		    		return 4;
		    	}
		    	else if(chkOvrlap(map, 2, 0) == false){
		    		return 6;
		    	}
		    }
		    return 9;
	}

	int chkChance(int map[][]){
	    if((map[0][0] == -1 && map[0][1] == -1) || (map[0][0] == -1 && map[0][2] == -1) || (map[0][1] == -1 && map[0][2] == -1)){
	        for(int j = 0; j < 3; j++){
	        	int i = 0;
	            if(chkOvrlap(map, i, j) == false){
	                return 3*i+j;
	            }
	        }
	    }
	    if((map[1][0] == -1 && map[1][1] == -1) || (map[1][0] == -1 && map[1][2] == -1) || (map[1][1] == -1 && map[1][2] == -1)){
	    	for(int j = 0; j < 3; j++){
	    		int i = 1;
	            if(chkOvrlap(map, i, j) == false){
	                return 3*i+j;
	            }
	        }
	    }
	    if((map[2][0] == -1 && map[2][1] == -1) || (map[2][0] == -1 && map[2][2] == -1) || (map[2][1] == -1 && map[2][2] == -1)){
	        for(int j = 0; j < 3; j++){
	        	int i = 2;
	            if(chkOvrlap(map, i, j) == false){
	                return 3*i+j;
	            }
	        }
	    }
	    if((map[0][0] == -1 && map[1][0] == -1) || (map[0][0] == -1 && map[2][0] == -1) || (map[1][0] == -1 && map[2][0] == -1)){
	        for(int i = 0; i < 3; i++){
	        	int j = 0;
	            if(chkOvrlap(map, i, j) == false){
	                return 3*i+j;
	            }
	        }
	    }
	    if((map[0][1] == -1 && map[1][1] == -1) || (map[0][1] == -1 && map[2][1] == -1) || (map[1][1] == -1 && map[2][1] == -1)){
	        for(int i = 0; i < 3; i++){
	        	int j = 1;
	            if(chkOvrlap(map, i, j) == false){
	                return 3*i+j;
	            }
	        }
	    }
	    if((map[0][2] == -1 && map[1][2] == -1) || (map[0][2] == -1 && map[2][2] == -1) || (map[1][2] == -1 && map[2][2] == -1)){
	        for(int i = 0; i < 3; i++){
	        	int j = 2;
	            if(chkOvrlap(map, i, j) == false){
	                return 3*i+j;
	            }
	        }
	    }
	    if((map[0][0] == -1 && map[1][1] == -1) || (map[0][0] == -1 && map[2][2] == -1) || (map[1][1] == -1 && map[2][2] == -1)){
	        for(int i = 0; i < 3; i++){
	        	int j = i;
	            if(chkOvrlap(map, i, j) == false){
	                return 3*i+j;
	            }
	        }
	    }
	    if((map[0][2] == -1 && map[1][1] == -1) || (map[0][2] == -1 && map[2][0] == -1) || (map[1][1] == -1 && map[2][0] == -1)){
	    	if(chkOvrlap(map, 0, 2) == false){
	    		return 2;
	    	}
	    	else if(chkOvrlap(map, 1, 1) == false){
	    		return 4;
	    	}
	    	else if(chkOvrlap(map, 2, 0) == false){
	    		return 6;
	    	}
	    }
		return 9;
	}
	
	boolean chkOvrlap(int map[][], int i, int j){
	    if(map[i][j] == 0){
	        return false;
	    }
	    else{
	        return true;
	    }
	}
}