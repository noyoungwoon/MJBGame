import java.util.Scanner;

public class MJBGame {

	public static void main(String[] args) {
		//while문으로 결과 출력 이후에 다시 입력값으로 되돌아오게 설계
		boolean stop = false;
		while(!stop) {
			
		//사용자가 키보드로 값을 입력하기 위한 Scanner 객체 생성
		Scanner s = new Scanner(System.in);	
		
		System.out.println("묵/찌/빠 중에 하나를 입력하세요.");
		
		//player1에게서 묵/찌/빠 중 하나의 값을 입력받음
		System.out.println("player1 : ");
		String player1 = s.next();
		
		//player2에게서 묵/찌/빠 중 하나의 값을 입력받음
		System.out.println("player2 : ");
		String player2 = s.next();
		
		//player들의 묵/찌/빠 결과에 대한 if문
		//player1이 입력한 값과 player2가 입력한 값을 비교
		//if-else if문 안에 if-else if문
		
			if(player1.equals("묵")) {
				if(player2.equals("묵")) {
					System.out.println("비겼습니다.");
				}
				
				else if(player2.equals("찌")) {
					System.out.println("player1이 이겼습니다.");
				}
				
				else { 
					System.out.println("player1이 졌습니다.");
				}
				
				System.out.println("계속하시겠습니까? Y/N");
				String yn = s.next();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					
					if(yn.equals("N") || yn.equals("n")) {
						break;
					}
			}
			
			if(player1.equals("찌")) {
				if(player2.equals("찌")) {
					System.out.println("비겼습니다.");
				}
				
				else if(player2.equals("묵")) {
					System.out.println("player1이 졌습니다.");
				}
				
				else {
					System.out.println("player1이 이겼습니다.");
				}
				
				System.out.println("계속하시겠습니까? Y/N");
				String yn = s.next();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					
					if(yn.equals("N") || yn.equals("n")) {
						break;
					}
			}
			
			if(player1.equals("빠")) {
				if(player2.equals("찌")) {
					System.out.println("player1이 이겼습니다.");
				}
				
				else if(player2.equals("묵")) {
					System.out.println("player1이 이겼습니다.");
				}
				
				else {
					System.out.println("비겼습니다.");
				}
				
				System.out.println("계속하시겠습니까? Y/N");
				String yn = s.next();
					if(yn.equals("Y") || yn.equals("y")) {
						continue;
					}
					
					if(yn.equals("N") || yn.equals("n")) {
						break;
					}
			}
		}//while end
	}//main end
}//class end