package tictactoe;

import java.util.Random;

public class Computer {
	private int level;
	int return_result;
	
	Random random = new Random();
	
	public Computer(){
		this.level = 1;
	}
	
	public Computer(int level){
		this.level = level;
	}
	
<<<<<<< HEAD
	public void computerInput(int[][] map){
		// 1순위 승리할 수 있는 기회가 있는지 먼저 확인한다. 
=======
	public void run(int[][] map) {
		if (level == 1)
			randomInput(map);
//		else if (level == 2) {
//			int[][] cacheMap = new int[3][3];
//			for (int i = 0; i < 3; i++) {
//				for (int j = 0; j < 3; j++) {
//					cacheMap[i][j] = map[i][j];
//				}
//			}
//			int result = tempInput(map, -1);
//			System.out.println(result);
//			if (result == -1) {
//				System.out.println("Fail");
//			}
//			map[result / 3][result % 3] = -1;
//		}
		else if (level == 3)
			computerInput(map);
	}
	
	private void randomInput(int[][] map) {
		int n = random.nextInt(9);
		while(map[n / 3][n % 3] != 0)
			n = random.nextInt(9);
		
		map[n / 3][n % 3] = -1;
	}
	
//	private int tempInput(int[][] map, int turn) {
//		// If there is winner, this is end position of recursion.
//		// If winner is computer get BENEFIT, if not get PANELITY.
//		LogicCheck check = new LogicCheck();
//		int result;
//		if ((result = check.ScoreCheck(map)) != 0) {
//			if (result == 2) // If winner is computer
//				return 100;
//			else	// If winner is user
//				return -100;
//		}
//		
//		HashMap<Integer, Integer> max = new HashMap<Integer, Integer>();
//		
//		
//		// Iterate all BLANK position to set piece in turn.
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				if (map[i][j] == 0) {
//					// turn variable means user or computer's  piece.
//					// Set the piece on the board, and recursion.
//					map[i][j] = turn;
//					// Change turn
//					turn = (turn == -1) ? 1 : -1;
//					return_result += tempInput(map, turn);
//					System.out.println(return_result);
//					if (return_result > max) { 
//						max = return_result;
//						maxIndex = i * 3 + j;
//					}
//				}
//			}
//		}
//		
//		return maxIndex;
//	}
	
	public void computerInput(int[][] map){
		// 1�닚�쐞 �듅由ы븷 �닔 �엳�뒗 湲고쉶媛� �엳�뒗吏� 癒쇱�� �솗�씤�븳�떎. 
>>>>>>> c5709047d73b86168aaef554dc993cac478d0540
		if(chkChance(map) != 9 && chkOvrlap(map, chkChance(map)/3, chkChance(map)%3) == false){
			map[chkChance(map)/3][chkChance(map)%3] = -1;
		 }
		 
		 else{
<<<<<<< HEAD
		      // 3순위 위험요소가 하나도 없는 경우, 먼저 가장 중간에 둔다. 꼭지점이 그 다음으로 두고, 마지막 랜덤으로 둔다. 
		       if(chkDanger(map) == 9){
		    	   // 중간
		    	   if(chkOvrlap(map, 1, 1) == false){
		    		   map[1][1] = -1;
		    	   }
		    	   // 꼭지점
=======
		      // 3�닚�쐞 �쐞�뿕�슂�냼媛� �븯�굹�룄 �뾾�뒗 寃쎌슦, 癒쇱�� 媛��옣 以묎컙�뿉 �몦�떎. 瑗�吏��젏�씠 洹� �떎�쓬�쑝濡� �몢怨�, 留덉��留� �옖�뜡�쑝濡� �몦�떎. 
		       if(chkDanger(map) == 9){
		    	   // 以묎컙
		    	   if(chkOvrlap(map, 1, 1) == false){
		    		   map[1][1] = -1;
		    	   }
		    	   // 瑗�吏��젏
>>>>>>> c5709047d73b86168aaef554dc993cac478d0540
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
<<<<<<< HEAD
		    	   // 랜덤
=======
		    	   // �옖�뜡
>>>>>>> c5709047d73b86168aaef554dc993cac478d0540
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
		       
<<<<<<< HEAD
		       // 2순위 위험요소가 있는 경우. 위험요소를 제거하는 방향으로 놓는다. 단, 자리가 모두 찼을 때는 다른 곳을 모색한다. 
=======
		       // 2�닚�쐞 �쐞�뿕�슂�냼媛� �엳�뒗 寃쎌슦. �쐞�뿕�슂�냼瑜� �젣嫄고븯�뒗 諛⑺뼢�쑝濡� �넃�뒗�떎. �떒, �옄由ш�� 紐⑤몢 李쇱쓣 �븣�뒗 �떎瑜� 怨녹쓣 紐⑥깋�븳�떎. 
>>>>>>> c5709047d73b86168aaef554dc993cac478d0540
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
	
	//而댄벂�꽣媛� �쐞�뿕�긽�솴�쓣 媛먯�� 
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